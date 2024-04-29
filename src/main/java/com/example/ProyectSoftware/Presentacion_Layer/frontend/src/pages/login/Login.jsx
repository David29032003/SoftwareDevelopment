import "./Login.css"
import { useRef, useState, useEffect, useContext } from 'react';
import AuthContext from "./components/AuthProvider";

import axios from '../../utils/axios';
const LOGIN_URL = '/user/login';

const Login = () => {
    
    const { auth, setAuth } = useContext(AuthContext);
    const userRef = useRef();
    const errRef = useRef();

    const [email, setEmail] = useState('');
    const [pwd, setPwd] = useState('');
    const [errMsg, setErrMsg] = useState('');
    const [success, setSuccess] = useState(false);

    useEffect(() => {
        userRef.current.focus();
    }, [])

    useEffect(() => {
        setErrMsg('');
    }, [email, pwd])

    // Función para manejar el envío
    const handleSubmit = async (e) => {
        e.preventDefault();
        setErrMsg(''); // Limpiar mensajes de error previos
    
        try {
            const response = await axios.post(LOGIN_URL,
                JSON.stringify({ email, password: pwd }),
                {
                    headers: { 'Content-Type': 'application/json' },
                    withCredentials: true
                }
            );
    
            // Manejo de la respuesta exitosa
            handleSuccessResponse(response);
        } catch (err) {
            console.log("Error de junior:", err);
            handleError(err);
        }
    }
    
    // Función para manejar la respuesta exitosa
    const handleSuccessResponse = (response) => {
        console.log("Autenticación exitosa", JSON.stringify(response?.data));
        const { accessToken } = response?.data;
        setAuth({ email, accessToken });
        setSuccess(true);
        setErrMsg(''); // Limpiar el mensaje de error
        setEmail('');
        setPwd('');
       
    }
    
    // Función para manejar los errores
    const handleError = (err) => {
        if (!err?.response) {
            setErrMsg('No Server Response');
        } else if (err.response?.status === 400) {
            setErrMsg('Missing Username or Password');
        } else if (err.response?.status === 401) {
            setErrMsg('Unauthorized');
        } else {
            setErrMsg('Login Failed');
        }
        errRef.current.focus();
    }
    
    return (
        <div className="bod-login">
            {success ? (
                <section>
                    <h1>You are logged in!</h1>
                    <br />
                    <p>
                        <a href="/">Go to Home</a>
                    </p>
                </section>
            ) : (
                <section>
                    <p ref={errRef} className={errMsg ? "errmsg" : "offscreen"} aria-live="assertive">{errMsg}</p>
                    <h1>Login</h1>
                    <form onSubmit={handleSubmit}>
                        <label htmlFor="email">mail:</label>
                        <input
                            type="text"
                            id="email"
                            ref={userRef}
                            autoComplete="off"
                            onChange={(e) => setEmail(e.target.value)}
                            value={email}
                            required
                        />

                        <label htmlFor="password">PASSWORD:</label>
                        <input
                            type="password"
                            id="password"
                            onChange={(e) => setPwd(e.target.value)}
                            value={pwd}
                            required
                        />
                        <button className="botonlogin">Login</button>
                    </form>
                    <p>
                        {/* router link here for login */}
                        Need an Account?<br />
                        <span className="line"> 
                            {/*put router link here*/}
                            <a href="/register">Sign Up</a>
                        </span>
                    </p>
                </section>
            )}
        </div>
    )
}

export default Login