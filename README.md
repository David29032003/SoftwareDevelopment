
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
<h1>Documentacion del Frontend</h1>
<h2> </h2>
<h2> </h2>
<h2> </h2>
<h2> </h2>
<h2> </h2>
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
