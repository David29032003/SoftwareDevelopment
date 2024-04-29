import "./Game.css" //importamos el css
import GameBoard from "./componentsGame/GameBoard" //importamos el tablero
export default function Game() { //esto es el juego  
    return ( //renderizamos el juego 
        
        <div id="gamechecker"> 
            <GameBoard/> 
        </div>
    )
}