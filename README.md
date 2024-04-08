<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Informe del Primer Sprint</title>
    <style>
        body {
            font-family: "Ubuntu", sans-serif;
        }
        table {
            border-collapse: collapse;
            width: 90%;
            margin: 0 auto;
        }
    </style>
</head>
<body>

<h1 style="text-align: center;">Informe Inicial del Primer Sprint</h1>

<h2>Objetivos</h2>
<p>Informe las actividades del equipo hasta el momento y demuestre que el equipo ha estado trabajando para completar el primer sprint.</p>


<h2>Nombre del equipo: Kapumota</h2>
<h2>Miembros del equipo:</h2>
<ul>
    <li>Reeves Goñi David Fernando</li>
    <li>Ruiz Arica Milagros Cristina</li>
    <li>Ravichagua Marin José Manuel</li>
</ul>
<h2>Acta de reunion:</h2>
<table border="3" cellpadding="10">
    <tr>
        <th> Fecha </th>
        <th> Tiempo y <br> duracion </th>
        <th> Lugar </th>
        <th>Nombres de los participantes</th>
        <th>Proposito de la reunion</th>
        <th>Elementos de accion especificos</th>
    </tr>
    <tr>
        <td style="text-align: center;">23/03/2024</td>
        <td style="text-align: center;">2 horas</td>
        <td> Reunion virtual por Google Meet</td>
        <td>
            <ul>
                <li>Ravichagua Manuel</li>
                <li>Reeves David</li>
                <li>Ruiz Milagros</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Investigar acerca del juego de las damas americanas</li>
                <li>Definir las tecnologias y metodologias que utiliza para el proyecto</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Definir roles y responsabilidades</li>
                <li>Establer un sistema de comunicacion</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>25/03/2024</td>
        <td>15 min</td>
        <td>Reunion virtual por Google Meet</td>
        <td>
            <ul>
                <li>Ravichagua Manuel</li>
                <li>Reeves David</li>
                <li>Ruiz Milagros</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Determinar los requerimientos y especificaciones</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Modificar el estado actual</li>
                <li>Utilizar la técnica GWT para definir las especificaciones y requerimientos del software</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>26/03/2024</td>
        <td>15 min</td>
        <td>Reunion presencial en la Universidad</td>
        <td>
            <ul>
                <li>Ravichagua Manuel</li>
                <li>Reeves David</li>
                <li>Ruiz Milagros</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Determina el flujo de ejecución que tendrá el software</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Designar las tareas para realizar el flujo de ejecución del software</li>
                <li>Crear un mirror compartido</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>28/03/2024</td>
        <td>15 min</td>
        <td>Reunion virtual por Google Meet</td>
        <td>
            <ul>
                <li>Ravichagua Manuel</li>
                <li>Reeves David</li>
                <li>Ruiz Milagros</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Definir la arquitectura del software</li>
                <li>Terminar el flujo de ejecución del software</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Utilizar los requerimientos y especificaciones</li>
                <li>Comparar diversos tipos de arquitecturas</li>
                <li>Establecer la arquitectura a usar de cliente-servidor de 3 capas</li>
            </ul>
        </td>
    </tr>
</table>
<h3>Decisiones Clave:</h3>
<ul>
    <li>Lenguaje de programación: Java</li>
    <li>Guía de estilo de programación: Guía de Estilo de Google Java</li>
    <li>IDE: Intellij IDEA</li>
    <li>Sitio de alojamiento del proyecto: GitHub</li>
    <li>Horario habitual de reunión: 7:00 p.m.</li>
</ul>
<h2>Estado Actual: </h2>
<table border="3" cellpadding="10">
    <tr>
        <th>Tareas</th>
        <th>¿Qué se hace?</th>
        <th>¿Quién ha contribuido?</th>
    </tr>
    <tr>
        <td style="text-align: center;">Historias de usuarios</td>
        <td>Como nuevo usuario, necesito crear una cuenta para poder iniciar sesión</td>
        <td>
            <ul>
                <li>Ruiz Milagros</li>
                <li>Ravichagua Manuel</li>
                <li>Reeves David</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td style="text-align: center;">Criterios de aceptación</td>
        <td>
            <ol>
                <li>
                    <p>Creación exitosa de una cuenta de usuario válida</p>
                    <b>Dado</b> un nombre de usuario válido inexistente <br>
                    <b>Cuando</b> creo una cuenta con este nombre usuario <br>
                    <b>Y</b> una contraseña válida que coincida con la contraseña confirmada <br>
                    <b>Y</b> una direccion de correo electrónico válida <br>
                    <b>Entonces</b> el sistema deberían crear unaa nueva cuenta. <br>
                    <b>Y</b> mostrar un mensaje de que me he registrado con éxito. <br>
                    <br>
                </li>
                <li>
                    <p>Creación de una cuenta fallida con un nombre de usuario existente</p>
                    <b>Dado</b> un nombre de usuario que ya existe <br>
                    <b>Cuando</b> creo una cuenta con este nombre de usuario <br>
                    <b>Y</b> una contraseña válida que coincida con la contraseña confirmada <br>
                    <b>Y</b> una dirección de correo electrónico válida <br>
                    <b>Entonces</b> el sistema no debería crear una nueva cuenta <br>
                    <b>Y</b> debería mostrar un mensaje de error. <br>
                    <br>
                </li>
                <li>
                    <p>Creación fallida de una contraseña existente</p>
                    <b>Dado</b> un nombre de usuario válido inexistente<br>
                    <b>Cuando</b> un usuario crea una cuenta con este nombre de usuario <br>
                    <b>Y</b> una contraseña no válida<br>
                    <b>Y</b> la misma contraseña confirmada <br>
                    <b>Y</b> una dirección de correo electrónico no válida <br>
                    <b>Entonces</b> el sistema no debería crear una nueva cuenta <br>
                    <b>Y</b> debería mostrar un mensaje de error. <br>
                </li>
            </ol>
        </td>
        <td>
            <ul>
                <li>Ruiz Milagros</li>
                <li>Ravichagua Manuel</li>
                <li>Reeves David</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td style="text-align: center;">Codificación</td>
        <td> </td>
    </tr>
</table>
<p>

</p>
<table border="3" cellpadding="10">
    <tr>
        <th>Tareas</th>
        <th>¿Qué se hace?</th>
        <th>¿Quién ha contribuido?</th>
    </tr>
    <tr>
        <td style="text-align: center;">Historias de usuarios</td>
        <td>Como usuario necesito iniciar sesión para poder jugar</td>
        <td>
            <ul>
                <li>Ruiz Milagros</li>
                <li>Reeves David</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td style="text-align: center;">Criterios de aceptación</td>
        <td>
            <ol>
                <li>
                    <p>Inicio de sesión exitoso con credenciales válidas</p>
                    <b>Dado</b> un usuario ya registrado y confirmado <br>
                    <b>Cuando</b> ingrese el nombre de usuario <br>
                    <b>Y</b> la contraseña válida <br>
                    <b>Entonces</b> el sistema debería autenticar exitosamente <br>
                    <b>Y</b> redirigir a la página de inicio. <br>
                    <br>
                </li>
                <li>
                    <p>Intento fallido de inicio de sesión con contraseña incorrecta</p>
                    <b>Dado</b> un usuario ya registrado y confirmado <br>
                    <b>Cuando</b> ingreso un nombre de usuario <br>
                    <b>Y</b> la contraseña incorrecta <br>
                    <b>Entonces</b> el sistema debería no autenticar exitosamente <br>
                    <b>Y</b> debería mostrar un mensaje de error. <br>
                    <br> 
                </li>
                <li>
                    <p>Intento de inicio de sesión con un nombre de usuario inexistente</p>
                    <b>Dado</b> un nombre de usuario inexistente <br>
                    <b>Cuando</b> ingreso un nombre de usuario <br>
                    <b>Y</b> una contraseña inexistente <br>
                    <b>Entonces</b> el sistema debería no permitir iniciar sesión <br>
                    <b>Y</b> mostrar un mensaje de error. <br>
                    <br> 
                </li>
                <li>
                    <p>Intento de inicio de sesión con un correo electrónico no asociado a ningún usuario</p>
                    <b>Dado</b> un correo electrónico que no esta asociado a ningun usuario registrado <br>
                    <b>Cuando</b> ingreso un correo no registrado <br>
                    <b>Y</b> una contraseña inexistente <br>
                    <b>Entonces</b> el sistema debería no autenticar exitosamente <br>
                    <b>Y</b> debería mostrar un mensaje de error.<br>
                    <br> 
                </li>
            </ol>
        </td>
        <td> 
            <ul>
                <li>Ruiz Milagros</li>
                <li>Reeves David</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td style="text-align: center;">Codificación</td>
        <td> </td>
        <td> </td>
    </tr>
</table>
<p>

</p>
<table border="3" cellpadding="10">
    <tr>
        <th>Tareas</th>
        <th>¿Qué se hace?</th>
        <th>¿Quién ha contribuido?</th>
    </tr>
    <tr>
        <td style="text-align: center;">Historias de usuarios</td>
        <td>Como usuario deseo cerrar sesión del juego</td>
        <td>
            <ul>
                <li>Reeves David</li>
                <li>Ravichagua Manuel</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td style="text-align: center;">Criterios de aceptación</td>
        <td> 
            <ol>
                <li>
                    <p>Cierre de sesión exitoso de una cuenta registrada</p>
                    <b>Dado</b> un usuario con una cuenta registrada <br>
                    <b>Y</b> autenticacion exitosa <br>
                    <b>Cuando</b> presiono el botón de cerrar sesión <br>
                    <b>Y</b> confirmo el mensaje de aceptación <br>
                    <b>Entonces</b> el sistema debería cerrar sesión de la cuenta registrada <br>
                    <b>Y</b> redirigir a la pagina de inicio de sesión. 
                </li>
            </ol>
        </td>
        <td> 
            <ul>
                <li>Reeves David</li>
                <li>Ravichagua Manuel</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td style="text-align: center;">Codificación</td>
        <td> </td>
        <td> </td>
    </tr>
</table>
<p>

</p>
<table border="3" cellpadding="10">
    <tr>
        <th>Tareas</th>
        <th>¿Qué se hace?</th>
        <th>¿Quién ha contribuido?</th>
    </tr>
    <tr>
        <td style="text-align: center;">Historias de usuarios</td>
        <td>Como jugador necesito seleccionar un tablero de damas para jugar</td>
        <td>
            <ul>
                <li>Ruiz Milagros</li>
                <li>Ravichagua Manuel</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td style="text-align: center;">Criterios de aceptación</td>
        <td>
            <ol>
                <li>
                    <p>Selección de modelo de tablero de damas</p>
                    <b>Dado</b> un jugador presiona el botón de jugar una partida de damas <br>
                    <b>Cuando</b> selecciono el boton para elegir un modelo tablero de damas <br>
                    <b>Y</b> confirmar el diseño elegido <br>
                    <b>Entonces</b> el sistema debería mostrar el tablero elegido <br>
                    <br>
                </li>
                <li>
                    <p>Selección de un color de pieza de damas</p>
                    <b>Dado</b> un jugador presiona el botón de jugar una partida de damas <br>
                    <b>Y</b> elegido un tablero de damas <br>
                    <b>Cuando</b> presiono el botón para elegir un color de pieza de damas <br>
                    <b>Y</b> confirmar el color elegido <br>
                    <b>Entonces</b> el sistema debería mostrar el color de pieza elegido <br>
                    <br>
                </li>
                <li>
                    <p>Visualizacion exitosa de tablero de damas</p>
                    <b>Dado</b> un jugador que selecciono el modelo de tablero de damas <br>
                    <b>Y</b> un color de pieza de damas <br>
                    <b>Cuando</b> presiono el botón iniciar partida <br>
                    <b>Entonces</b> el sistema debería mostrar el modelo del tablero<br>
                    <b>Y</b> el color de pieza de damas elegido;
                </li>
            </ol>
        </td>
        <td>
            <ul>
                <li>Ruiz Milagros</li>
                <li>Ravichagua Manuel</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td style="text-align: center;">Codificación</td>
        <td> </td>
        <td> </td>
    </tr>
</table>
<h2>Calificacion de amigos:</h2>
<table border="3" cellpadding="10">
    <tr>
        <th> </th>
        <th>Jose Manuel <br> Ravichagua Marin</th>
        <th>David Fernando <br> Reeves Goñi</th>
        <th>Milagros Cristina <br>Ruiz Arica</th>
    </tr>
    <tr>
        <td style="text-align: center;">Jose Manuel <br> Ravichagua Marin</td>
        <td style="text-align: center;"> 8</td>
        <td style="text-align: center;"> 9</td>
        <td style="text-align: center;"> 9</td>
    </tr>
    <tr>
        <td style="text-align: center;">David Fernando <br> Reeves Goñi</td>
        <td style="text-align: center;"> 8</td>
        <td style="text-align: center;"> 9</td>
        <td style="text-align: center;"> 8</td>
    </tr>
    <tr>
        <td style="text-align: center;">Milagros Cristina <br> Ruiz Arica</td>
        <td style="text-align: center;"> 8</td>
        <td style="text-align: center;"> 8</td>
        <td style="text-align: center;"> 9</td>
    </tr>
    <tr>
        <td style="text-align: right;">Promedio</td>
        <td style="text-align: center;"> 8</td>
        <td style="text-align: center;"> 8.67</td>
        <td style="text-align: center;"> 8.67</td>
    </tr>
    
</table>
</body>
</html>
