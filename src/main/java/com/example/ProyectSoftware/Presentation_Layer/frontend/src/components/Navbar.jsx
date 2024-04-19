import React, { useEffect } from "react";
import "./Navbar.css"
//import { Link } from "react-router-dom";
import{
    AiOutlineMenu,AiOutlineClose
} from "react-icons/ai";
import { links } from "../utils/links";
import mySvg from "../assets/logolight.svg";
// import logo from "../assets/logolight.svg"


export default function Navbar() {
    const[isMenuOpen, setIsMenuOpen] = React.useState(false);
    const[windowDimension, setWindowDimension] = React.useState({
        innerWidth: window.innerWidth,
        innerHeight: window.innerHeight});
    const detectSize = () => {
        setWindowDimension({
            innerWidth: window.innerWidth,
            innerHeight: window.innerHeight});
    }
    useEffect(() => {
        window.addEventListener("resize", detectSize);
        return () => {
            window.removeEventListener("resize", detectSize);
        };
    },[windowDimension.innerWidth]);
    const handleLinkClick = (e) => {
        e.preventDefault(); // Previene la navegación predeterminada
        const targetId = e.currentTarget.getAttribute('href').slice(1);
        const targetElement = document.getElementById(targetId);

        if (targetElement) {
            targetElement.scrollIntoView({
                behavior: 'smooth',
                block: 'start',
            });
        }
        setIsMenuOpen(false); // Cierra el menú después de seleccionar una sección en dispositivos móviles
    };
    return (
        <div className={
            !isMenuOpen? "Navbar":
            "Navbar-open"
        }>
            <div className="Navbar-logo" onClick={() => scrollToElement("Home")}>
            <img className="logolight" src={mySvg} alt="Descripción de la imagen SVG" />
            </div>
            {/* <Link to={"/"} className="Navbar-logo">
            logo

            </Link> */}
            <div className="linkss">
{
                windowDimension.innerWidth > 768 ?
                links.map((l) => (
                    <a href={l.link} className="Navbar-link" key={l.id} onClick={handleLinkClick}>  {l.text} </a>
                )):
                isMenuOpen && links.map((l) => (
                    <a href={l.link} className="Navbar-link" key={l.id} onClick={handleLinkClick}>  {l.text}</a>
                ))
            }
            {!isMenuOpen && windowDimension.innerWidth <768 ? 
            (
                <AiOutlineMenu className="Navbar-menu" cursor={"pointer"} size={24} color="white" onClick={() => setIsMenuOpen(true)}/>
            ):(windowDimension.innerWidth <768 &&
            (
                <AiOutlineClose cursor={"pointer"} size={24} color="white" onClick={() => setIsMenuOpen(false)}/>
            ))}


            </div>
            
        </div>
    )
}