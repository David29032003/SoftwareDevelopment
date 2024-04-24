import React from "react";
import "./Board.css"
import Tile from "./Tile/Tile";
import piece1 from "./assets/piece1.png"
import piece2 from "./assets/piece2.png"
const verticalAxis = [1,2,3,4,5,6,7,8];
const horizontalAxis = ["a","b","c","d","e","f","g","h"];
//tile es el cuadrado de tablero
interface Piece {
    image: string;
    x:number;//coordenadas x
    y:number;//coordenadas y
}
const pieces : Piece[] = [];//array de piezas
for(let i = 0; i < 8; i++){
    //agregamos una pieza1 a cada coordenada
    pieces.push({image:piece2,x:i,y:0})
    pieces.push({image:piece2,x:i,y:1})
    pieces.push({image:piece2,x:i,y:2})
}
for(let i = 0; i < 8; i++){
    //agregamos una pieza2 a cada coordenada
    pieces.push({image:piece1,x:i,y:7})
    pieces.push({image:piece1,x:i,y:6})
    pieces.push({image:piece1,x:i,y:5})
}

export default function Board(){
    let board: JSX.Element[] = [];
    console.log("d")
    
    for(let j = verticalAxis.length-1; j >=0; j--){
        for(let i = 0; i < horizontalAxis.length; i++){
            const number = j+i +1;
            let image = undefined;
            
           pieces.forEach(p => {//recorremos el array de piezas
               if(p.x === i && p.y === j){
                   image = p.image;
               }
           })
            board.push(<Tile image={image} number={number} />)
           
        }
        
    }
    return(
        <div id="board-checker">{board}</div>
    )
}