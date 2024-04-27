import "./Game.css" //importamos el css
import Board from "./Board" //importamos el tablero
export default function Game() { //esto es el juego  
    return ( //renderizamos el juego 
        <div id="gamechecker"> //creamos un div con la clase gamechecker 
           
            <Board/> //renderizamos el tablero 
        </div>
    )
}