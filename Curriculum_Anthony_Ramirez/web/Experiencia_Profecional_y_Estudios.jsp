<%-- 
    Document   : Experiencia_Profecional
    Created on : 28/04/2023, 20:38:56
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
        <title>Experiencia Laboral</title>
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
        /*    background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.7)), url("forest-cool-pc-wallpaper-preview.jpg");         */
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
        /*seccion experiencia laboral*/
        #experiencia{
            max-width: 1100px;
            padding: 100px 0;
            margin: auto;
        }
        #experiencia .titulo-seccion{
            text-align: center;
            font-size: 22px;
            text-transform: uppercase;
            color: #111135;
            text-decoration: underline;
            text-decoration-color: #d3d3d3;
            text-decoration-thickness: 5px;
        }
        #experiencia .fila{
            display: flex;
            justify-content: space-around;
            margin: 30px 0;
        }
        #experiencia .fila .trabajo{
            max-width: 450px;
            border: 1px solid #000;
            margin: 0 10px;
            position: relative;
            overflow: hidden;
        }
        #experiencia .fila .trabajo img{
            width: 100%;
            height: 100%;
            filter: greyscale(1);
            object-fit: cover;
            transition: .5s;
        }
        #experiencia .fila .trabajo:hover img{
            filter: grayscale(0);
        }
        #experiencia .fila .trabajo .info{
            position: absolute;
            left: 0;
            background-color: rgba(0, 0, 0, .8);
            color: #99ccff;
            width: 100%;
            padding: 10px;
            opacity: 0;
            bottom: -40px;
            transition: .5s;
        }
        #experiencia .fila .trabajo:hover .info{
            opacity: 1;
            bottom: 0;
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
            </div>
            <!-- seccion de experiencia laboral -->
            <br><br>
            <br><br>
            <br><br>
            <seccion id="experiencia">
                <h3 class="titulo-seccion">Mis experiencias</h3>
                <div class="fila">
                    <div class="trabajo">
                        <div class="overlay">
                            <img src="oscarberger.png" alt=""/>
                            <div class="info">
                                <h4>Desde prepa hasta sexto primaria</h4>
                                <p>Primaria</p>
                            </div>
                        </div>
                    </div>
                    <div class="trabajo">
                        <div class="overlay">
                            <img src="liceo.png" alt=""/>
                            <div class="info">
                                <h4>Dese primero hasta tercero basico</h4>
                                <p>Basicos</p>
                            </div>
                        </div>
                    </div>
                    <div class="trabajo">
                        <div class="overlay">
                            <img src="liceo2.png" alt=""/>
                            <div class="info">
                                <h4>Desde cuarto Perito en electronica con diplomado
                                    en dispoditivos digitales y robotica, hasta sexto</h4>
                                <p>Diversificado</p>
                            </div>
                        </div>
                    </div>
                </div><!--//////////////////////////// -->
                <div class="fila">
                    <div class="trabajo">
                        <div class="overlay">
                            <img src="umg.png" alt=""/>
                            <div class="info">
                                <h4>Desde el primer semestre hasta cursando actualmente el tercero</h4>
                                <p>Grado de Ingenieria en sistemas</p>
                            </div>
                        </div>
                    </div>
                    <div class="trabajo">
                        <div class="overlay">
                            <img src="magiadelsabor.bmp" alt=""/>
                            <div class="info">
                                <h4>Encargado de mantener una atencion al cliente de 
                                alta calidad, limpieza del area y colocacion del producto</h4>
                                <p>Encargado de caja</p>
                            </div>
                        </div>
                    </div>
                    <div class="trabajo">
                        <div class="overlay">
                            <img src="stm.png" alt=""/>
                            <div class="info">
                                <h4>Reparacion, mantenimiento e instalacion de equipos de refrigeracion de 
                                todo tipo y equipos electricos como amplificadores, alarmas, cableados</h4>
                                <p>Tecnico en refrigeracion</p>
                            </div>
                        </div>
                    </div>
                </div>
            </seccion>
        </section>
    </body>
</html>
