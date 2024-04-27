import React, { useRef } from "react"; //importamos react
import "./Board.css" //importamos el css
import "./Tile/Tile.css" //importamos el css
import Tile from "./Tile/Tile"; //importamos el cuadrado de tablero
import piece1 from "./assets/piece1.png" //importamos la imagen de la pieza
import piece2 from "./assets/piece2.png" //importamos la imagen de la pieza
const verticalAxis = [1,2,3,4,5,6,7,8]; //coordenadas y del tablero 
const horizontalAxis = ["a","b","c","d","e","f","g","h"]; //coordenadas x del tablero 
//tile es el cuadrado de tablero
interface Piece { //pieza 
    image: string; //imagen de la pieza 
    x:number;//coordenadas x
    y:number;//coordenadas y
}
const pieces : Piece[] = [];//array de piezas
for(let i = 0; i < 8; i++){ // recorremos el tablero horizontalmente 
    //agregamos una pieza1 a cada coordenada
    pieces.push({image:piece2,x:i,y:0}) //esto es el cuadrado de tablero  
    pieces.push({image:piece2,x:i,y:1})  
    pieces.push({image:piece2,x:i,y:2}) 
}
for(let i = 0; i < 8; i++){ // recorremos el tablero horizontalmente
    //agregamos una pieza2 a cada coordenada
    pieces.push({image:piece1,x:i,y:7}) 
    pieces.push({image:piece1,x:i,y:6})
    pieces.push({image:piece1,x:i,y:5})
}


export default function Board(){ //esto es el tablero 
    const chessboardRef = useRef<HTMLElement>(null);
    let activePiece : HTMLElement | null = null;
    let board: JSX.Element[] = []; //array de piezas 
    console.log("estas en el tablero") //esto es el tablero 
    //moving piece
     //pieza activa
    //Este código define una función llamada movePiece que se activa cuando ocurre un evento de ratón. 
    //La función toma un parámetro de evento de ratón e, que se obtiene de la aplicación.
    function movePiece(e : React.MouseEvent) { 
            // const element = e.target as HTMLElement;
            // console.log(element);
            const chessboard = chessboardRef.current;
            if(activePiece && chessboard){
                const minX = chessboard.offsetLeft -25; 
                const minY = chessboard.offsetTop -25; 
                const maxX = chessboard.offsetLeft + chessboard.clientWidth -75;
                const maxY = chessboard.offsetTop + chessboard.clientHeight -75;
                const x = e.clientX -50;
                const y = e.clientY -50 ;
                activePiece.style.position = "absolute";
                // activePiece.style.left = `${x}px`;
                // activePiece.style.top = `${y}px`;
                console.log(chessboard);
                if(x<minX){ //si el valor de x es menor que minX
                    activePiece.style.left = `${minX}px`; //establece el valor de left en minX
                }else if(x>maxX){
                    activePiece.style.left = `${maxX}px`;
                }
                else{
                    activePiece.style.left = `${x}px`;
                }

                if(y<minY){
                    activePiece.style.top = `${minY}px`;
                }else if(y>maxY){
                    activePiece.style.top = `${maxY}px`;
                }
                else{
                    activePiece.style.top = `${y}px`;
                }

                
            }
    }
    //La función verifica si el elemento del evento tiene una clase llamada "piece1", y si es así, 
    //ajusta la posición absoluta del elemento en la página en función de la posición del cursor. Finalmente, asigna el elemento activo a la variable activePiece.
    function grabPiece(e : React.MouseEvent) { 
        const element = e.target as HTMLElement; 
        if(element.classList.contains("chess-piece1")){ 
            console.log(e);
            const x = e.clientX -50;
            const y = e.clientY -50;
            element.style.position = "absolute";
            element.style.left = `${x}px`;
            element.style.top = `${y}px`;
            activePiece = element;
        }
    }

    //La función dropPiece se utiliza para establecer la variable activePiece como null.
    // En el contexto de un juego, esta función podría utilizarse para indicar que una pieza activa ha sido soltada o eliminada.
    function dropPiece(e : React.MouseEvent) { 
        if(activePiece){
        activePiece = null;}
    }

    for(let j = verticalAxis.length-1; j >=0; j--){ //recorremos el tablero verticalmente 
        for(let i = 0; i < horizontalAxis.length; i++){ //recorremos el tablero horizontalmente 
            const number = j+i +2;  //esto es el numero de la coordenada 
            let image = undefined;
           pieces.forEach(p => {//recorremos el array de piezas 
               if(p.x === i && p.y === j){ 
                   image = p.image; //
               }
           });

           "0,0"
           "1,0"
           "2,0"

            board.push(<Tile key={`${i}${j}`} image={image} number={number} />) // el key es un id que contiene las coordenadas
           
        }
        
    }
    return( 
        <div 
        onMouseMove={(e) => movePiece(e)}
        onMouseDown={(e) => grabPiece(e)} 
        onMouseUp={(e) => dropPiece(e)}
        id="board-checker"
        ref={chessboardRef}>{board}</div> 
    )
}