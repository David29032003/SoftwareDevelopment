import "./Tile.css"; //esto es el css del cuadrado de tablero 
import React from "react"; //importamos react 
import piece1 from "../assets/piece1.png"; //esto es la imagen de la pieza 
import piece2 from "../assets/piece2.png"; //esto es la imagen de la pieza 


interface Props { //esto es el cuadrado de tablero  
    image?:string //esto es la imagen de la pieza
    number: number //esto es el numero del cuadrado de tablero   
}
export default function  Tile({number,image}: Props) { /*esto es el cuadrado de tablero*/
    if( number % 2 === 0){ /*esto es el color del cuadrado de tablero*/
        return <div className="tile black-tile">  
             <img className="piece1" src={image}></img> //esto es la imagen de la pieza 
        </div>
    }else{ 
        return <div className="tile white-tile"> //esto es el color del cuadrado de tablero 
            {/* <img className="piece1" src={image}></img>  */}
        </div>
    }
        
    // return (
        
    //     <div className="tile">hello</div>
    // )
}