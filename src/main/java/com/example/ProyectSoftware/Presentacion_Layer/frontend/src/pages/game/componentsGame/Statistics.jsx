// import React from 'react';
/* eslint-disable react/prop-types */
import './LogicGame.css';

const Statistics = (props) => {
    return (
        <div className="stats">
            <div className="half" style={{color: 'white'}}>
                Red(Player):
                <br/>
                { (props.board.map(row => row.join('')).join('').match(/r/g) || []).length} Damas<br/>
                { (props.board.map(row => row.join('')).join('').match(/r\sk/g) || []).length} Reynas
            </div>
            <div className="half">
                Black(AI):
                <br/>
                { (props.board.map(row => row.join('')).join('').match(/b/g) || []).length} Damas<br/>
                { (props.board.map(row => row.join('')).join('').match(/b\sk/g) || []).length} Reynas
            </div>
        </div>
    );
};

export default Statistics;
