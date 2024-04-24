import React from "react";
import "./Modal.css"
export default function Modal( {children,estado ,cambiarEstado} ) {

    return (
        <div className="modal">
            {estado && 
            <div>

              rr
            {children}  
            </div>
            
            }
        </div>
    )
    
}
