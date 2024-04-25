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
        <div className="Lobby"> // Crea un div con la clase Lobby 
            <div className="section1"> // Crea un div con la clase section1 
                <img className="imgtablero" src={imgtablero}></img> // Crea un elemento img con la clase imgtablero y la imagen imgtablero.png 
            </div>
            <div className="section2"> // Crea un div con la clase section2 
                <div className="lobby-logo"> // Crea un div con la clase lobby-logo 
                        <div   div className="lobby-line"> // Crea un div con la clase lobby-line 
                            <img className="imglinea2" src={imglinea2} alt="Descripción de la imagen" /> // Crea un elemento img con la clase imglinea2 y la imagen imglinea2.png
                        </div>
                        <img className="logocheckerhome" src={logocheckers} alt="Descripción de la imagen" /> // Crea un elemento img con la clase logocheckerhome y la imagen logocheckers.png
                        <div className="lobby-line"> // Crea un div con la clase lobby-line 
                            <img className="imglinea2" src={imglinea2} alt="Descripción de la imagen" /> // Crea un elemento img con la clase imglinea2 y la imagen imglinea2.png
                        </div>
                </div>
                <div className="lobby-title">Juega a las damas americanas </div> // Crea un elemento div con la clase lobby-title y el texto "Juega a las damas americanas"
                <div className="lobby-options"> // Crea un div con la clase lobby-options
                    <button className="lobby-button1" onClick={navigatetogame}> // Crea un elemento button con la clase lobby-button1 y un evento onClick que navega a la ruta del juego
                        <div className="lobbycuadroicon"> // Crea un elemento div con la clase lobbycuadroicon 
                           <img className="icong" src={uservsuser} alt="Descripción de la imagen" />  // Crea un elemento img con la clase icong y la imagen uservsuser.png
                        </div>
                           
                        <img className="iconlin" src={linev} alt="Descripción de la imagen" /> // Crea un elemento img con la clase iconlin y la imagen linev.png 
                        <div className="lobbytextb"> // Crea un elemento div con la clase lobbytextb
                            <p className="lobbytextboton">Juega en linea</p> // Crea un elemento p con la clase lobbytextboton y el texto "Juega en linea"
                        </div>
                        
                    </button>
                    <button className="lobby-button2" onClick={navigatetogame}> // Crea un elemento button con la clase lobby-button2 y un evento onClick que navega a la ruta del juego
                
                        <div className="lobbycuadroicon"> // Crea un elemento div con la clase lobbycuadroicon
                            <img className="iconr" src={robot} alt="Descripción de la imagen" /> // Crea un elemento img con la clase iconr y la imagen robot.png
                        </div>
                        <img className="iconlin" src={linev} alt="Descripción de la imagen" /> // Crea un elemento img con la clase iconlin y la imagen linev.png
                        <div className="lobbytextb"> // Crea un elemento div con la clase lobbytextb
                          <p className="lobbytextboton">Ordenador</p> // Crea un elemento p con la clase lobbytextboton y el texto "Ordenador"  
                        </div>
                        
                    </button>
                </div>
                <div className="lobby-cierresesion"> // Crea un div con la clase lobby-cierresesion
                <button className="lobby-button" > // Crea un elemento button con la clase lobby-button
                        <img className="iconlogout" src={logout} alt="Descripción de la imagen" /> // Crea un elemento img con la clase iconlogout y la imagen logout.png 
                        <a href="/"> // Crea un elemento a que redirige a la ruta "/"
                        <p>Cerrar sesion</p>     // Crea un elemento p con el texto "Cerrar sesion"
                        </a>
                        
                    </button>
                </div>
            </div>
        </div>
    )
}