import "./Lobby.css"
import imgtablero from "../assets/imgtablero.png"
import imglinea2 from "../../login/assets/line2.png"
import logocheckers from "../../../assets/logolight.svg";
import { useNavigate } from "react-router-dom";
import robot from "../assets/robot.png"
import uservsuser from "../assets/uservsuser.png"
import linev from "../assets/linev.png"
import logout from "../assets/logouticon.png"
export default function Lobby() {
    const navigate = useNavigate();
const navigatetogame = () => {
    console.log("navigatetogame");
    navigate('/game');
}
const navigatetohome = () => {
    console.log("navigatetohome");
    navigate('/');
}
    return (
        <div className="Lobby">
            <div className="section1">
                <img className="imgtablero" src={imgtablero}></img>
            </div>
            <div className="section2">
                <div className="lobby-logo">
                        <div   div className="lobby-line">
                            <img className="imglinea2" src={imglinea2} alt="Descripción de la imagen" />
                        </div>
                        <img className="logocheckerhome" src={logocheckers} alt="Descripción de la imagen" />
                        <div className="lobby-line">
                            <img className="imglinea2" src={imglinea2} alt="Descripción de la imagen" />
                        </div>
                </div>
                <div className="lobby-title">Juega a las damas americanas </div>
                <div className="lobby-options">
                    <button className="lobby-button1" onClick={navigatetogame}>
                        <div className="lobbycuadroicon">
                           <img className="icong" src={uservsuser} alt="Descripción de la imagen" />  
                        </div>
                           
                        <img className="iconlin" src={linev} alt="Descripción de la imagen" /> 
                        <div className="lobbytextb">
                            <p className="lobbytextboton">Juega en linea</p>
                        </div>
                        
                    </button>
                    <button className="lobby-button2" onClick={navigatetogame}>
                
                        <div className="lobbycuadroicon">
                            <img className="iconr" src={robot} alt="Descripción de la imagen" />
                        </div>
                        <img className="iconlin" src={linev} alt="Descripción de la imagen" /> 
                        <div className="lobbytextb">
                          <p className="lobbytextboton">Ordenador</p>  
                        </div>
                        
                    </button>
                </div>
                <div className="lobby-cierresesion">
                <button className="lobby-button" >
                        <img className="iconlogout" src={logout} alt="Descripción de la imagen" /> 
                        <a href="/">
                        <p>Cerrar sesion</p>   
                        </a>
                        
                    </button>
                </div>
            </div>
        </div>
    )
}