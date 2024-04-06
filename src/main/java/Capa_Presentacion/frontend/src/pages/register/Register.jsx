import React, { useState } from 'react';
import './Register.css';

function Register() {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [username, setUsername] = useState('');

    const handleRegister = (e) => {
        e.preventDefault();
        // Aquí agregarías la lógica para manejar el registro del usuario
        console.log('Registro:', { email, password, username });
    };

    return (
        <div className="register-container">
            <form onSubmit={handleRegister} className="register-form">
                <h1>Sign Up</h1>
                <label htmlFor="email">EMAIL ADDRESS</label>
                <input
                    id="email"
                    type="email"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                />
                <label htmlFor="password">PASSWORD</label>
                <input
                    id="password"
                    type="password"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                />
                <label htmlFor="username">USERNAME</label>
                <input
                    id="username"
                    type="text"
                    value={username}
                    onChange={(e) => setUsername(e.target.value)}
                />
                <span>Esto es lo que verán tus amigos y otros jugadores cuando juegues</span>
                <button type="submit">Registrarme</button>
                <footer>
                    <p>Al registrarme, acepto los <a href="/terms">Términos de servicio</a> del sitio y acepto la <a href="/privacy">Política de privacidad</a>.</p>
                </footer>
            </form>
        </div>
    );
}

export default Register;
