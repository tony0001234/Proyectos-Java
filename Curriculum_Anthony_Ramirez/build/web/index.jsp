<%-- 
    Document   : index
    Created on : 27/04/2023, 19:05:36
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
        <title>Anthony Ramirez</title>
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
            background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.7)), url("forest-cool-pc-wallpaper-preview.jpg");
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
                          <!--      <li><a href="#contacto">Contacto</a></li> -->
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
                <div class="presentacion">
                    <p class="bienvenida">Bienvenidos</p>
                    <h2>Soy <span>Anthony Ramirez</span>, Estudiante de Ingenieria en Sistemas</h2>
                    <p class="descripcion">Esta es una pagina web que contiene mi informacion personal,
                    espero que sea de su agrado y pueda serle de ayuda en un futuro proximo.</p>
                    <a href="https://github.com/tony0001234">Git Hub</a>
                </div>
            </div>
        </section>
    </body>
</html>
