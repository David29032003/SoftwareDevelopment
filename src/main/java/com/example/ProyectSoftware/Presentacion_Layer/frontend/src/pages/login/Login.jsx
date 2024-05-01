import "./Login.css"
import { useRef, useState, useEffect, useContext } from 'react';
import AuthContext from "./components/AuthProvider";
import { useNavigate } from "react-router-dom";


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
    const navigate = useNavigate(); // Hook para manejar la navegación


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
        navigate('/lobby');// Navegar a la ruta del lobby
       
    }
    
    // Función para manejar los errores
    const handleError = (err) => {
        if (!err?.response) {
            setErrMsg('No Server Response');// No hay respuesta del servidor
        } else if (err.response?.status === 400) {
            setErrMsg('Missing Username or Password');// Falta el nombre de usuario o la contraseña
        } else if (err.response?.status === 401) {
            setErrMsg('Unauthorized');// Credenciales incorrectas
        } else {
            setErrMsg('Login Failed');// Otro error 
        }
        errRef.current.focus();
    }
    
    return (
        <div className="bod-login">
            {/* mostrar el formulario de inicio */}
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
                       
                       ¿Necesitas una cuenta ?<br />
                        <span className="line"> 
                            {/* router link para el  registro */}
                            <a href="/register">Registrate</a>
                        </span>
                    </p>
                </section>
            
        </div>
    )
}

export default Login