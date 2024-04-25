import "./Personalizartab.css" //importamos el css 
import Modal from "./Modal" //importamos el modal
import React,{useState} from "react" //importamos react
export default function Personalizartablero() { //funcion que renderiza el modal con el estado y el children que es el contenido del modal
    const [estadoModal1,cambiarEstadoModal1] = useState(false); //por defecto estara cerrado
    const [estadoModal2,cambiarEstadoModal2] = useState(false); //por defecto estara cerrado 
    return( //renderizamos el modal 
        <div className="personalizesection"> //creamos un div con la clase personalizesection 
            <div className="contenedorbotones"> //creamos un div con la clase contenedorbotones
                <button onClick={()=>cambiarEstadoModal1(!estadoModal1)}> //creamos un boton para abrir el modal 
                    Modal1 //el texto del boton es Modal1 
                </button> 
                <button onClick={()=>cambiarEstadoModal2(!estadoModal2)}> //creamos un boton para abrir el modal 
                   2 //el texto del boton es 2
                </button>
                <Modal //creamos el modal 
                    estado ={estadoModal1} //el estado del modal es el estadoModal1 
                    cambiarEstado = {cambiarEstadoModal1} //el estado del modal es cambiarEstadoModal1 
                >
                    dddddddddd //el contenido del modal es dddddddddd
                    <button  className="botoncerrar"  //creamos el boton para cerrar el modal
                    onClick={()=>cambiarEstadoModal1(false)}>X</button> //el texto del boton es X 
                </Modal>
                <Modal //creamos el modal 
                    estado ={estadoModal2} //el estado del modal es el estadoModal2 
                    cambiarEstado = {cambiarEstadoModal2} //el estado del modal es cambiarEstadoModal2
                 
                >
                    2 //el contenido del modal es 2 
                    <button  className="botoncerrar" //creamos el boton para cerrar el modal  
                    onClick={()=>cambiarEstadoModal2(false)}>X</button> //el texto del boton es X 
                </Modal>

                
            </div>
        </div>
    )
    
}