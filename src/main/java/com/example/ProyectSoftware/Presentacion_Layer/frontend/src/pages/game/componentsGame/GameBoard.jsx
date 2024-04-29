import { useState } from "react";
import Row from "./Row";
import Statistics from "./Statistics";
import './LogicGame.css';


const GameBoard = () => {
    const [state, setState] = useState({
        board: [
            ["b", "-", "b", "-", "b", "-", "b", "-"],
            ["-", "b", "-", "b", "-", "b", "-", "b"],
            ["b", "-", "b", "-", "b", "-", "b", "-"],
            ["-", "-", "-", "-", "-", "-", "-", "-"],
            ["-", "-", "-", "-", "-", "-", "-", "-"],
            ["-", "r", "-", "r", "-", "r", "-", "r"],
            ["r", "-", "r", "-", "r", "-", "r", "-"],
            ["-", "r", "-", "r", "-", "r", "-", "r"],
        ],
        
        activePlayer: "r", // El jugador es: r: red, b: black
        aiDepthCutoff: 3, // inteligencia del bot
        count: 0,
        popShown: false, // para mostrar popup cuando hay un ganador
        moves:[]
    });
    
    // useEffect(() => {
        
    // }, [state.board]);

    // const aboutPopOpen = (e) => {
    //     // setState({ popShown: true });
    // };

    const findAllJumps = (sourceRowIndex, sourceCellIndex, board, directionOfMotion, possibleJumps, wouldDelete, isKing, activePlayer) => {
        let thisIterationDidSomething = false;
        const directions = [directionOfMotion];
        const leftOrRight = [1, -1];

        if (isKing) {
            directions.push(directions[0] * -1);
        }

        for (let k = 0; k < directions.length; k++) {
            for (let l = 0; l < leftOrRight.length; l++) {
                leftOrRight[l]
                if (
                    typeof board[sourceRowIndex + directions[k]] !== 'undefined' &&
                    typeof board[sourceRowIndex + directions[k]][sourceCellIndex + leftOrRight[l]] !== 'undefined' &&
                    typeof board[sourceRowIndex + (directions[k] * 2)] !== 'undefined' &&
                    typeof board[sourceRowIndex + (directions[k] * 2)][sourceCellIndex + (leftOrRight[l] * 2)] !== 'undefined' &&
                    board[sourceRowIndex + directions[k]][sourceCellIndex + leftOrRight[l]].indexOf(activePlayer === 'r' ? 'b' : 'r') > -1 &&
                    board[sourceRowIndex + (directions[k] * 2)][sourceCellIndex + (leftOrRight[l] * 2)] === '-'
                ) {
                    if (possibleJumps.map(move => `${move.targetRow}${move.targetCell}`).indexOf(String(sourceRowIndex+(directions[k]*2))+String(sourceCellIndex+(leftOrRight[l]*2))) < 0) {
                        const tempJumpObject = {
                            targetRow: sourceRowIndex + (directions[k] * 2),
                            targetCell: sourceCellIndex + (leftOrRight[l] * 2),
                            wouldDelete: [
                                {
                                    targetRow: sourceRowIndex + directions[k],
                                    targetCell: sourceCellIndex + leftOrRight[l]
                                }
                            ]
                        };
                        for (var i = 0; i < wouldDelete.length; i++) {
							tempJumpObject.wouldDelete.push(wouldDelete[i]);
						}
						possibleJumps.push(tempJumpObject);
						thisIterationDidSomething = true;
                    }
                }
            }
        }

        if (thisIterationDidSomething) {
            for (let i = 0; i < possibleJumps.length; i++) {
                const coords = [possibleJumps[i].targetRow, possibleJumps[i].targetCell];
                const children = findAllJumps(coords[0], coords[1], board, directionOfMotion, possibleJumps, possibleJumps[i].wouldDelete, isKing, activePlayer);
                for (let j = 0; j < children.length; j++) {
                    if (possibleJumps.indexOf(children[j]) < 0) {
                        possibleJumps.push(children[j]);
                    }
                }
            }
        }

        return possibleJumps;
    };

    const findAllPossibleMoves = (rowIndex, cellIndex, board, activePlayer) => {
        const possibleMoves = [];
        const directionOfMotion = [];
        const leftOrRight = [1, -1];
        const isKing = board[rowIndex][cellIndex].indexOf('k') > -1;
        if (activePlayer === 'b') {
            directionOfMotion.push(1);
        } else {
            directionOfMotion.push(-1);
        }

        if (isKing) {
            directionOfMotion.push(directionOfMotion[0] * -1);
        }

        for (let j = 0; j < directionOfMotion.length; j++) {
            for (let i = 0; i < leftOrRight.length; i++) {
                if (
                    typeof board[rowIndex + directionOfMotion[j]] !== 'undefined' &&
                    typeof board[rowIndex + directionOfMotion[j]][cellIndex + leftOrRight[i]] !== 'undefined' &&
                    board[rowIndex + directionOfMotion[j]][cellIndex + leftOrRight[i]] === '-'
                ) {
                    if (possibleMoves.map(move => `${move.targetRow}${move.targetCell}`).indexOf(String(rowIndex+directionOfMotion[j])+String(cellIndex+leftOrRight[i])) < 0) {
                        possibleMoves.push({ targetRow: rowIndex + directionOfMotion[j], targetCell: cellIndex + leftOrRight[i], wouldDelete: [] });
                    }
                }
            }
        }

        const jumps = findAllJumps(rowIndex, cellIndex, board, directionOfMotion[0], [], [], isKing, activePlayer);

        for (let i = 0; i < jumps.length; i++) {
            possibleMoves.push(jumps[i]);
        }

        return possibleMoves;
    };

    const highlightPossibleMoves = (rowIndex, cellIndex) => {
        // Eliminar cualquier celda previamente resaltada
        state.board = state.board.map(row => row.map(cell => cell.replace('h', '-').replace(/d\d\d/g, '').trim()));

        const possibleMoves = findAllPossibleMoves(rowIndex, cellIndex, state.board, state.activePlayer);
        // Resaltar los posibles movimientos en el tablero
        // El 'highlightTag' inserta la información en una celda que especifica
        for (let j = 0; j < possibleMoves.length; j++) {
            let buildHighlightTag = 'h ';
            for (let k = 0; k < possibleMoves[j].wouldDelete.length; k++) {
                buildHighlightTag += `d${possibleMoves[j].wouldDelete[k].targetRow}${possibleMoves[j].wouldDelete[k].targetCell} `;
            }
            state.board[possibleMoves[j].targetRow][possibleMoves[j].targetCell] = buildHighlightTag;
        }
        
        setState(prevState => {
            return { ...prevState, board: state.board };
        });
    };
    
    const executeMove = (rowIndex, cellIndex, board, activePlayer) => {
        let activePiece;
        for (let i = 0; i < board.length; i++) {
            // Para cada fila
            for (let j = 0; j < board[i].length; j++) {
                if (board[i][j].indexOf('a') > -1) {
                    activePiece = board[i][j];
                }
            }
        }
        // Realizar cualquier eliminación de salto
        const deletions = board[rowIndex][cellIndex].match(/d\d\d/g);
        // eslint-disable-next-line valid-typeof
        if (typeof deletions !== undefined && deletions !== null && deletions.length > 0) {
            for (let k = 0; k < deletions.length; k++) {
                const deleteCoords = deletions[k].replace('d', '').split('');
                board[deleteCoords[0]][deleteCoords[1]] = '-';
            }
        }
        
        // Quitar la pieza activa de su lugar
        board = board.map(row => row.map(cell => cell.replace(activePiece, '-')));
        // Desresaltar
        board = board.map(row => row.map(cell => cell.replace('h', '-').replace(/d\d\d/g, '').trim()));
        // Colocar la pieza activa, ahora inactiva, en su nuevo lugar
        board[rowIndex][cellIndex] = activePiece.replace('a', '');
        
        if ((activePlayer === 'b' && rowIndex === 7) || (activePlayer === 'r' && rowIndex === 0)) {
            board[rowIndex][cellIndex] += ' k';
        }
        
        return board;
    };

    const winDetection = (board, activePlayer) => {
        const enemyPlayer = activePlayer === 'r' ? 'b' : 'r';
        let result = true;
        for (let i = 0; i < board.length; i++) {
            for (let j = 0; j < board[i].length; j++) {
                if (board[i][j].indexOf(enemyPlayer) > -1) {
                    result = false;
                }
            }
        }
        return result;
    };

    const cloneBoard = (board) => {
        const output = [];
        for (let i = 0; i < board.length; i++) output.push(board[i].slice(0));
        return output;
    };
    

    const ai = () => {
        // Prep a branching future prediction
        // let count = 0;
        console.time('decisionTree');
        const decisionTree = aiBranch(state.board, state.activePlayer, 1);
        console.log("TIempo para decidir la mejor jugada: ");
        console.timeEnd('decisionTree');
        // console.log('decisionTree', decisionTree);
    
        // Execute the most favorable move
        if (decisionTree.length > 0) {
            console.log(decisionTree[0]);
            setTimeout(() => {
                handlePieceClick({
                    target: {
                        attributes:{
							'data-row':{
								nodeValue:decisionTree[0].piece.targetRow
							},
							'data-cell':{
								nodeValue:decisionTree[0].piece.targetCell
							}
						}
                    }
                });
            
                setTimeout(() => {
                    handlePieceClick({
                        target: {
                            attributes:{
								'data-row':{
									nodeValue:decisionTree[0].move.targetRow
								},
								'data-cell':{
									nodeValue:decisionTree[0].move.targetCell
								}
							}
                        }
                    });
                }, 1000);
            }, 750);
            console.log('me movi');
        } else {
            alert('No moves, you win!');
        }
    };
    
    const aiBranch = (hypotheticalBoard, activePlayer, depth) => {
        // statecount=1;
        const output = [];
        for (let i = 0; i < hypotheticalBoard.length; i++) {
            for (let j = 0; j < hypotheticalBoard[i].length; j++) {
                if (hypotheticalBoard[i][j].indexOf(activePlayer) > -1) {
                    const possibleMoves = findAllPossibleMoves(i, j, hypotheticalBoard, activePlayer);
                    for (let k = 0; k < possibleMoves.length; k++) {
                        const tempBoard = cloneBoard(hypotheticalBoard);
                        tempBoard[i][j] = 'a' + tempBoard[i][j];
    
                        let buildHighlightTag = 'h ';
                        for (let m = 0; m < possibleMoves[k].wouldDelete.length; m++) {
                            buildHighlightTag += 'd' + String(possibleMoves[k].wouldDelete[m].targetRow) + String(possibleMoves[k].wouldDelete[m].targetCell) + ' ';
                        }
                        tempBoard[possibleMoves[k].targetRow][possibleMoves[k].targetCell] = buildHighlightTag;
    
                        const buildingObject = {
                            piece: { targetRow: i, targetCell: j },
                            move: possibleMoves[k],
                            board: executeMove(possibleMoves[k].targetRow, possibleMoves[k].targetCell, tempBoard, activePlayer),
                            terminal: null,
                            children: [],
                            score: 0,
                            activePlayer: activePlayer,
                            depth: depth,
                        };
    
                        buildingObject.terminal = winDetection(buildingObject.board, activePlayer);
    
                        if (buildingObject.terminal) {
                            if (activePlayer === state.activePlayer) {
                                buildingObject.score = 100 - depth;
                            } else {
                                buildingObject.score = -100 - depth;
                            }
                        } else if (depth > state.aiDepthCutoff) {
                            buildingObject.score = 0;
                        } else {
                            buildingObject.children = aiBranch(buildingObject.board, (activePlayer === 'r' ? 'b' : 'r'), depth + 1);
    
                            const scoreHolder = [];
                            for (let l = 0; l < buildingObject.children.length; l++) {
                                if (typeof buildingObject.children[l].score !== 'undefined') {
                                    scoreHolder.push(buildingObject.children[l].score);
                                }
                            }
                            scoreHolder.sort((a, b) => {
                                if (a > b) return -1;
                                if (a < b) return 1;
                                return 0;
                            });
    
                            if (scoreHolder.length > 0) {
                                if (activePlayer === state.activePlayer) {
                                    buildingObject.score = scoreHolder[scoreHolder.length - 1];
                                } else {
                                    buildingObject.score = scoreHolder[0];
                                }
                            } else {
                                if (activePlayer === state.activePlayer) {
                                    buildingObject.score = 100 - depth;
                                } else {
                                    buildingObject.score = -100 - depth;
                                }
                            }
                        }
    
                        if (activePlayer === state.activePlayer) {
                            for (let n = 0; n < buildingObject.move.wouldDelete.length; n++) {
                                if (hypotheticalBoard[buildingObject.move.wouldDelete[n].targetRow][buildingObject.move.wouldDelete[n].targetCell].indexOf('k') > -1) {
                                    buildingObject.score += (25 - depth);
                                } else {
                                    buildingObject.score += (10 - depth);
                                }
                            }
                            if ((JSON.stringify(hypotheticalBoard).match(/k/g) || []).length < (JSON.stringify(buildingObject.board).match(/k/g) || []).length) {
                                buildingObject.score += (15 - depth);
                            }
                        } else {
                            for (let n = 0; n < buildingObject.move.wouldDelete.length; n++) {
                                if (hypotheticalBoard[buildingObject.move.wouldDelete[n].targetRow][buildingObject.move.wouldDelete[n].targetCell].indexOf('k') > -1) {
                                    buildingObject.score -= (25 - depth);
                                } else {
                                    buildingObject.score -= (10 - depth);
                                }
                            }
                            if ((JSON.stringify(hypotheticalBoard).match(/k/g) || []).length < (JSON.stringify(buildingObject.board).match(/k/g) || []).length) {
                                buildingObject.score -= (15 - depth);
                            }
                        }
                        buildingObject.score += buildingObject.move.wouldDelete.length;
                        output.push(buildingObject);
                    }
                }
            }
        }
    
        output.sort((a, b) => {
            if (a.score > b.score) return -1;
            if (a.score < b.score) return 1;
            return 0;
        });
        return output;
    };

    function MovesHistory({ moves }) {
        return (
          <div>
            <h3>Historial de Movimientos</h3>
            <ul>
              {moves.map((move, index) => (
                <li key={index}>{`Jugador ${move.player}: de (${move.from.row}, ${move.from.col}) a (${move.to.row}, ${move.to.col})`}</li>
              ))}
            </ul>
          </div>
        );
      }


    const reset = () => {
        setState(prevState => {
            return { ...prevState, board: [
                ['b', '-', 'b', '-', 'b', '-', 'b', '-'],
                ['-', 'b', '-', 'b', '-', 'b', '-', 'b'],
                ['b', '-', 'b', '-', 'b', '-', 'b', '-'],
                ['-', '-', '-', '-', '-', '-', '-', '-'],
                ['-', '-', '-', '-', '-', '-', '-', '-'],
                ['-', 'r', '-', 'r', '-', 'r', '-', 'r'],
                ['r', '-', 'r', '-', 'r', '-', 'r', '-'],
                ['-', 'r', '-', 'r', '-', 'r', '-', 'r']
            ],
            activePlayer: 'r' };
        });
    };


    const findActivePiece = (board) => {
        for (let rowIndex = 0; rowIndex < board.length; rowIndex++) {
            for (let cellIndex = 0; cellIndex < board[rowIndex].length; cellIndex++) {
                if (board[rowIndex][cellIndex].includes('a')) {  // Busca el indicador 'a' en la pieza
                    return { row: rowIndex, col: cellIndex };
                }
            }
        }
        return null;  // Devuelve null si no hay pieza activa
    };
    
    const handlePieceClick = (e) => {
        const rowIndex = parseInt(e.target.attributes['data-row'].nodeValue);
        const cellIndex = parseInt(e.target.attributes['data-cell'].nodeValue);
        console.log(state.board);
        // Si la ficha presionada == Jugador Activo ('r' or 'b')
        if (state.board[rowIndex][cellIndex].indexOf(state.activePlayer) > -1) {
            console.log("presionaste la ficha pero aun no te mueves", state.activePlayer, rowIndex, cellIndex);
            state.board = state.board.map(row => row.map(cell => cell.replace('a', '')));
            state.board[rowIndex][cellIndex] = 'a' + state.board[rowIndex][cellIndex];
            highlightPossibleMoves(rowIndex, cellIndex); // Resalta los posibles movimientos
            
        } 
        else if (state.board[rowIndex][cellIndex].indexOf('h') > -1) {
            // Se activa si la casilla clickeada está resaltada, mueve la pieza activa a ese lugar
            const fromPosition = findActivePiece(state.board); 
            state.board = executeMove(rowIndex, cellIndex, state.board, state.activePlayer);
            console.log("te moviste a", state.activePlayer, rowIndex, cellIndex);
            // Guardar el movimiento
            const newMove = {
            player: state.activePlayer,
            from: fromPosition,
            to: {row: rowIndex, col: cellIndex}
             };
            //REact renderice denuevo
            setState(prevState => {
                return {...prevState,
                     board: state.board,
                      activePlayer: state.activePlayer,
                    moves:[...prevState.moves,newMove]};
            });

            // ¿El juego ha terminado? Si no, cambia el jugador activo
            if (winDetection(state.board, state.activePlayer)) {
                console.log(state.activePlayer + ' won the game!');
            }
            else {
                state.activePlayer = state.activePlayer === 'r' ? 'b' : 'r';
                if (state.activePlayer === 'b') {
                    setTimeout(() => ai(), 50); // Darle tiempo al bot para calcular su proxima jugada
                }
            }
        }
        setState(prevState => {
            return {...prevState};
        });
    };


    return (
        <div className="container">
            <div className={"board " + state.activePlayer}>
                {state.board.map((row, index) => (
                    <Row
                        key={index}
                        rowArr={row}
                        handlePieceClick={handlePieceClick}
                        rowIndex={index}
                    />
                ))}
            </div>
            <div className="clear"></div>
            <div className="report-checkers">
                 <button className="button-reset"onClick={reset}>Reiniciar Juego</button>
                 <Statistics board={state.board} />
            </div>
            <div className="movesHistory">
                <MovesHistory moves={state.moves} />
            </div>
            
        </div>
    );
};

export default GameBoard;
