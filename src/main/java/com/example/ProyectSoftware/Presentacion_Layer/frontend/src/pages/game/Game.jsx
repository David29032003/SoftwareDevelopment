import "./Game.css" //importamos el css
import Board from "./Board" //importamos el tablero
export default function Game() { //esto es el juego  
    return ( //renderizamos el juego 
        <div id="gamechecker"> 
            <Board/> 
        </div>
    )
}