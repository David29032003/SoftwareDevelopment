import "./Personalizartab.css"
import Modal from "./Modal"
import React,{useState} from "react"
export default function Personalizartablero() {
    const [estadoModal1,cambiarEstadoModal1] = useState(false);//por defecto estara cerrado
    const [estadoModal2,cambiarEstadoModal2] = useState(false);//por defecto estara cerrado
    return(
        <div className="personalizesection">
            <div className="contenedorbotones">
                <button onClick={()=>cambiarEstadoModal1(!estadoModal1)}>
                    Modal1
                </button>
                <button onClick={()=>cambiarEstadoModal2(!estadoModal2)}>
                   2
                </button>
                <Modal
                    estado ={estadoModal1}
                    cambiarEstado = {cambiarEstadoModal1}
                
                >
                    dddddddddd
                    <button  className="botoncerrar" 
                    onClick={()=>cambiarEstadoModal1(false)}>X</button>
                </Modal>
                <Modal
                    estado ={estadoModal2}
                    cambiarEstado = {cambiarEstadoModal2}
                
                >
                    2
                    <button  className="botoncerrar" 
                    onClick={()=>cambiarEstadoModal2(false)}>X</button>
                </Modal>

                
            </div>
        </div>
    )
    
}