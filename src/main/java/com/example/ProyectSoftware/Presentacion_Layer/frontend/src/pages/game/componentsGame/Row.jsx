// import React from 'react';
/* eslint-disable react/prop-types */
import Cell from './Cell';
import './LogicGame.css';

const Row = (props) => {
    return (
        <div className="row">
            {props.rowArr.map((cell, index) => (
                <Cell 
                    key={index}
                    rowIndex={props.rowIndex}
                    index={index}
                    cell={cell}
                    handlePieceClick={props.handlePieceClick} />
            ))}
        </div>
    );
};

export default Row;
