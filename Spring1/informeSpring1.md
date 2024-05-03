<html><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8"/><title>Historias de Usuario</title><style>
/* cspell:disable-file */
/* webkit printing magic: print all background colors */
html {
	-webkit-print-color-adjust: exact;
}
* {
	box-sizing: border-box;
	-webkit-print-color-adjust: exact;
}

html,
body {
margin: 0;
padding: 0;
}
@media only screen {
body {
margin: 2em auto;
max-width: 900px;
color: rgb(55, 53, 47);
}
}

body {
line-height: 1.5;
white-space: pre-wrap;
}

a,
a.visited {
color: inherit;
text-decoration: underline;
}

.pdf-relative-link-path {
font-size: 80%;
color: #444;
}

h1,
h2,
h3 {
letter-spacing: -0.01em;
line-height: 1.2;
font-weight: 600;
margin-bottom: 0;
}

.page-title {
font-size: 2.5rem;
font-weight: 700;
margin-top: 0;
margin-bottom: 0.75em;
}

h1 {
font-size: 1.875rem;
margin-top: 1.875rem;
}

h2 {
font-size: 1.5rem;
margin-top: 1.5rem;
}

h3 {
font-size: 1.25rem;
margin-top: 1.25rem;
}

.source {
border: 1px solid #ddd;
border-radius: 3px;
padding: 1.5em;
word-break: break-all;
}

.callout {
border-radius: 3px;
padding: 1rem;
}

figure {
margin: 1.25em 0;
page-break-inside: avoid;
}

figcaption {
opacity: 0.5;
font-size: 85%;
margin-top: 0.5em;
}

mark {
background-color: transparent;
}

.indented {
padding-left: 1.5em;
}

hr {
background: transparent;
display: block;
width: 100%;
height: 1px;
visibility: visible;
border: none;
border-bottom: 1px solid rgba(55, 53, 47, 0.09);
}

img {
max-width: 100%;
}

@media only print {
img {
max-height: 100vh;
object-fit: contain;
}
}

@page {
margin: 1in;
}

.collection-content {
font-size: 0.875rem;
}

.column-list {
display: flex;
justify-content: space-between;
}

.column {
padding: 0 1em;
}

.column:first-child {
padding-left: 0;
}

.column:last-child {
padding-right: 0;
}

.table_of_contents-item {
display: block;
font-size: 0.875rem;
line-height: 1.3;
padding: 0.125rem;
}

.table_of_contents-indent-1 {
margin-left: 1.5rem;
}

.table_of_contents-indent-2 {
margin-left: 3rem;
}

.table_of_contents-indent-3 {
margin-left: 4.5rem;
}

.table_of_contents-link {
text-decoration: none;
opacity: 0.7;
border-bottom: 1px solid rgba(55, 53, 47, 0.18);
}

table,
th,
td {
border: 1px solid rgba(55, 53, 47, 0.09);
border-collapse: collapse;
}

table {
border-left: none;
border-right: none;
}

th,
td {
font-weight: normal;
padding: 0.25em 0.5em;
line-height: 1.5;
min-height: 1.5em;
text-align: left;
}

th {
color: rgba(55, 53, 47, 0.6);
}

ol,
ul {
margin: 0;
margin-block-start: 0.6em;
margin-block-end: 0.6em;
}

li > ol:first-child,
li > ul:first-child {
margin-block-start: 0.6em;
}

ul > li {
list-style: disc;
}

ul.to-do-list {
padding-inline-start: 0;
}

ul.to-do-list > li {
list-style: none;
}

.to-do-children-checked {
text-decoration: line-through;
opacity: 0.375;
}

ul.toggle > li {
list-style: none;
}

ul {
padding-inline-start: 1.7em;
}

ul > li {
padding-left: 0.1em;
}

ol {
padding-inline-start: 1.6em;
}

ol > li {
padding-left: 0.2em;
}

.mono ol {
padding-inline-start: 2em;
}

.mono ol > li {
text-indent: -0.4em;
}

.toggle {
padding-inline-start: 0em;
list-style-type: none;
}

/* Indent toggle children */
.toggle > li > details {
padding-left: 1.7em;
}

.toggle > li > details > summary {
margin-left: -1.1em;
}

.selected-value {
display: inline-block;
padding: 0 0.5em;
background: rgba(206, 205, 202, 0.5);
border-radius: 3px;
margin-right: 0.5em;
margin-top: 0.3em;
margin-bottom: 0.3em;
white-space: nowrap;
}

.collection-title {
display: inline-block;
margin-right: 1em;
}

.page-description {
margin-bottom: 2em;
}

.simple-table {
margin-top: 1em;
font-size: 0.875rem;
empty-cells: show;
}
.simple-table td {
height: 29px;
min-width: 120px;
}

.simple-table th {
height: 29px;
min-width: 120px;
}

.simple-table-header-color {
background: rgb(247, 246, 243);
color: black;
}
.simple-table-header {
font-weight: 500;
}

time {
opacity: 0.5;
}

.icon {
display: inline-block;
max-width: 1.2em;
max-height: 1.2em;
text-decoration: none;
vertical-align: text-bottom;
margin-right: 0.5em;
}

img.icon {
border-radius: 3px;
}

.user-icon {
width: 1.5em;
height: 1.5em;
border-radius: 100%;
margin-right: 0.5rem;
}

.user-icon-inner {
font-size: 0.8em;
}

.text-icon {
border: 1px solid #000;
text-align: center;
}

.page-cover-image {
display: block;
object-fit: cover;
width: 100%;
max-height: 30vh;
}

.page-header-icon {
font-size: 3rem;
margin-bottom: 1rem;
}

.page-header-icon-with-cover {
margin-top: -0.72em;
margin-left: 0.07em;
}

.page-header-icon img {
border-radius: 3px;
}

.link-to-page {
margin: 1em 0;
padding: 0;
border: none;
font-weight: 500;
}

p > .user {
opacity: 0.5;
}

td > .user,
td > time {
white-space: nowrap;
}

input[type="checkbox"] {
transform: scale(1.5);
margin-right: 0.6em;
vertical-align: middle;
}

p {
margin-top: 0.5em;
margin-bottom: 0.5em;
}

.image {
border: none;
margin: 1.5em 0;
padding: 0;
border-radius: 0;
text-align: center;
}

.code,
code {
background: rgba(135, 131, 120, 0.15);
border-radius: 3px;
padding: 0.2em 0.4em;
border-radius: 3px;
font-size: 85%;
tab-size: 2;
}

code {
color: #eb5757;
}

.code {
padding: 1.5em 1em;
}

.code-wrap {
white-space: pre-wrap;
word-break: break-all;
}

.code > code {
background: none;
padding: 0;
font-size: 100%;
color: inherit;
}

blockquote {
font-size: 1.25em;
margin: 1em 0;
padding-left: 1em;
border-left: 3px solid rgb(55, 53, 47);
}

.bookmark {
text-decoration: none;
max-height: 8em;
padding: 0;
display: flex;
width: 100%;
align-items: stretch;
}

.bookmark-title {
font-size: 0.85em;
overflow: hidden;
text-overflow: ellipsis;
height: 1.75em;
white-space: nowrap;
}

.bookmark-text {
display: flex;
flex-direction: column;
}

.bookmark-info {
flex: 4 1 180px;
padding: 12px 14px 14px;
display: flex;
flex-direction: column;
justify-content: space-between;
}

.bookmark-image {
width: 33%;
flex: 1 1 180px;
display: block;
position: relative;
object-fit: cover;
border-radius: 1px;
}

.bookmark-description {
color: rgba(55, 53, 47, 0.6);
font-size: 0.75em;
overflow: hidden;
max-height: 4.5em;
word-break: break-word;
}

.bookmark-href {
font-size: 0.75em;
margin-top: 0.25em;
}

.sans { font-family: ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol"; }
.code { font-family: "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace; }
.serif { font-family: Lyon-Text, Georgia, ui-serif, serif; }
.mono { font-family: iawriter-mono, Nitti, Menlo, Courier, monospace; }
.pdf .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK JP'; }
.pdf:lang(zh-CN) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK SC'; }
.pdf:lang(zh-TW) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK TC'; }
.pdf:lang(ko-KR) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK KR'; }
.pdf .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }
.pdf:lang(zh-CN) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }
.pdf:lang(zh-TW) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }
.pdf:lang(ko-KR) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }
.pdf .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK JP'; }
.pdf:lang(zh-CN) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK SC'; }
.pdf:lang(zh-TW) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK TC'; }
.pdf:lang(ko-KR) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK KR'; }
.pdf .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }
.pdf:lang(zh-CN) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }
.pdf:lang(zh-TW) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }
.pdf:lang(ko-KR) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }
.highlight-default {
color: rgba(55, 53, 47, 1);
}
.highlight-gray {
color: rgba(120, 119, 116, 1);
fill: rgba(120, 119, 116, 1);
}
.highlight-brown {
color: rgba(159, 107, 83, 1);
fill: rgba(159, 107, 83, 1);
}
.highlight-orange {
color: rgba(217, 115, 13, 1);
fill: rgba(217, 115, 13, 1);
}
.highlight-yellow {
color: rgba(203, 145, 47, 1);
fill: rgba(203, 145, 47, 1);
}
.highlight-teal {
color: rgba(68, 131, 97, 1);
fill: rgba(68, 131, 97, 1);
}
.highlight-blue {
color: rgba(51, 126, 169, 1);
fill: rgba(51, 126, 169, 1);
}
.highlight-purple {
color: rgba(144, 101, 176, 1);
fill: rgba(144, 101, 176, 1);
}
.highlight-pink {
color: rgba(193, 76, 138, 1);
fill: rgba(193, 76, 138, 1);
}
.highlight-red {
color: rgba(212, 76, 71, 1);
fill: rgba(212, 76, 71, 1);
}
.highlight-gray_background {
background: rgba(241, 241, 239, 1);
}
.highlight-brown_background {
background: rgba(244, 238, 238, 1);
}
.highlight-orange_background {
background: rgba(251, 236, 221, 1);
}
.highlight-yellow_background {
background: rgba(251, 243, 219, 1);
}
.highlight-teal_background {
background: rgba(237, 243, 236, 1);
}
.highlight-blue_background {
background: rgba(231, 243, 248, 1);
}
.highlight-purple_background {
background: rgba(244, 240, 247, 0.8);
}
.highlight-pink_background {
background: rgba(249, 238, 243, 0.8);
}
.highlight-red_background {
background: rgba(253, 235, 236, 1);
}
.block-color-default {
color: inherit;
fill: inherit;
}
.block-color-gray {
color: rgba(120, 119, 116, 1);
fill: rgba(120, 119, 116, 1);
}
.block-color-brown {
color: rgba(159, 107, 83, 1);
fill: rgba(159, 107, 83, 1);
}
.block-color-orange {
color: rgba(217, 115, 13, 1);
fill: rgba(217, 115, 13, 1);
}
.block-color-yellow {
color: rgba(203, 145, 47, 1);
fill: rgba(203, 145, 47, 1);
}
.block-color-teal {
color: rgba(68, 131, 97, 1);
fill: rgba(68, 131, 97, 1);
}
.block-color-blue {
color: rgba(51, 126, 169, 1);
fill: rgba(51, 126, 169, 1);
}
.block-color-purple {
color: rgba(144, 101, 176, 1);
fill: rgba(144, 101, 176, 1);
}
.block-color-pink {
color: rgba(193, 76, 138, 1);
fill: rgba(193, 76, 138, 1);
}
.block-color-red {
color: rgba(212, 76, 71, 1);
fill: rgba(212, 76, 71, 1);
}
.block-color-gray_background {
background: rgba(241, 241, 239, 1);
}
.block-color-brown_background {
background: rgba(244, 238, 238, 1);
}
.block-color-orange_background {
background: rgba(251, 236, 221, 1);
}
.block-color-yellow_background {
background: rgba(251, 243, 219, 1);
}
.block-color-teal_background {
background: rgba(237, 243, 236, 1);
}
.block-color-blue_background {
background: rgba(231, 243, 248, 1);
}
.block-color-purple_background {
background: rgba(244, 240, 247, 0.8);
}
.block-color-pink_background {
background: rgba(249, 238, 243, 0.8);
}
.block-color-red_background {
background: rgba(253, 235, 236, 1);
}
.select-value-color-uiBlue { background-color: rgba(35, 131, 226, .07); }
.select-value-color-pink { background-color: rgba(245, 224, 233, 1); }
.select-value-color-purple { background-color: rgba(232, 222, 238, 1); }
.select-value-color-green { background-color: rgba(219, 237, 219, 1); }
.select-value-color-gray { background-color: rgba(227, 226, 224, 1); }
.select-value-color-transparentGray { background-color: rgba(227, 226, 224, 0); }
.select-value-color-translucentGray { background-color: rgba(255, 255, 255, 0.0375); }
.select-value-color-orange { background-color: rgba(250, 222, 201, 1); }
.select-value-color-brown { background-color: rgba(238, 224, 218, 1); }
.select-value-color-red { background-color: rgba(255, 226, 221, 1); }
.select-value-color-yellow { background-color: rgba(253, 236, 200, 1); }
.select-value-color-blue { background-color: rgba(211, 229, 239, 1); }
.select-value-color-pageGlass { background-color: undefined; }
.select-value-color-washGlass { background-color: undefined; }

.checkbox {
display: inline-flex;
vertical-align: text-bottom;
width: 16;
height: 16;
background-size: 16px;
margin-left: 2px;
margin-right: 5px;
}

.checkbox-on {
background-image: url("data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2216%22%20height%3D%2216%22%20viewBox%3D%220%200%2016%2016%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%0A%3Crect%20width%3D%2216%22%20height%3D%2216%22%20fill%3D%22%2358A9D7%22%2F%3E%0A%3Cpath%20d%3D%22M6.71429%2012.2852L14%204.9995L12.7143%203.71436L6.71429%209.71378L3.28571%206.2831L2%207.57092L6.71429%2012.2852Z%22%20fill%3D%22white%22%2F%3E%0A%3C%2Fsvg%3E");
}

.checkbox-off {
background-image: url("data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2216%22%20height%3D%2216%22%20viewBox%3D%220%200%2016%2016%22%20fill%3D%22none%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%3E%0A%3Crect%20x%3D%220.75%22%20y%3D%220.75%22%20width%3D%2214.5%22%20height%3D%2214.5%22%20fill%3D%22white%22%20stroke%3D%22%2336352F%22%20stroke-width%3D%221.5%22%2F%3E%0A%3C%2Fsvg%3E");
}

</style></head><body><article id="b52f3362-5013-492d-8944-96e87be659ba" class="page sans"><header><h1 class="page-title">Historias de Usuario</h1><p class="page-description"></p></header><div class="page-body"><ol type="1" id="af60309a-9edd-4cd3-a2e5-5bb88b8727d8" class="numbered-list" start="1"><li><strong>Historias de usuarios</strong></li></ol><table id="d74443a0-0c29-4e37-b8cb-6b480a5d0b6d" class="simple-table"><tbody><tr id="68d199ca-cb04-419a-b2fb-7fe9fdb62429"><td id="}bA&lt;" class=""><strong>ID</strong></td><td id="WK\y" class=""><strong>Nombre de la historia de usuario</strong></td><td id="mgwQ" class=""><strong>Descripción de la historia de usuario</strong></td><td id=";}GX" class=""><strong>Prioridad</strong></td><td id="]K:b" class=""><strong>Esfuerzo estimado (horas)</strong></td><td id="Q?Un" class=""><strong>Esfuerzo real (si se completa)</strong></td><td id="MrL\" class=""><strong>Estado (completado, pendiente, en curso )</strong></td><td id=":bbc" class=""><strong>Desarrollador</strong></td></tr><tr id="0184590d-9ef8-4025-8d7e-860b2c54cbb3"><td id="}bA&lt;" class="">1</td><td id="WK\y" class="">Registrar usuario</td><td id="mgwQ" class="">Como nuevo usuario, necesito crear una cuenta para poder iniciar sesión</td><td id=";}GX" class="">Alto</td><td id="]K:b" class="">17h</td><td id="Q?Un" class="">22h</td><td id="MrL\" class="">En curso</td><td id=":bbc" class="">Reeves Goñi, Ruiz Arica</td></tr><tr id="ce665aef-93b0-4dde-983d-e4ec8dcbcdd1"><td id="}bA&lt;" class="">2</td><td id="WK\y" class="">Iniciar Sesion</td><td id="mgwQ" class="">Como usuario necesito iniciar sesion para poder jugar</td><td id=";}GX" class="">Alto</td><td id="]K:b" class="">14h</td><td id="Q?Un" class="">17h</td><td id="MrL\" class="">En curso</td><td id=":bbc" class="">Reeves Goñi, Ruiz Arica,Ravichagua Marin</td></tr><tr id="71d5378e-17bd-457a-b3d3-f4cb2d02228e"><td id="}bA&lt;" class="">3</td><td id="WK\y" class="">Cierre de sesion</td><td id="mgwQ" class="">Como usuario necesito cerrarr sesion para poder salir del jugo</td><td id=";}GX" class="">Medio</td><td id="]K:b" class="">6h</td><td id="Q?Un" class="">9h</td><td id="MrL\" class="">En curso</td><td id=":bbc" class="">Reeves Goñi, Ruiz Arica</td></tr><tr id="f2ee6fe4-a555-4375-a945-63ce717a4c99"><td id="}bA&lt;" class="">4</td><td id="WK\y" class="">Visualizacion del tablero</td><td id="mgwQ" class="">Como usuario que inicio sesion, necesito visualizar el tablero ara jugar</td><td id=";}GX" class="">Medio</td><td id="]K:b" class="">8h</td><td id="Q?Un" class="">12h</td><td id="MrL\" class="">Pendiente</td><td id=":bbc" class="">Ruiz Arica</td></tr><tr id="5271d060-9c31-4d3d-a87a-8651eb9907af"><td id="}bA&lt;" class="">5</td><td id="WK\y" class="">Jugar con el computador</td><td id="mgwQ" class="">Como usuario quiero jugar con el computador</td><td id=";}GX" class="">Alto</td><td id="]K:b" class="">19h</td><td id="Q?Un" class="">21h</td><td id="MrL\" class="">Pendiente</td><td id=":bbc" class="">Ruiz Arica</td></tr></tbody></table><ol type="1" id="70a951ab-371f-47c9-bbb9-441e6da3892f" class="numbered-list" start="1"><li><strong>Criterios de Aceptación (AC)</strong></li></ol><table id="69af73a0-24d8-4537-872e-3453c1d392a5" class="simple-table"><tbody><tr id="e0b46d30-a13c-4575-84a3-062f8868550b"><td id="?I|?" class=""><strong>ID y nombre de la historia del usuario</strong></td><td id="f][t" class=""><strong>ACID</strong></td><td id="=Cmh" class="" style="width:119px"><strong>Descripción del criterio de aceptación</strong></td><td id="gRej" class=""><strong>Estado (completado, pendiente, en progreso)</strong></td><td id="ZvGn" class=""><strong>Desarrollador</strong></td></tr><tr id="3fc5e9b6-8e86-47d2-b959-2b8ac012fcd0"><td id="?I|?" class="">1 Registrar usuario</td><td id="f][t" class="">1.1Creación exitosa de una cuenta de usuario válida</td><td id="=Cmh" class="" style="width:119px"><strong>Dado </strong>un nombre de usuario válido inexistente<strong><br/>Cuando<br/></strong> creo una cuenta con este nombre usuario<strong><br/>Y<br/></strong> una contraseña válida que coincida con la contraseña confirmada<strong><br/>Y <br/></strong>una direccion de correo electrónico válida<strong><br/>Entonces<br/></strong> el sistema deberían crear unaa nueva cuenta.<br/><br/><strong>Y</strong> mostrar un mensaje de que me he registrado con éxito.</td><td id="gRej" class="">En progreso</td><td id="ZvGn" class="">- Ruiz Milagros<br/>- Ravichagua Manuel<br/>- Reeves David<br/></td></tr><tr id="6b6bdc05-9116-42f4-8b86-68b61c797d91"><td id="?I|?" class=""></td><td id="f][t" class="">1.2 Creación de una cuenta fallida con un nombre de usuario existente</td><td id="=Cmh" class="" style="width:119px"><strong>Dado </strong>un nombre de usuario que ya existe<strong><br/>Cuando<br/></strong> creo una cuenta con este nombre de usuario<strong><br/>Y<br/></strong> una contraseña válida que coincida con la contraseña confirmada<strong><br/>Y<br/></strong> una dirección de correo electrónico válida<strong><br/>Entonces<br/></strong> el sistema no debería crear una nueva cuenta<strong><br/>Y<br/></strong> debería mostrar un mensaje de error.
<br/><br/></td><td id="gRej" class="">En progreso</td><td id="ZvGn" class="">- Ruiz Milagros<br/>- Ravichagua Manuel<br/>- Reeves David<br/></td></tr><tr id="a715a870-f20e-4653-a325-3713f6b0b143"><td id="?I|?" class=""></td><td id="f][t" class="">1.3Creación fallida de una contraseña existente</td><td id="=Cmh" class="" style="width:119px"><strong>Dado </strong>un nombre de usuario válido inexistente<strong><br/>Cuando<br/></strong> un usuario crea una cuenta con este nombre de usuario<strong><br/>Y<br/></strong> una contraseña no válida<strong><br/>Y<br/></strong> la misma contraseña confirmada<strong><br/>Y<br/></strong> una dirección de correo electrónico no válida<strong><br/>Entonces<br/></strong> el sistema no debería crear una nueva cuenta<strong><br/>Y<br/></strong> debería mostrar un mensaje de error.</td><td id="gRej" class="">En progreso</td><td id="ZvGn" class="">- Ruiz Milagros<br/>- Ravichagua Manuel<br/>- Reeves David<br/></td></tr><tr id="84c68b97-5f97-4e36-83df-dccac9d0c634"><td id="?I|?" class="">2 Iniciar Sesion</td><td id="f][t" class="">2.1Inicio de sesión exitoso con credenciales válidas</td><td id="=Cmh" class="" style="width:119px"><strong>Dado </strong>un usuario ya registrado <strong>y</strong> confirmado<strong><br/>Cuando<br/></strong> ingrese el nombre de usuario<strong><br/>Y<br/></strong> la contraseña válida<strong><br/>Entonces<br/></strong> el sistema debería autenticar exitosamente<strong><br/>Y<br/></strong> redirigir a la página de inicio</td><td id="gRej" class="">En progreso</td><td id="ZvGn" class="">- Ruiz Milagros<br/>- Reeves David<br/></td></tr><tr id="06443424-b6cb-46de-aed5-7525106cd5ee"><td id="?I|?" class=""></td><td id="f][t" class="">2.2Intento fallido de inicio de sesión con contraseña incorrecta</td><td id="=Cmh" class="" style="width:119px"><strong>Dado </strong>un usuario ya registrado <strong>y </strong>confirmado<strong><br/>Cuando<br/></strong> ingreso un nombre de usuario<br/><br/><strong>Y</strong> la contraseña incorrecta<strong><br/>Entonces<br/></strong> el sistema debería no autenticar exitosamente<strong><br/>Y<br/></strong> debería mostrar un mensaje de error.</td><td id="gRej" class="">En progreso</td><td id="ZvGn" class="">- Ruiz Milagros<br/>- Reeves David<br/></td></tr><tr id="c8b2de6a-f567-448d-a03a-4485b2be3994"><td id="?I|?" class=""></td><td id="f][t" class="">2.3Intento de inicio de sesión con un nombre de usuario inexistente</td><td id="=Cmh" class="" style="width:119px"><strong>Dado </strong>un nombre de usuario inexistente<strong><br/>Cuando<br/></strong> ingreso un nombre de usuario<strong><br/>Y<br/></strong> una contraseña inexistente<strong><br/>Entonces<br/></strong> el sistema debería no permitir iniciar sesión<strong><br/>Y<br/></strong> mostrar un mensaje de error.</td><td id="gRej" class="">En progreso</td><td id="ZvGn" class="">- Ruiz Milagros<br/>- Reeves David<br/></td></tr><tr id="a914cdc6-34ba-44f6-9f10-4027163dab47"><td id="?I|?" class=""></td><td id="f][t" class="">2.4Intento de inicio de sesión con un correo electrónico no asociado a ningún usuario</td><td id="=Cmh" class="" style="width:119px"><strong>Dado</strong> un correo electrónico que no esta asociado a ningun usuario registrado<strong><br/>Cuando<br/></strong> ingreso un correo no registrado<strong><br/>Y<br/></strong> una contraseña inexistente<strong><br/>Entonces<br/></strong> el sistema debería no autenticar exitosamente<strong><br/>Y<br/></strong> debería mostrar un mensaje de error.</td><td id="gRej" class="">En progreso</td><td id="ZvGn" class="">- Ruiz Milagros<br/>- Reeves David<br/></td></tr><tr id="fca9b1b9-8509-4021-8310-7173149a3ddf"><td id="?I|?" class="">3 Cierre de Sesion</td><td id="f][t" class="">3.1 Cierre de sesión exitoso de una cuenta registrada</td><td id="=Cmh" class="" style="width:119px"><strong>Dado </strong>un usuario con una cuenta registrada
<strong>Y </strong>autenticacion exitosa<strong><br/>Cuando<br/></strong> presiono el botón de cerrar sesión<strong><br/>Y<br/></strong> confirmo el mensaje de aceptación<strong><br/>Entonces<br/></strong> el sistema debería cerrar sesión de la cuenta registrada<strong><br/>Y<br/></strong> redirigir a la pagina de inicio de sesión.</td><td id="gRej" class="">En progreso</td><td id="ZvGn" class="">- Ruiz Milagros<br/>- Reeves David<br/></td></tr></tbody></table><ol type="1" id="4973b1ce-e322-42f3-b182-e6257bd64bff" class="numbered-list" start="1"><li><strong>Tareas de implementación</strong></li></ol><p id="706fef41-9c46-4bb0-9665-52aba16f86b9" class="">Resumen del código de producción.</p><table id="b0fd3b74-557f-48bf-8739-7a235528b093" class="simple-table"><thead class="simple-table-header"><tr id="51a3d456-8335-4e14-a74b-cdffe0a567db"><th id=":\Mw" class="simple-table-header-color simple-table-header"><strong>ID y nombre de la historia del usuario</strong></th><th id="iewC" class="simple-table-header-color simple-table-header"><strong>AC</strong><br/><br/><strong>ID</strong></th><th id="lXqi" class="simple-table-header-color simple-table-header"><strong>Nombre(s) de clase</strong></th><th id="kqK\" class="simple-table-header-color simple-table-header"><strong>Nombre(s) del método</strong></th><th id="NT~{" class="simple-table-header-color simple-table-header"><strong>Desarrollador</strong></th><th id="}vxh" class="simple-table-header-color simple-table-header"><strong>Estado</strong></th><th id="aAzc" class="simple-table-header-color simple-table-header"><strong>Notas (opcional)</strong></th></tr></thead><tbody><tr id="e02acafa-31a0-478b-b84b-9e8a4108da92"><td id=":\Mw" class="">1Registrar usuario</td><td id="iewC" class="">1.1Creación exitosa de una cuenta de usuario válida</td><td id="lXqi" class="">Register.jsx</td><td id="kqK\" class=""></td><td id="NT~{" class="">Reeves Goñi ,<br/>Ruiz Arica<br/></td><td id="}vxh" class="">Terminado</td><td id="aAzc" class="">La clase Register.jsx pertenece al frontend, y la clase ….</td></tr><tr id="5793f0de-0626-45d9-9c7c-960f2cd19cad"><td id=":\Mw" class=""></td><td id="iewC" class="">1.2 Creación de una cuenta fallida con un nombre de usuario existente</td><td id="lXqi" class="">Register.jsx</td><td id="kqK\" class=""></td><td id="NT~{" class="">Reeves Goñi ,<br/>Ruiz Arica<br/></td><td id="}vxh" class="">Terminado</td><td id="aAzc" class="">La clase Register.jsx pertenece al frontend, y la clase ….</td></tr><tr id="4a523357-6875-4885-aaab-71b025681bd7"><td id=":\Mw" class=""></td><td id="iewC" class="">1.3Creación fallida de una contraseña existente</td><td id="lXqi" class="">Register.jsx</td><td id="kqK\" class=""></td><td id="NT~{" class="">Reeves Goñi ,<br/>Ruiz Arica<br/></td><td id="}vxh" class="">Terminado</td><td id="aAzc" class="">La clase Register.jsx pertenece al frontend, y la clase ….</td></tr><tr id="219d5bfb-82a4-4e69-ace8-e1d012603b9b"><td id=":\Mw" class="">2Iniciar Sesion</td><td id="iewC" class="">2.1Inicio de sesión exitoso con credenciales válidas</td><td id="lXqi" class="">Login.jsx</td><td id="kqK\" class=""></td><td id="NT~{" class="">Reeves Goñi ,<br/>Ruiz Arica<br/></td><td id="}vxh" class="">Terminado</td><td id="aAzc" class="">La clase Login.jsx pertenece al frontend, y la clase ….</td></tr><tr id="f0f07503-dda8-46cb-b6ae-5eef051304b2"><td id=":\Mw" class=""></td><td id="iewC" class="">2.2Intento fallido de inicio de sesión con contraseña incorrecta</td><td id="lXqi" class="">Login.jsx</td><td id="kqK\" class=""></td><td id="NT~{" class="">Reeves Goñi ,<br/>Ruiz Arica<br/></td><td id="}vxh" class="">Terminado</td><td id="aAzc" class="">La clase Login.jsx pertenece al frontend, y la clase ….</td></tr><tr id="ef6e5988-124e-4410-8173-ff613e8b7d75"><td id=":\Mw" class=""></td><td id="iewC" class="">2.3Intento de inicio de sesión con un nombre de usuario inexistente</td><td id="lXqi" class="">Login.jsx</td><td id="kqK\" class=""></td><td id="NT~{" class="">Reeves Goñi ,<br/>Ruiz Arica<br/></td><td id="}vxh" class="">Terminado</td><td id="aAzc" class="">La clase Login.jsx pertenece al frontend, y la clase ….</td></tr><tr id="4fefd418-ffe1-45f3-8bcd-671ce4b15c48"><td id=":\Mw" class=""></td><td id="iewC" class="">2.4Intento de inicio de sesión con un correo electrónico no asociado a ningún usuario</td><td id="lXqi" class="">Login.jsx</td><td id="kqK\" class=""></td><td id="NT~{" class="">Reeves Goñi ,<br/>Ruiz Arica<br/></td><td id="}vxh" class="">Terminado</td><td id="aAzc" class="">La clase Login.jsx pertenece al frontend, y la clase ….</td></tr><tr id="2790d7ce-2006-4eb4-b5bf-de3f69866b55"><td id=":\Mw" class="">3.Cierre de sesion</td><td id="iewC" class="">3.1Cierre de sesión exitoso de una cuenta registrada</td><td id="lXqi" class="">Lobby.jsx</td><td id="kqK\" class=""></td><td id="NT~{" class="">Reeves Goñi ,<br/>Ruiz Arica<br/></td><td id="}vxh" class="">Terminado</td><td id="aAzc" class="">La clase Lobby.jsx pertenece al frontend, y la clase ….</td></tr></tbody></table><p id="0bcc11c0-d6e1-4cf3-a122-1df8415492ee" class="">Resumen del código de prueba automatizado (que corresponde directamente a algunos criterios de aceptación)</p><table id="4e035881-349a-4cd3-ac8b-ed6fb206526e" class="simple-table"><tbody><tr id="4dc35ff3-9a24-4598-938b-de6dfc80ac9d"><td id="hFTZ" class=""><strong>ID y nombre de la historia del usuario</strong></td><td id="rEFD" class=""><strong>ID del criterio de aceptación</strong></td><td id="]_@z" class=""><strong>Nombre(s) de clase del código de prueba</strong></td><td id="wRlM" class=""><strong>Nombre(s) del método del código de prueba</strong></td><td id="N};b" class=""><strong>Descripción del caso de prueba (entrada y salida esperada)</strong></td><td id="FYih" class=""><strong>Estado</strong></td><td id="hfiq" class=""><strong>Desarrollador</strong></td></tr><tr id="589ab663-fd55-45cf-b7ed-4a105c9bd2b8"><td id="hFTZ" class="">1Registrar usuario</td><td id="rEFD" class="">1.1Creación exitosa de una cuenta de usuario válida</td><td id="]_@z" class="">dav</td><td id="wRlM" class=""></td><td id="N};b" class=""></td><td id="FYih" class="">Terminado</td><td id="hfiq" class="">Reeves Goñi David</td></tr><tr id="6b5dfd97-6c46-463c-b091-c6c5402eb96e"><td id="hFTZ" class=""></td><td id="rEFD" class="">1.2 Creación de una cuenta fallida con un nombre de usuario existente</td><td id="]_@z" class="">dav</td><td id="wRlM" class=""></td><td id="N};b" class=""></td><td id="FYih" class="">Terminado</td><td id="hfiq" class="">Reeves Goñi David</td></tr><tr id="37a99656-c463-469f-85e3-6eca10b64cf1"><td id="hFTZ" class=""></td><td id="rEFD" class="">1.3Creación fallida de una contraseña existente</td><td id="]_@z" class="">dav</td><td id="wRlM" class=""></td><td id="N};b" class=""></td><td id="FYih" class="">Terminado</td><td id="hfiq" class="">Reeves Goñi David</td></tr><tr id="f65acaed-25a4-46e0-b991-d755aaa6e277"><td id="hFTZ" class="">2Iniciar Sesion</td><td id="rEFD" class="">2.1Inicio de sesión exitoso con credenciales válidas</td><td id="]_@z" class="">dav</td><td id="wRlM" class=""></td><td id="N};b" class=""></td><td id="FYih" class="">Terminado</td><td id="hfiq" class="">Reeves Goñi David</td></tr><tr id="291bdfb0-2b48-463a-aae9-f4248b01644d"><td id="hFTZ" class=""></td><td id="rEFD" class="">2.2Intento fallido de inicio de sesión con contraseña incorrecta</td><td id="]_@z" class="">dav</td><td id="wRlM" class=""></td><td id="N};b" class=""></td><td id="FYih" class="">Terminado</td><td id="hfiq" class="">Reeves Goñi David</td></tr><tr id="199183d7-3194-4b04-bca5-a101ea77897c"><td id="hFTZ" class=""></td><td id="rEFD" class="">2.3Intento de inicio de sesión con un nombre de usuario inexistente</td><td id="]_@z" class="">dav</td><td id="wRlM" class=""></td><td id="N};b" class=""></td><td id="FYih" class="">Terminado</td><td id="hfiq" class="">Reeves Goñi David</td></tr><tr id="3d0519a9-f6c7-46e3-b329-caa185c2626b"><td id="hFTZ" class=""></td><td id="rEFD" class="">2.4Intento de inicio de sesión con un correo electrónico no asociado a ningún usuario</td><td id="]_@z" class="">davdav</td><td id="wRlM" class=""></td><td id="N};b" class=""></td><td id="FYih" class="">Terminado</td><td id="hfiq" class="">Reeves Goñi David</td></tr><tr id="58ae8e2d-58af-434b-a737-545bfbb84553"><td id="hFTZ" class="">3.Cierre de sesion</td><td id="rEFD" class="">3.1Cierre de sesión exitoso de una cuenta registrada</td><td id="]_@z" class="">dav</td><td id="wRlM" class=""></td><td id="N};b" class=""></td><td id="FYih" class="">Terminado</td><td id="hfiq" class="">Reeves Goñi David</td></tr></tbody></table><p id="c82af739-231b-43c2-9c31-b13c0377c146" class="">Resumen de casos de prueba manuales (que corresponden directamente a algunos criterios de aceptación)</p><table id="f2f5d781-4a74-442c-8f10-c8ba6e770002" class="simple-table"><tbody><tr id="c3382ff5-252b-4212-b094-85f377cfb210"><td id="JVSs" class=""><strong>ID y nombre de la historia del usuario</strong></td><td id="qobD" class=""><strong>ID del criterio de aceptación</strong></td><td id="VfPS" class=""><strong>Entrada de caso de prueba</strong></td><td id="G~}V" class=""><strong>Prueba de Oracle (resultado esperado)</strong></td><td id="V@SB" class=""><strong>Estado</strong></td><td id="Jux=" class=""><strong>Notas</strong></td><td id="cJO{" class=""><strong>Desarrollador</strong></td></tr><tr id="79059c94-418a-4648-a1fe-6bc32ae3a57f"><td id="JVSs" class="">1Registrar usuario</td><td id="qobD" class="">1.1</td><td id="VfPS" class=""></td><td id="G~}V" class=""></td><td id="V@SB" class=""></td><td id="Jux=" class=""></td><td id="cJO{" class=""></td></tr><tr id="3a56c136-c77c-4413-9538-158d86e547a0"><td id="JVSs" class=""></td><td id="qobD" class="">1.2</td><td id="VfPS" class=""></td><td id="G~}V" class=""></td><td id="V@SB" class=""></td><td id="Jux=" class=""></td><td id="cJO{" class=""></td></tr><tr id="2c6fa449-4ed7-401a-b52c-ac44af632d59"><td id="JVSs" class=""></td><td id="qobD" class="">…</td><td id="VfPS" class=""></td><td id="G~}V" class=""></td><td id="V@SB" class=""></td><td id="Jux=" class=""></td><td id="cJO{" class=""></td></tr><tr id="1e3e8226-d162-4cf2-a383-a05a321061ef"><td id="JVSs" class="">2Iniciar Sesion</td><td id="qobD" class="">2.1</td><td id="VfPS" class=""></td><td id="G~}V" class=""></td><td id="V@SB" class=""></td><td id="Jux=" class=""></td><td id="cJO{" class=""></td></tr><tr id="f43ba94f-4f09-4951-bf67-07f746718e80"><td id="JVSs" class=""></td><td id="qobD" class="">…</td><td id="VfPS" class=""></td><td id="G~}V" class=""></td><td id="V@SB" class=""></td><td id="Jux=" class=""></td><td id="cJO{" class=""></td></tr><tr id="1bfec6f6-6c06-4fdb-9f7c-687488d806d6"><td id="JVSs" class="">3.Cierre de sesion</td><td id="qobD" class=""></td><td id="VfPS" class=""></td><td id="G~}V" class=""></td><td id="V@SB" class=""></td><td id="Jux=" class=""></td><td id="cJO{" class=""></td></tr></tbody></table><p id="712d213e-83f6-464e-bb52-eaa2a72479c9" class="">Resumen de otras pruebas automatizadas o manuales (que no corresponden a los criterios de aceptación)</p><table id="f8096622-711d-472b-b1c3-fbbe680cc742" class="simple-table"><tbody><tr id="6eb221cd-a4fc-4fec-b941-1478553abd27"><td id="MYvK" class=""><strong>Número</strong></td><td id="eQVB" class=""><strong>Entrada de prueba</strong></td><td id="VWk{" class=""><strong>Resultado Esperado</strong></td><td id="ErLD" class=""><strong>Nombre de clase del código de prueba</strong></td><td id="Cwzl" class=""><strong>Nombre del método del código de prueba</strong></td><td id="}}KS" class=""><strong>Estado</strong></td><td id="RAyo" class=""><strong>Desarrollador</strong></td></tr><tr id="4cd11c4b-bc66-42b4-be39-7c4a843d55a4"><td id="MYvK" class=""></td><td id="eQVB" class=""></td><td id="VWk{" class=""></td><td id="ErLD" class=""></td><td id="Cwzl" class=""></td><td id="}}KS" class=""></td><td id="RAyo" class=""></td></tr><tr id="d866a1bb-acd9-4801-8ad3-d9731ee47382"><td id="MYvK" class=""></td><td id="eQVB" class=""></td><td id="VWk{" class=""></td><td id="ErLD" class=""></td><td id="Cwzl" class=""></td><td id="}}KS" class=""></td><td id="RAyo" class=""></td></tr></tbody></table><ol type="1" id="2f27f400-acb8-41cc-ad8c-f0ca2b2d3aec" class="numbered-list" start="1"><li><strong>Acta de la reunión</strong></li></ol><p id="bce3f362-498c-44d2-bbff-0aac0fd0931c" class="">Informe las actas de todas las reuniones, incluidas, entre otras: reunión de planificación de proyecto/sprint, backlog grooming, preparación del trabajo pendiente, reunión retrospectiva y sesión de programación en pareja.</p><table id="6b161b79-224e-44fc-b558-3c627742cf8d" class="simple-table"><tbody><tr id="5230360c-156d-49f2-b63e-5b134b89b87d"><td id="rcF`" class=""><strong>Fecha</strong></td><td id="yg;=" class=""><strong>Tiempo y duración</strong></td><td id="bzyt" class=""><strong>Lugar</strong></td><td id="}}&gt;z" class=""><strong>Participante</strong></td><td id="V:mM" class=""><strong>Propósito de la reunión</strong></td><td id="Rz@|" class=""><strong>Elementos de acción específicos</strong></td></tr><tr id="053f440d-602d-401b-9ac7-4489d82f29ee"><td id="rcF`" class="">23/03/2024</td><td id="yg;=" class="">2horas</td><td id="bzyt" class="">Reunion virtual por Google Meet</td><td id="}}&gt;z" class="">Ravichagua Manuel
<br/>Reeves David
<br/>Ruiz Milagros<br/></td><td id="V:mM" class="">- Investigar acerca del juego de las damas americanas<br/>- Definir las tecnologias y metodologias que utiliza para el proyecto<br/></td><td id="Rz@|" class="">- Definir roles y responsabilidades<br/>. Establer un sistema de comunicacion<br/></td></tr><tr id="6f1c118e-4a7b-4c67-ae2e-93a13e1ae9e3"><td id="rcF`" class="">25/03/2024</td><td id="yg;=" class="">15min</td><td id="bzyt" class="">Reunion virtual por Google Meet</td><td id="}}&gt;z" class="">Ravichagua Manuel
<br/>Reeves David
<br/>Ruiz Milagros<br/></td><td id="V:mM" class="">• Determinar los requerimientos y especificaciones</td><td id="Rz@|" class="">- Modificar el estado actual<br/>- Utilizar la técnica GWT para definir las especificaciones y requerimientos del software<br/></td></tr><tr id="558e5234-8e89-4a0d-92b2-c62d20c2b5b2"><td id="rcF`" class="">26/03/2024</td><td id="yg;=" class="">15min</td><td id="bzyt" class="">Reunion virtual por Google Meet</td><td id="}}&gt;z" class="">Ravichagua Manuel<br/>Reeves David<br/>Ruiz Milagros<br/></td><td id="V:mM" class="">• Determina el flujo de ejecución que tendrá el software</td><td id="Rz@|" class="">- Designar las tareas para realizar el flujo de ejecución del software<br/>- Crear un mirror compartido<br/></td></tr><tr id="1af9d5a5-6bf5-4c9b-bd93-ba4cef7687fa"><td id="rcF`" class="">28/03/2024</td><td id="yg;=" class="">15min</td><td id="bzyt" class="">Reunion virtual por Google Meet</td><td id="}}&gt;z" class="">Ravichagua Manuel<br/>Reeves David<br/>Ruiz Milagros<br/></td><td id="V:mM" class="">- Definir la arquitectura del software<br/>  Terminar el flujo de ejecución del software<br/></td><td id="Rz@|" class="">- Utilizar los requerimientos y especificaciones<br/>- Comparar diversos tipos de arquitecturas<br/>- Establecer la arquitectura a usar de cliente-servidor de 3 capas<br/></td></tr><tr id="1184152e-3fd1-497b-b6ac-3f09bc0a80a9"><td id="rcF`" class="">08/04/2024</td><td id="yg;=" class="">15min</td><td id="bzyt" class="">Reunion virtual por Google Meet</td><td id="}}&gt;z" class="">Ravichagua Manuel<br/>Reeves David<br/>Ruiz Milagros<br/></td><td id="V:mM" class="">• Elaboracion de la api rest</td><td id="Rz@|" class="">- Definir los metodos http<br/>- Decidir si encriptamos las contrasenas<br/>- Definir la base de datos que usaremos<br/></td></tr><tr id="af226c55-15d1-4b61-b291-8b1fdd4a0f21"><td id="rcF`" class="">10/04/2024</td><td id="yg;=" class="">15min</td><td id="bzyt" class="">Reunion virtual por Google Meet</td><td id="}}&gt;z" class="">Ravichagua Manuel<br/>Reeves David<br/>Ruiz Milagros<br/></td><td id="V:mM" class="">• Finalizacion del registro de usuario</td><td id="Rz@|" class="">- Conectar la api rest con el front end<br/>- Comentar el avance back end y front end<br/>- Continuar con el log in<br/></td></tr><tr id="8de28563-1e5e-439a-bb7a-257ff027cad8"><td id="rcF`" class="">15/04/2024</td><td id="yg;=" class="">15min</td><td id="bzyt" class="">Reunion virtual por Google Meet</td><td id="}}&gt;z" class="">Ravichagua Manuel<br/>Reeves David<br/>Ruiz Milagros<br/></td><td id="V:mM" class="">• Finalizacion del log in</td><td id="Rz@|" class="">- Hacer que el log in funcione en el front end<br/>- Comentar el avance del backend y frontend<br/>- Designar las tareas para la elaboracion del juego<br/></td></tr></tbody></table><ul id="05f0d99b-163b-4c5c-bd1f-f0d99cbbb8f8" class="bulleted-list"><li style="list-style-type:disc"><strong>Calificaciones de amigos</strong></li></ul><p id="129e472a-f532-44c6-9c27-a2147dc19d63" class="">Si no se siente cómodo al incluir sus calificaciones en este informe, puede enviarlas por correo electrónico al instructor o al calificador.</p><table id="813eb137-9546-4930-be09-b39d25b00cdf" class="simple-table"><tbody><tr id="8f23588b-6133-44c9-af8c-bddf099da25a"><td id="FYvP" class=""><br/> <br/> <br/><br/><em>Dador de calificación</em></td><td id="Koxi" class=""><em>Receptor de calificación</em></td><td id="sKFg" class=""></td><td id="nnHL" class=""></td><td id="gCTi" class=""></td></tr><tr id="9c25e609-4e0b-42ec-898c-d9ce7c40dcc3"><td id="FYvP" class=""></td><td id="Koxi" class=""></td><td id="sKFg" class="">Jose Manuel Ravichagua Marin</td><td id="nnHL" class="">David Fernando
<br/>Reeves Goñi<br/></td><td id="gCTi" class="">Milagros Cristina
<br/>Ruiz Arica<br/></td></tr><tr id="7543828c-cc8a-44cb-bdb6-ee1cde95e142"><td id="FYvP" class=""></td><td id="Koxi" class="">Jose Manuel Ravichagua Marin</td><td id="sKFg" class="">9</td><td id="nnHL" class="">9</td><td id="gCTi" class="">9</td></tr><tr id="99151e2c-8793-470d-8571-c6c474c87804"><td id="FYvP" class=""></td><td id="Koxi" class="">David Fernando
<br/>Reeves Goñi<br/></td><td id="sKFg" class="">8 </td><td id="nnHL" class="">9</td><td id="gCTi" class="">8</td></tr><tr id="dc8ea970-3b1e-494c-9e94-8c0286090f95"><td id="FYvP" class=""></td><td id="Koxi" class="">Milagros Cristina<br/>Ruiz Arica<br/></td><td id="sKFg" class="">8</td><td id="nnHL" class="">8</td><td id="gCTi" class="">9</td></tr><tr id="85b76356-cd9b-46e4-84e6-14c5529318a6"><td id="FYvP" class=""></td><td id="Koxi" class=""><em>Promedio</em></td><td id="sKFg" class="">8.67</td><td id="nnHL" class="">8.67</td><td id="gCTi" class="">8.67</td></tr></tbody></table><p id="1764e974-4def-4864-865e-2f49b832736f" class="">
</p></div></article><span class="sans" style="font-size:14px;padding-top:2em"></span></body></html>