
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
<h1>Documentacion de Frontend</h1>

# Main.jsx

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled.png)

Este código es una aplicación frontend construida con React. Utiliza **`ReactDOM.createRoot`** para renderizar la aplicación en el elemento HTML con id "root". La aplicación está configurada para usar **`<React.StrictMode>`** para activar estrictos avisos y comprobaciones adicionales para ayudar a detectar problemas potenciales en la aplicación. Además, utiliza un componente **`<AuthProvider>`** para proporcionar autenticación a la aplicación envolviendo el componente **`<App>`**.

- **`React`** y **`ReactDOM`** son importados desde los módulos de React.
- **`App`** es importado desde el archivo **`App.jsx`**.
- Se importa un archivo CSS local (**`index.css`**) para los estilos.
- **`AuthProvider`** es importado desde el componente **`AuthProvider.jsx`** para la autenticación.
- **`ReactDOM.createRoot(document.getElementById('root'))`** selecciona el elemento con el id "root" en el HTML donde se renderizará la aplicación.
- **`.render()`** renderiza el contenido de la aplicación.
- **`<React.StrictMode>`** envuelve la aplicación para activar el "Modo Estricto" de React, que ayuda a identificar problemas potenciales en la aplicación.
- **`<AuthProvider>`** es un componente utilizado para proporcionar autenticación a la aplicación.
- **`<App />`** es el componente principal de la aplicación que se renderiza dentro del **`<AuthProvider>`**.

# App.jsx

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%201.png)

Este código define un componente funcional llamado **`App`** que utiliza React Router para manejar las rutas y la navegación en una aplicación web. El componente **`App`** renderiza un enrutador (**`Router`**) que contiene un conjunto de rutas (**`Routes`**) definidas por las configuraciones especificadas en **`routes`** dentro de **`utils/routes.js`**. Cada ruta se representa como un componente **`<Route>`** dentro del **`<Routes>`** del enrutador.

- Se importa un archivo CSS local (**`App.css`**) para los estilos del componente.
- Se importan los módulos necesarios de **`react-router-dom`**:
    - **`BrowserRouter as Router`**: Importa **`BrowserRouter`** renombrándolo como **`Router`** para ser utilizado en el componente.
    - **`Route`**: Utilizado para definir rutas individuales dentro del enrutador.
    - **`Routes`**: Contenedor para todas las rutas de la aplicación.
- **`App`** es un componente funcional que renderiza la estructura principal de la aplicación.
- Utiliza **`<Router>`** como componente de enrutamiento principal para manejar las rutas de la aplicación.
- Dentro de **`<Router>`**, se utiliza **`<Routes>`** para definir el conjunto de rutas disponibles en la aplicación.
- **`{routes.map((r) => { ... })}`**: Itera sobre el array **`routes`** definido en **`utils/routes.js`** para generar dinámicamente un conjunto de **`<Route>`** componentes basados en la configuración de cada ruta.
    - **`r.path`**: Define la URL de la ruta.
    - **`r.element`**: Especifica el componente React que se renderizará cuando la ruta coincida.
    - **`key={r.id}`**: Proporciona una clave única para cada ruta, lo que ayuda a React a identificar y manejar los componentes de manera eficiente durante las actualizaciones.
- **`App`** se exporta como el componente predeterminado, lo que permite que otros archivos importen y utilicen este componente como **`import App from './App';`**.

# Routes.jsx

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%202.png)

Este código define un array llamado **`routes`** que contiene objetos representando las rutas disponibles en la aplicación. Cada objeto en el array representa una ruta específica con propiedades como **`id`**, **`path`** y **`element`**. Estas propiedades son utilizadas por el componente **`App`** para configurar las rutas en el enrutador (**`Router`**) usando React Router.

- Se importan los componentes **`Home`**, **`Login`**, **`Register`** y **`Game`** desde sus respectivas ubicaciones en el proyecto.
- **`routes`** es un array que contiene objetos, donde cada objeto representa una ruta en la aplicación.
- Cada objeto en **`routes`** tiene las siguientes propiedades:
    - **`id`**: Identificador único de la ruta.
    - **`path`**: URL de la ruta.
    - **`element`**: Componente React asociado a la ruta.
- Cuando la URL coincide con **`/`**, se renderiza el componente **`Home`**.
- Cuando la URL coincide con **`/login`**, se renderiza el componente **`Login`**.
- Cuando la URL coincide con **`/register`**, se renderiza el componente **`Register`**.
- Cuando la URL coincide con **`/game`**, se renderiza el componente **`Game`**

# Links.jsx

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%203.png)

Este código define un array llamado **`links`** que contiene objetos representando enlaces de navegación en una barra de navegación, por ejemplo. Cada objeto en el array representa un enlace con propiedades como **`id`**, **`link`** y **`text`**. Estas propiedades son utilizadas para renderizar elementos de navegación en la interfaz de usuario.

- **`links`** es un array que contiene objetos, donde cada objeto representa un enlace de navegación en la interfaz de usuario.
- Cada objeto en **`links`** tiene las siguientes propiedades:
    - **`id`**: Identificador único del enlace.
    - **`link`**: Destino del enlace, generalmente una URL relativa o un identificador.
    - **`text`**: Texto visible del enlace.
- Enlace a "HOME" (**`#inicio`**):
• Este enlace apunta a **`#inicio`** y muestra el texto "HOME".
- Enlace a "ABOUT" (**`#about`**):
• Este enlace apunta a **`#about`** y muestra el texto "ABOUT".
- Enlace a "FAQ" (**`#faq`**):
• Este enlace apunta a **`#faq`** y muestra el texto "FAQ".
- Enlace a "CONTACT" (**`#contact`**)
• Este enlace apunta a **`#contact`** y muestra el texto "CONTACT".

# Axios.jsx

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%204.png)

Este código utiliza Axios para crear una instancia de cliente HTTP configurada con una URL base. La instancia de Axios proporciona un cliente HTTP preconfigurado que puede realizar peticiones a la URL base especificada y realizar otras configuraciones adicionales según sea necesario.
• Se importa Axios, una librería para realizar peticiones HTTP desde el navegador o desde Node.js.

- **`axios.create()`** crea una nueva instancia de Axios con una configuración específica.
- **`baseURL: 'http://localhost:8080/'`**: Establece la URL base a la cual se enviarán las peticiones HTTP. En este caso, las peticiones se enviarán a **`http://localhost:8080/`**.
    - La URL base es la parte común de la URL para todas las peticiones realizadas con esta instancia de Axios.

# Register.jsx

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%205.png)

Este componente **`Register`** es responsable de renderizar un formulario de registro que permite a los usuarios registrarse en la aplicación. Utiliza múltiples estados para controlar la entrada de usuario, validar los campos del formulario y realizar una solicitud HTTP POST al servidor para registrar nuevos usuarios.

- Importa los módulos y componentes necesarios para el funcionamiento del componente **`Register`**.
- Utiliza **`useRef`**, **`useState`** y **`useEffect`** para manejar referencias, estados y efectos secundarios en el componente.
- Define expresiones regulares (**`USER_REGEX`**, **`PWD_REGEX`**, **`MAIL_REGEX`**) para validar el formato del nombre de usuario, contraseña y correo electrónico.
- **`REGISTER_URL`** especifica la URL a la cual se realizará la solicitud de registro.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%206.png)

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%207.png)

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%208.png)

- El componente **`Register`** renderiza un formulario de registro con campos para nombre de usuario, contraseña, confirmación de contraseña y correo electrónico.
- Utiliza estados (**`useState`**) para controlar los valores de los campos de entrada y el estado de validación.
- Utiliza **`useRef`** para crear referencias a elementos de entrada y mensajes de error.
- Utiliza **`useEffect`** para manejar efectos secundarios, como establecer el foco en un campo de entrada (**`userRef.current.focus()`**) o validar la entrada cuando cambian los valores (**`useEffect(() => { ... }, [user])`**).
- El método **`handleSubmit`** maneja la lógica de envío del formulario, realizando una solicitud POST al servidor utilizando Axios (**`axios.post(REGISTER_URL, { ... })`**) y gestionando las respuestas y posibles errores.
- El componente renderiza mensajes de error (**`errMsg`**) y un mensaje de éxito si el registro es exitoso (**`success`**). También muestra un enlace para iniciar sesión si el usuario ya está registrado.

El componente **`Register`** utiliza Axios (**`axios`**) para realizar solicitudes HTTP al servidor (**`axios.post`**) y expresiones regulares (**`USER_REGEX`**, **`PWD_REGEX`**, **`MAIL_REGEX`**) para validar los campos del formulario (**`USER_REGEX.test(user)`**, **`PWD_REGEX.test(pwd)`**, **`MAIL_REGEX.test(email)`**

- El componente **`Register`** muestra mensajes de ayuda y validación utilizando íconos (**`FontAwesomeIcon`**) de Font Awesome para indicar la validez de los campos.
- Utiliza **`aria-live="assertive"`** para proporcionar una experiencia accesible al usuario, anunciando mensajes de error importantes a través de tecnologías de asistencia.

# Login.jsx

El componente `Login` implementa un formulario interactivo de inicio de sesión de usuario en una aplicación React. Permite a los usuarios ingresar sus credenciales (correo electrónico y contraseña) para autenticarse en el sistema.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%209.png)

- Importa el componente `Login` en el archivo donde deseamos mostrar el formulario de inicio de sesión:
- Renderiza el componente `Login` dentro del componente principal o en la ruta deseada:
- `email`: Estado que almacena el correo electrónico ingresado por el usuario.
- `pwd`: Estado que almacena la contraseña ingresada por el usuario.
- `errMsg`: Estado que muestra mensajes de error en caso de problemas durante el inicio de sesión.
- `success`: Estado que indica si el inicio de sesión fue exitoso.
- `useState`: Utilizado para definir estados locales en el componente.
- `useRef`: Utilizado para crear referencias a elementos del DOM, como campos de entrada.
- `useEffect`: Utilizado para realizar efectos secundarios, como enfocar un campo al cargar el componente.
- `handleSubmit`: Función que se ejecuta al enviar el formulario de inicio de sesión. Realiza una solicitud HTTP POST al servidor para autenticar al usuario.
- `handleSuccessResponse`: Función que maneja la respuesta exitosa del servidor después de una autenticación exitosa. Actualiza el estado de autenticación global y muestra un mensaje de éxito.
- `handleError`: Función que maneja los errores durante el inicio de sesión, mostrando mensajes de error apropiados según el tipo de error.
- `axios`: Utilizado para realizar peticiones HTTP al servidor de autenticación.
- `AuthContext`: Utilizado para acceder al contexto de autenticación global y actualizar el estado de autenticación después del inicio de sesión.

# AuthProvider.jsx

El contexto de autenticación (`AuthProvider`) proporciona un contexto global en una aplicación React para gestionar el estado de autenticación del usuario.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%2010.png)

Para utilizar este contexto de autenticación en una aplicación React:

Encapsula la parte de la aplicación donde necesitamos acceder al estado de autenticación dentro del componente `AuthProvider`.

En los componentes hijos, podemos acceder al estado de autenticación utilizando el hook `useContext` con el contexto `AuthContext`.

- `auth`: Estado que almacena la información de autenticación, como el correo electrónico y el token de acceso.
- `setAuth`: Función utilizada para actualizar el estado de autenticación.
- `AuthProvider`: Componente de proveedor de contexto que envuelve otros componentes para proporcionar acceso al estado de autenticación a través del contexto `AuthContext`.
- `useState`: Utilizado en `AuthProvider` para definir y gestionar el estado de autenticación.
- `createContext`: Utilizado para crear el contexto `AuthContext` que permite compartir datos a través de la jerarquía de componentes.

# Home.jsx

El componente `Home` representa la página de inicio de la aplicación de juegos de damas (`Checkers Elite`). Proporciona una interfaz para que los usuarios se registren o inicien sesión y ofrece información sobre el juego y sus características.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%2011.png)

- **`React`**: Importa la librería principal de React para definir componentes.
- **`useNavigate`**: Hook de React Router para gestionar la navegación entre rutas.
- **`Navbar`**: Componente de barra de navegación.
- **`checkers`**: Importa una imagen (**`chekcershome.png`**) como recurso estático.
- **`"./Home.css"`**: Importa estilos CSS para el componente Home.
- **`routes`**: Importa un objeto con las rutas definidas en la aplicación.
- **`navigate`**: Variable que utiliza **`useNavigate()`** para obtener una función de navegación.
- **`navigateToRegister()`**: Función que maneja la navegación hacia la ruta '/register' al hacer clic en el botón "Sign up".
- **`navigateToLogin()`**: Función que maneja la navegación hacia la ruta '/login' al hacer clic en el botón "Login".
- Títulos (**`text1`**, **`text2`**): Textos descriptivos.
- Botones (**`botonlog`**, **`botonsign`**): Botones para iniciar sesión y registrarse, con funciones **`onClick`** que invocan **`navigateToLogin`** y **`navigateToRegister`** respectivamente.
- Secciones (**`page-section1`**, **`page-section2`**, **`section3`**, **`section4`**): Contenedores div con diferentes identificadores para contenido de secciones específicas.
- El componente **`Home`** renderiza una página principal que incluye una barra de navegación (**`Navbar`**), una imagen (**`checkerhome`**) y secciones con contenido y botones interactivos para navegación.
- Al hacer clic en los botones "Login" o "Sign up", se utiliza **`navigate`** para redirigir a las rutas correspondientes ('/login' o '/register').

# Game.jsx

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%2012.png)

Este componente **`Game`** representa el juego principal de damas dentro de la aplicación. Es responsable de renderizar el tablero de juego utilizando el componente **`Board`**.

- **`React`**: Librería principal de React para definir componentes.
- **`"./Game.css"`**: Archivo de estilos CSS específicos para el componente **`Game`**.
- **`Board`**: Componente que representa el tablero de juego.
- Este componente es una función de React que retorna un elemento JSX.
- Renderiza un contenedor **`<div>`** con **`id="gamechecker"`**.
- Dentro del contenedor, se incluye el componente **`Board`**, que muestra la interfaz del tablero de damas.

# Board.tsx

El componente **`Board`** es responsable de representar y gestionar el tablero de juego de damas. Este componente utiliza elementos **`Tile`** para renderizar cada casilla del tablero y manejar la interacción con las piezas de juego.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%2013.png)

- **`React`**: Importa la librería principal de React para definir componentes.
- **`useRef`**: Hook de React utilizado para acceder al elemento DOM del tablero.
- **`"./Board.css"`** y **`"./Tile/Tile.css"`**: Archivos de estilos CSS para el componente **`Board`** y sus subcomponentes **`Tile`**.
- **`Tile`**: Componente que representa cada casilla del tablero.
- **`piece1`** y **`piece2`**: Importa las imágenes de las piezas del juego.
- **`verticalAxis`** y **`horizontalAxis`**: Definen las coordenadas verticales (y) y horizontales (x) del tablero.
- **`Piece`**: Interfaz que define la estructura de una pieza del juego.
- **`pieces`**: Array que almacena las piezas del juego con sus respectivas posiciones en el tablero.
- **Componente Funcional `Board()`:**
    - Este componente es una función de React que retorna un elemento JSX.
    - Renderiza el tablero de juego con sus cuadrados y piezas correspondientes.
    - Gestiona la interacción del usuario con las piezas a través de eventos de ratón.
    

# Tile.tsx

El componente **`Tile`** representa un cuadrado individual del tablero de juego de damas. Este componente se encarga de renderizar visualmente un cuadrado negro o blanco, dependiendo de su posición en el tablero, y opcionalmente muestra una imagen de una pieza en el cuadrado.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%2014.png)

- **`React`**: Importa la librería principal de React para definir componentes.
- **`"./Tile.css"`**: Archivo de estilos CSS específicos para el componente **`Tile`**.
- **`piece1`**, **`piece2`**: Imágenes de las piezas del juego.
- **`image?: string`**: URL de la imagen de la pieza (opcional).
- **`number: number`**: Número que representa la posición del cuadrado en el tablero.
- **Componente Funcional `Tile({number, image}: Props)`:**
    - Este componente es una función de React que retorna un elemento JSX.
    - Renderiza un cuadrado negro o blanco (**`div`**) dependiendo del valor del número.
    - Opcionalmente muestra una imagen de una pieza en el cuadrado si se proporciona una URL de imagen.
    

# Lobby.jsx

El componente **`Lobby`** representa la interfaz de la sala de espera del juego de damas. Este componente permite al usuario elegir entre jugar contra otro usuario en línea, contra la computadora o cerrar sesión.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%2015.png)

- **`"./Lobby.css"`**: Archivo de estilos CSS específicos para el componente **`Lobby`**.
- Imágenes importadas para la interfaz (**`imgtablero`**, **`imglinea2`**, **`logocheckers`**, **`robot`**, **`uservsuser`**, **`linev`**, **`logout`**).
- **`useNavigate`** de **`react-router-dom`**: Librería para la navegación entre rutas.
- **Componente Funcional `Lobby()`:**
    - Este componente es una función de React que retorna un elemento JSX.
    - Renderiza la interfaz del lobby con secciones organizadas visualmente.
    - Utiliza botones para permitir al usuario navegar a diferentes rutas y opciones de juego.
- **Secciones del Lobby:**
    - **`section1`**: Muestra una imagen del tablero de damas.
    - **`section2`**: Contiene el logotipo del juego, título y botones de opciones de juego.
        - **`lobby-logo`**: Sección con el logotipo y líneas decorativas.
        - **`lobby-title`**: Título que indica el tipo de juego disponible.
        - **`lobby-options`**: Contenedor de botones para elegir entre jugar en línea o contra la computadora.
            - **`lobby-button1`**: Botón para jugar en línea contra otro usuario.
            - **`lobby-button2`**: Botón para jugar contra la computadora.
    - **`lobby-cierresesion`**: Sección para cerrar sesión con un botón de "Cerrar sesión".
    

# Modal.jsx

El componente **`Modal`** renderiza un modal condicionalmente basado en el estado proporcionado. Este componente permite mostrar o ocultar contenido dentro de un modal en la interfaz.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%2016.png)

- **`React`**: Importa la librería principal de React para definir componentes.
- **`"./Modal.css"`**: Archivo de estilos CSS específicos para el componente **`Modal`**.
- **Componente Funcional `Modal({ children, estado, cambiarEstado })`:**
    - Este componente es una función de React que recibe tres propiedades:
        - **`children`**: Contenido del modal que se mostrará cuando **`estado`** sea verdadero.
        - **`estado`**: Estado booleano que indica si el modal debe mostrarse (**`true`**) o no (**`false`**).
        - **`cambiarEstado`**: Función para cambiar el estado del modal.
        

# Personalizartablero.jsx

El componente **`Personalizartablero`** renderiza una sección que contiene botones para abrir y cerrar dos modales (**`Modal`**) diferentes. Cada modal tiene su propio estado (**`estadoModal1`** y **`estadoModal2`**) para controlar su visibilidad.

![Untitled](SoftwareDevelopment/Imagenes/Frontend/Untitled%2017.png)

- **`"./Personalizartab.css"`**: Archivo de estilos CSS específicos para el componente **`Personalizartablero`**.
- **`Modal`**: Componente **`Modal`** importado para mostrar los modales.
- **`React, { useState }`**: Importa la librería React y la función **`useState`** para manejar el estado local del componente.
- **Componente Funcional `Personalizartablero()`:**
    - Este componente es una función de React que utiliza el estado local (**`useState`**) para controlar la visibilidad de los modales.
    - Renderiza botones que, al hacer clic, cambian el estado de los respectivos modales para mostrar u ocultar su contenido.
<h1>Documentacion del Backend</h1>
<h2>1)Clase CorsConfig</h2>
<p>Esta clase es una configuracion de Spring que se encarga de configurar las
reglas de CORS(Cross-Origin Resource Sharing) para una aplicacion web. Ya que CORS es un
mecanismo de seguridad que nos permite restringir las solicitudes HTTP que se realizan desde
un origen diferente al del servidor donde se encuentra la aplicacion web.</p>

<h3>Importaciones de Spring</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/CorsConfig/CorsConfig1.png)
<p>Realizamos las importaciones necesarias</p>

<h3>Clase de configuracion de Spring</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/CorsConfig/CorsConfig2.png)
<p>@Configuracion es una anotacion para indicar que esta clase es una configuracion de Spring y ademas
implemento la interfaz WebMvcConfigurer permitiendo personalizar la configuracion de Spring MVC</p>

<h3>Clase de configuracion de Spring</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/CorsConfig/CorsConfig3.png)
<p>WebMvcConfigurer tiene este metodo como parte de la interfaz y la utiliza para agregar reglas de CORS
al registro</p>

<h3>Configuracion de reglas CORS</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/CorsConfig/CorsConfig4.png)
<p>Se configuran las reglas CORS para todas las rutas de la aplicacion, se permite que el origen sea http://localhost:5173,
se especifican los metodos HTTP permitidos, los encabezados permitidos, se permite el uso de credenciales y se estaablece el
tiempo maximo de cache para el preflights OPTIONS a 3600 segundos.</p>

<h3>Configuracion CORS especifica para la ruta /user/**</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/CorsConfig/CorsConfig5.png)
<p>Utilizo esta configuracion especifica para sobreescribir la configuracion global para la ruta /user/**, en este caso se deshabilita
el uso de credenciales, lo que significa que las solicitudes CORS no incluiran cookies de autenticacion u otros datos confidenciales en
las solicitudes</p>

<h2>2)Clase ValidationConfig</h2>
<p>La clase ValidationConfig es una clase de configuración de Spring que se encarga de definir y configurar un bean llamado UserValidation. 
Este bean representa un componente de validación de usuarios en el sistema.</p>

<h3>Importaciones de Spring</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/ValidationConfig/ValidationConfig1.png)
<p>Realizamos las importaciones necesarias</p>

<h3>Definicion del metodo de configuracion</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/ValidationConfig/ValidationConfig2.png)
<p>Declaro la clase como una configuraacion de Spring y defino el metodo userValidation() anotado con @Bean, este 
metodo es responsable de crear y configurar un bean de tipo UserValidation dentro del metodo para crear una nueva
instancia de UserValidation y lo retorne</p>

<h2>Clase Usercontroller</h2>
<h3>Importaciones de Spring</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/Usercontroller/Usercontroller1.png)
<p>Realizamos las importaciones necesarias</p>

<h3>Definicion de la clase Controladora</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/Usercontroller/Usercontroller2.png)
<p>La clase UserController se define como un controlador REST utilizando las anotaciones @RestController y 
@RequestMapping para mapear las solicitudes HTTP a metodos especificos de esta clase.</p>

<h3>Inyeccion de dependencias del servicio de usuario</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/Usercontroller/Usercontroller3.png)
<p>Utilizo la anotacion @Autowired para inyectar una instancia del servicio de usuarios</p>

<h3>Metodo GET para obtener todos los usuarios</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/Usercontroller/Usercontroller4.png)
<p>Este metodo maneja una solicitud GET en la ruta /user/find-all y devuelve una lista de todos los usuarios junto
con el codigo de estado HTTP OK(200)</p>

<h3>Metodo GET para obtener un usuario por su ID</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/Usercontroller/Usercontroller5.png)
<p>Este metodo maneja una solicitud GET en la ruta /user/{id}, donde {id} es el ID del usuario y devuelve un usuario
especifico por su ID junto con el codigo de estado HTTP OK(200) si se encuentra de lo contrario enviara un codigo
de estado NOT FOUND(404)</p>

<h2>Clase UserControllers</h2>
<h3>Importaciones de Spring</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserControllers/UserController1.png)
<p>Realizamos las importaciones necesarias</p>

<h3>Definicion del controllador REST y mapeo de la ruta base</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserControllers/UserController2.png)
<p>Defino la clase UserControllers como un controlador REST y mapea la ruta base /user
para todas las operaciones relacionadas con usuarios</p>

<h3>Inyeccion del servicio de usuarios</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserControllers/UserControllers3.png)
<p>Utilizo la anotacion @Autowired para inyectar una instancia del servicio de usuarios IUserService en el controlador</p>

<h3>Metodo para registrar un usuario</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserControllers/UserController4.png)
<p>Este método maneja una solicitud POST en la ruta /user/register para registrar un nuevo usuario. Se valida el usuario utilizando 
la clase UserValidation, en caso hay errores de validación, se devuelve una respuesta con el código de estado BadRequest (400). 
en caso la validación es exitosa, se llama al servicio para registrar al usuario y se devuelve la respuesta del servicio con el código 
de estado CREATED (201).</p>

<h3>Metodo para realizar el inicio de sesion de un usuario</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserControllers/UserController5.png)
<p>Este método maneja una solicitud POST en la ruta /user/login para realizar el inicio de sesión de un usuario, lo que hace es Llamar al servicio 
para realizar el inicio de sesión y obtiene el resultado. Si se genera un token de autenticación, devuelve la respuesta con el token 
y el código de estado OK (200). Si no se genera un token, devuelve la respuesta sin el token y el código de estado UNAUTHORIZED (401).</p>

<h2>Clase UserEntity</h2>
<p>la clase UserEntity representa una entidad JPA que mapea los datos de usuarios a una tabla en la base de datos. Utiliza Lombok para generar 
automáticamente los métodos getters, setters y constructores, y proporciona anotaciones de JPA para definir la estructura de la tabla y sus 
relaciones con los atributos de la clase.</p>

<h3>Importaciones de Spring</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserEntity/UserEntity1.png)
<p>Realizamos las importaciones necesarias</p>

<h3>Anotaciones de Lombok y JPA</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserEntity/UserEntity2.png)
<p>@Setter, @Getter, @AllArgsConstructor, @NoArgsConstructor y @Builder: Estas anotaciones son proporcionadas por Lombok, una biblioteca de Java que 
permite generar automáticamente los métodos getters, setters, constructores y otros métodos comunes. @Setter y @Getter generan automáticamente los 
métodos setter y getter para todos los campos de la clase. @AllArgsConstructor genera un constructor con todos los campos de la clase como parámetros. 
@NoArgsConstructor genera un constructor sin argumentos. @Builder permite la construcción de objetos utilizando el patrón de diseño Builder.
@Entity: Indica que la clase es una entidad JPA y está mapeada a una tabla en la base de datos, @Table(name = "users"): Especifica el nombre de la tabla 
en la base de datos a la que está mapeada la entidad.</p>

<h3>Anotaciones de JPA para los atributos</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserEntity/UserEntity3.png)
<p>@Id Indica que el atributo es la clave primaria de la entidad, @GeneratedValue(strategy = GenerationType.IDENTITY) especifica la estrategia de generación 
de valores para la clave primaria. En este caso, se utiliza la identidad de la base de datos para generar valores automáticamente 
@Column(name = "nombre de la columna") especifica el nombre de la columna en la tabla de la base de datos a la que está mapeado el atributo.</p>

<h3>Metodos Getters y Setters</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserEntity/UserEntity4.png)
<p>Se proporcionan métodos getters y setters para cada uno de los atributos de la clase para acceder y modificar sus valores.</p>

<h2>Interfaz UserRepository</h2>
<p>la interfaz UserRepository define métodos personalizados para buscar usuarios en la base de datos utilizando consultas SQL nativas. Estos métodos 
permiten buscar usuarios por correo electrónico y nombre de usuario.</p>

<h3>Importaciones de Spring</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserRepositoryInterface/UserRepositoryInterface1.png)
<p>Realizamos las importaciones necesarias</p>

<h3>Declaracion de la interfaz</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserRepositoryInterface/UserRepositoryInterface2.png)
<p>Esta línea declara la interfaz UserRepository, que extiende la interfaz JpaRepository. La interfaz JpaRepository es proporcionada por Spring 
Data JPA y proporciona métodos CRUD estándar para interactuar con la base de datos.</p>

<h3>Metodo findByEmail</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserRepositoryInterface/UserRepositoryInterface3.png)
<p>@Query(value = "SELECT * FROM users WHERE email= :email", nativeQuery = true): Esta anotación @Query indica que se realizará una consulta nativa a la base 
de datos para buscar un usuario por su correo electrónico. La consulta SQL se especifica como un valor de cadena, donde :email es un parámetro que se pasará a la consulta.
Optional<UserEntity>: El método devuelve un objeto Optional que contiene un UserEntity si se encuentra un usuario con el correo electrónico especificado, o un objeto Optional vacío si no se encuentra ningún usuario.</p>

<h3>Metodo findByName</h3>
![Imagen not found](/home/david/Documents/VersionaFinal2.0/SoftwareDevelopment/Imagenes/UserRepositoryInterface/UserRepositoryInterface4.png)
<p>Similar al método findByEmail, esta anotación @Query indica que se realizará una consulta nativa para buscar un usuario por su nombre de usuario.
El método devuelve un objeto Optional que contiene un UserEntity si se encuentra un usuario con el nombre de usuario especificado, o un objeto 
Optional vacío si no se encuentra ningún usuario.</p>

</body>
</html>
