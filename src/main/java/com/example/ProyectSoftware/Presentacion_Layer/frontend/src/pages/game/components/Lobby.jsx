import "./Lobby.css" // Importa el archivo CSS
import imgtablero from "../assets/imgtablero.png" // Importa la imagen 
import imglinea2 from "../../login/assets/line2.png" // Importa la imagen
import logocheckers from "../../../assets/logolight.svg"; // Importa la imagen
import { useNavigate } from "react-router-dom";  // Importa la librería para la navegación de rutas
import robot from "../assets/robot.png" // Importa la imagen 
import uservsuser from "../assets/uservsuser.png" // Importa la imagen 
import linev from "../assets/linev.png" // Importa la imagen 
import logout from "../assets/logouticon.png" // Importa la imagen 
export default function Lobby() { // Exporta el componente Lobby con el nombre Lobby 
    const navigate = useNavigate(); // Hook para manejar la navegación 
const navigatetogame = () => { // Función para navegar a la ruta del juego 
    console.log("navigatetogame"); // Imprime un mensaje en la consola de depuración 
    navigate('/game'); // Navega a la ruta del juego 
}
const navigatetohome = () => { // Función para navegar a la ruta de inicio 
    console.log("navigatetohome"); // Imprime un mensaje en la consola de depuración 
    navigate('/'); // Navega a la ruta de inicio 
}
    return ( // Retorna el componente Lobby con el nombre Lobby 
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