<%-- 
    Document   : Sobre_Mi
    Created on : 28/04/2023, 18:50:29
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
        <title>Sobre Mi</title>
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
        /*    background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.7)), url("beach-4k-hd-pc-download-wallpaper-preview.jpg");*/
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
        /*nuevas cosas sobre mi*/
        #sobremi{
            max-width: 2200px;
            margin: auto;
            padding: 100px 15px;
            color: #111135;
            display: flex;
        }    
        #sobremi .contenedor-foto{
            max-width: 6000px;
            margin-right: 1px;
        }
        #sobremi .contenedor-foto img{
            padding: 20px;
            width: 100%;
            border-radius: 20px;
            background-color: #f3f3f3;
        }
        #sobremi .sobremi{
            margin: 0 40px;
        }
        #sobremi .sobremi .titulo-seccion{
            font-size: 22px;
            text-transform: uppercase;
            color: #111135;
            text-decoration: underline;
            text-decoration-color: #d3d3d3;
            text-decoration-thickness: 5px;
        }
        #sobremi .sobremi h2{
            font-size: 34px;
            font-weight: bold;
            margin: 20px 0;
            letter-spacing: 2px;
        }
        #sobremi .sobremi h2 span{
            color: #ff3333;
        }
        #sobremi .sobremi h3{
            font-size: 18px;
            font-weight: 500;
            text-transform: uppercase;
            margin-bottom: 20px;
            letter-spacing: 1px;
        }
        #sobremi .sobremi p{
            font-size: 14px;
            line-height: 25px;
            color: #565656;
            margin-bottom: 12px;
        }
        #sobremi .sobremi a{
            display: inline-block;
            text-decoration: none;
            color: #000;
            border-radius: 30px;
            padding: 10px 20px;
            border: 1px solid #000;
            margin-top: 30px;
            transition: .5s;
        }
        #sobremi .sobremi a:hover{
            background-color: #99ccff;
            color: #fff;
        }
    </style>
    <body>
        <!-- Sobre mi -->
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
                          <!--      <li><a href="#contacto">Contacto</a></li>    -->
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
                </header><!--
                <div class="presentacion">
                    <p class="bienvenida">Bienvenidos</p>
                    <h2>Soy <span>Anthony Ramirez</span>, Estudiante de Ingenieria en Sistemas</h2>
                    <p class="descripcion">Lorem ipsum dolor</p>
                    <a href="#portfolio">Ir a Portafolio</a>
                </div>-->
            </div>
            <!-- nuevas cosas sobre mi -->
            <section id="sobremi">
            <div class="contenedor-foto">
                <img src="foto.png" alt="">
            </div>
            <div class="sobremi">
                <p class="titulo-seccion">Sobre Mi</p>
                <h2>Hola, soy <span>Anthony Ramirez</span></h2>
                <h3>Estudiante de la carrera ingenieria en sistemas informaticos y tecnico en  A/C</h3>
                <p>Soy una persona que considera hacer algo bien echo si se comienza,
                me gusta mucho todo lo que se puede llegar a crear con programacion y
                que cada plataforma con cada lenguaje son un mundo de posibilidades, 
                aunque por el momento estoy en un trabajo un poco mas fisico como lo es 
                tecnico en aires acondicionados, disfruto el trabajo ya que me gradue de 
                electronica, tambien por lo mismo me gusta bastante desarmar aparatos 
                para conocer su funcionamiento.</p>
                <a href="https://www.linkedin.com/in/anthony-ramirez-7624691b5">Visitar linkedin</a>
            </div>
            </section>
        </section>

    </body>
</html>
