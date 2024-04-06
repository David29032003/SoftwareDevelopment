import "./Home.css"
import React from "react";
import Navbar from "../../components/Navbar"
import checkers from "./assets/chekcershome.png"
import { useNavigate } from "react-router-dom";
import { routes } from "../../utils/routes";
export default function Home() {
    const navigate = useNavigate(); // Hook para manejar la navegación

    const navigateToRegister = () => {
        console.log("navigateToRegister");
        navigate('/register'); // Navega a la ruta del registro
    };
    const navigateToLogin = () => {
        console.log("navigateToLogin");
        navigate('/login'); // Navega a la ruta del registro
    };
    console.log("Home")
    return (
        <div className="Home" >
           <Navbar />
            <div id="inicio" className="page-section1">
                <img className="checkerhome" src={checkers} alt="Descripción de la imagen" />
                <div className="chekcerdesc">
                    <div className="cuadro">
                        <a className="text1">Checkers Elite</a>
                        <a className="text2">
                            ¡Bienvenido a Checkers Clash, el emocionante juego de damas que desafía tus habilidades estratégicas! Sumérgete en una experiencia de juego única, donde cada movimiento cuenta y cada decisión puede llevar a la victoria o a la derrota.
                        </a>
                        <a className="text3">
                            <button className="botonlog" onClick={navigateToLogin}>Login</button>
                            <button className="botonsign" onClick={navigateToRegister}>Sign up</button>
                        
                        </a>
                    </div>
                </div>
            </div>
            <div id="abot" className="page-section2">Contenido de la Sección 1</div>
            <div id="faq" className="section3">Contenido de la Sección 2</div>
            <div id="contact" className="section4">Contenido de la Sección 2</div>
            {/* Añade más secciones como necesites */}
        </div>
    )
}