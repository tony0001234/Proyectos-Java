<%-- 
    Document   : Habilidades-Intereses
    Created on : 28/04/2023, 19:56:09
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Habilidades-Intereses</title>
    </head>
        <style>
        /*fuente que se va a utilizar en la pagina*/
        @import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@200;400;600&display=swap');
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Montserrat';
        }
        html{
            scroll-behavior: smooth;
        }
        #inicio{
        /*    background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.7)), url("forest-cool-pc-wallpaper-preview.jpg");*/
            background-color: #f3f3f3;
            background-size: cover;
            background-position: center center;
            height: 100vh;
        }
        #inicio .contenido header{
            background-color: rgba(0,0,0, .8);
            position: fixed;
            width: 100%;
            z-index: 100;
            top: 0;
        }
        #inicio .contenido header .contenido-header{
            max-width: 1100px;
            margin: auto;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 20px;
        }
        #inicio .contenido header .contenido-header h1{
            text-align: center;
            color: #ff3333;
        }
        #inicio .contenido header .contenido-header nav ul{
            list-style: none;
            display: flex;
            align-items: center;
        }
        #inicio .contenido header .contenido-header nav ul li a{
            text-decoration: none;
            color: #fff;
            margin: 0 12px;
            font-weight: 400;
            transition: .5s;
        }
        #inicio .contenido header .contenido-header nav ul a:hover{
            color: #99ccff;
        }
        #inicio .contenido header .contenido-header .redes a{
            text-decoration: none;
            color: #fff;
            display: inline-block;
            margin-left: 10px;
            transition: .5s;
        }
        #inicio .contenido header .contenido-header .redes a:hover{
            color: #99ccff;
        }
        #inicio .contenido .presentacion{
            max-width: 1100px;
            height: 100vh;
            margin: auto;
            color: #fff;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
        #inicio .contenido .presentacion .bienvenida{
            font-size: 16px;
            margin-bottom: 20px;
            text-transform: uppercase;
            letter-spacing: 5px;
        }
        #inicio .contenido .presentacion h2{
            font-size: 55px;
            margin-bottom: 25px;
            text-align: center;
        }
        #inicio .contenido .presentacion h2 span{
            font-size: 25px;
            color: #3399ff;
        }
        #inicio .contenido .presentacion .descripcion{
            max-width: 700px;
            margin: 25px auto;
            font-size: 18px;
            text-align: center;
        }
        #inicio .contenido .presentacion a{
            text-decoration: none;
            display: inline-block;
            margin: 25px;
            padding: 20px 25px;
            border: 2px solid #fff;
            border-radius: 50px;
            color:#fff;
            font-weight: bold;
            text-transform: uppercase;
            transition: .5s;
        }
        #inicio .contenido .presentacion a:hover{
            background-color: #99ccff;
        }
        #icono-nav{
            color: #fff;
            display: none;
        }
        /*Seccion de habilidades intereses*/
        #habilidades{
            padding: 100px 15px;
            text-align: center;
            background-color: #f3f3f3;
        }
        #habilidades .titulo-seccion{
            font-size: 22px;
            text-transform: uppercase;
            color: #111135;
            text-decoration: underline;
            text-decoration-color: #d3d3d3;
            text-decoration-thickness: 5px;
        }
        #habilidades .fila{
            display: flex;
            justify-content: space-between;
            max-width: 1100px;
            margin: 30px auto;
        }
        #habilidades .fila .habilidad{
            max-width: 350px;
            background-color: #fff;
            padding: 30px;
            margin: 0 5px;
            border-radius: 5px;
            transition: .5s;
        }
        #habilidades .fila .habilidad:hover{
            box-shadow: 5px 5px 10px #565656, -5px -5px 10px #8a8a8a;
        }
        #habilidades .fila .habilidad h4{
            font-size: 22px;
            margin-bottom: 25px;
        }
        #habilidades .fila .habilidad .icono{
            display: inline-block;
            width: 60px;
            height: 60px;
            border-radius: 50%;
            background-color: #d3d3d3;
            padding: 20px;
            margin-bottom: 25px;
        }
        #habilidades .fila .habilidad hr{
            width: 30%;
            margin: auto;
            color: #000;
            margin-bottom: 25px;
        }
        #habilidades .fila .habilidad ul{
            list-style: none;
            display: flex;
            justify-content: space-between;
            margin-bottom: 10px;
        }
        #habilidades .fila .habilidad p{
            font-size: 14px;
            line-height: 22px;
        }
    </style>
    <body>
        <!-- seccion inicio -->
        <section id="inicio">
            <div class="contenido">
                <header>
                    <div class="contenido-header">
                        <h1>AR</h1>
                        <nav id="nav" class="">
                            <ul id="links">
                                <li><a href="index.jsp" class="seleccionado">Inicio</a></li>
                                <li><a href="Sobre_Mi.jsp">Sobre mi</a></li>
                                <li><a href="Habilidades-Intereses.jsp">Habilidades-Intereses</a></li>
                                <li><a href="Experiencia_Profecional_y_Estudios.jsp">Experiencia Profecional y Estudios</a></li>
                      <!--          <li><a href="#contacto">Contacto</a></li>   -->
                            </ul>
                        </nav>
                        <!-- Iconos del menu responsive -->
                        <div id="icono-nav">
                            <i class="fa-solid fa-bars"></i>
                        </div>
                        <!-- iconos de las redes sociales -->
                        <div class="redes">
                            <a href="https://www.youtube.com/channel/UC8e-Eranch_9S6yUz-pKZqA"><i class="fa-brands fa-youtube"></i></a>
                            <a href="https://www.facebook.com/anthoy.ramires/"><i class="fa-brands fa-facebook"></i></a>
                            <a href="https://www.instagram.com/tony0001234/"><i class="fa-brands fa-instagram"></i></a>
                        </div>
                    </div>
                </header>
            </div>
            <!-- Seccion habilidades-intereses -->
            <section id="habilidades">
                <h3 class="titulo-seccion">Mis habilidades e intereses</h3>
                <div class="fila">
                    <div class="habilidad">
                        <span class="icono"><i class="fa-solid fa-code"></i></span>
                        <h4>Diseño de Sitios Web</h4>
                        <hr>
                        <ul class="habilides-tag">
                            <li>Web</li>
                            <li>Graphic</li>
                            <li>SEO</li>
                        </ul>
                        <p>Mas que nada sitios locales por el momento, espero seguir aprendiendo.</p>
                    </div>
                    <div class="habilidad">
                        <span class="icono"><i class="fa-solid fa-file-excel"></i></i></span>
                        <h4>Uso de excel</h4>
                        <hr>
                        <ul class="habilides-tag">
                            <li>Diseño</li>
                            <li>Modificacion</li>
                        </ul>
                        <p>Excel como una habilidad basica</p>
                    </div>
                    <div class="habilidad">
                        <span class="icono"><i class="fa-brands fa-java"></i></span>
                        <h4>Diseño de Aplicaciones en Java</h4>
                        <hr>
                        <ul class="habilides-tag">
                            <li>Graficos</li>
                            <li>Funcionabilidad</li>
                            <li>Adaptabilidad</li>
                        </ul>
                        <p>Aplicaciones de escritorio para uso general con base de datos sql</p>
                    </div>
                </div>
                <div class="fila">
                    <div class="habilidad">
                        <span class="icono"><i class="fa-solid fa-server"></i></span>
                        <h4>Uso de Crud en SQL</h4>
                        <hr>
                        <ul class="habilides-tag">
                            <li>Servidor</li>
                            <li>Peticiones</li>
                        </ul>
                        <p>Uso de querys en sql server</p>
                    </div>
                    <div class="habilidad">
                        <span class="icono"><i class="fa-solid fa-computer"></i></span>
                        <h4>Computacion</h4>
                        <hr>
                        <ul class="habilides-tag">
                            <li>Componentes</li>
                            <li>Armado</li>
                            <li>Mantenimiento</li>
                        </ul>
                        <p>Conocimiento avanzado en computacion general.</p>
                    </div>
                    <div class="habilidad">
                        <span class="icono"><i class="fa-solid fa-fire"></i></span>
                        <h4>Primeros Auxilios</h4>
                        <hr>
                        <ul class="habilides-tag">
                            <li>Resusitacion</li>
                            <li>RCP</li>
                            <li>Rescate</li>
                        </ul>
                        <p>Graduado de bombero municipal de mixco, con conocimientos de 
                        primeros auxilios, rescate, extincion de fuego.</p>
                    </div>
                </div>
            </section>
        </section>
    </body>
</html>
