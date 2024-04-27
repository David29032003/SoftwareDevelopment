import "./Tile.css"; //esto es el css del cuadrado de tablero 
import React from "react"; //importamos react 
import piece1 from "../assets/piece1.png"; //esto es la imagen de la pieza 
import piece2 from "../assets/piece2.png"; //esto es la imagen de la pieza 


interface Props { //esto es el cuadrado de tablero  
    image?:string //esto es la imagen de la pieza
    number: number //esto es el numero del cuadrado de tablero   
}
export default function  Tile({number,image}: Props) {
    if( number % 2 === 0){
        console.log(image); 
        return (<div className="tile-black-tile"> 
        {/* la siguiente linea sirve para mostrar la imagen de la pieza en el tablero  */}
            { image && <div style={{backgroundImage: `url(${image})`}} className="chess-piece1"></div>} {/*si la imagen no es undefined
            la imagen se muestra */}

        </div>);
    }else{ 
        return (<div className="tile-white-tile">
          
            {/* <img className="piece1" src={image}></img>  */}
        </div>)
    }
        
   
}