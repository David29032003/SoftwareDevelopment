import React from "react"; //importamos react 
import "./Modal.css" //importamos el css
export default function Modal( {children,estado ,cambiarEstado} ) { //funcion que renderiza el modal con el estado y el children que es el contenido del modal

    return ( //renderizamos el modal
        <div className="modal"> //creamos un div con la clase modal
            {estado && //si el estado es verdadero se renderiza el modal con el children 
            <div>

              rr //si el estado es falso no se renderiza el modal 
            {children}  //el children es el contenido del modal 
            </div>
            }
        </div>
    )
    
}
