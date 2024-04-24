import "./Tile.css";
import React from "react";
import piece1 from "../assets/piece1.png";
import piece2 from "../assets/piece2.png";


interface Props {
    image?:string
    number: number
}
export default function Tile({number,image}: Props) {
    if( number % 2 === 0){
        return <div className="tile black-tile">
             <img className="piece1" src={image}></img> 
        </div>
    }else{
        return <div className="tile white-tile">
            {/* <img className="piece1" src={image}></img>  */}
        </div>
    }
        
    // return (
        
    //     <div className="tile">hello</div>
    // )
}