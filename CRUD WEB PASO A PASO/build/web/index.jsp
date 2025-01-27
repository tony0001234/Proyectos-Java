
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Backend.clsPersona"%>


<script src="LibJavaScript.js" type="text/javascript"></script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">

<!DOCTYPE html>
<%
     System.out.println("INGRESO AL SEGMENTO DE PROGRAMACIÓN JAVA");  
     String Operacion = request.getParameter("cbOperacion");
     
     String flgMensaje = "display: none";
     String flgFormulario = "display: block";
     String Titulo = "";
     String Mensaje = "";
     
    if(Operacion != null){
        switch( Integer.parseInt(Operacion)  ){
            case 1: 
                  System.out.println("REGISTRO DE PERSONA");
                  if(request.getParameter("pCUI")!= null && request.getParameter("pNombre")!= null && request.getParameter("pPuesto")!= null && request.getParameter("pSalario")!= null ){
                      clsPersona objPersona = new clsPersona();
                      objPersona.setCUI( request.getParameter("pCUI")   );
                      objPersona.setNombre(request.getParameter("pNombre") );
                      objPersona.setPuesto( request.getParameter("pPuesto") );
                      objPersona.setSalario( Double.parseDouble(request.getParameter("pSalario")) );
                      
                      int Resp = objPersona.fncRegistro(objPersona);
                      
                      System.out.println("RESULTADO DE INSERCIÓN: " + String.valueOf(Resp));
                      
                      if(Resp==1){
                          Titulo = "REGISTRO DE PERSONAS";
                          Mensaje = "Se registro a la persona exitosamente.";
                          flgFormulario = "display: none";
                          flgMensaje = "display: block";
                          
                      }else{
                          Titulo = "REGISTRO DE PERSONAS";
                          Mensaje = "Error, no se pudo registrar a la persona.";
                          flgFormulario = "display: none";
                          flgMensaje = "display: block";
                      }
                      
                  }    
            break;
            case 2:
                  System.out.println("MODIFICACION DE PERSONA");
                  if(request.getParameter("pCUI")!= null && request.getParameter("pNombre")!= null && request.getParameter("pPuesto")!= null && request.getParameter("pSalario")!= null ){
                      clsPersona objPersona = new clsPersona();
                      objPersona.setCUI( request.getParameter("pCUI")   );
                      objPersona.setNombre(request.getParameter("pNombre") );
                      objPersona.setPuesto( request.getParameter("pPuesto") );
                      objPersona.setSalario( Double.parseDouble(request.getParameter("pSalario")) );
                      
                      int Resp = objPersona.fncModifica(objPersona);
                      
                      System.out.println("RESULTADO DE ACTUALIZACIÓN: " + String.valueOf(Resp));
                  }   
                  
            break;
            case 3:
                  System.out.println("ELIMINACIÓN DE PERSONA");
                  if(request.getParameter("pCUI")!= null){
                      clsPersona objPersona = new clsPersona();
                      int Resp = objPersona.fncElimina(request.getParameter("pCUI")); 
                  }
            break;
            default:
                  System.out.println("ESTOY EN DEFAULT OPCION");
            break;
           }
        }
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISTEMA RRHH</title>
    </head>
    <body>
       
        <div class="p-3 mb-2 bg-warning text-dark">
            <h1>REGISTRO DE PERSONA</h1>
        </div>
        
        <br><br>
         <form method="post" action="index.jsp" id="Formulario"  style="<%=flgFormulario%>" >
             
             <div class="row">
                <div class="col-3"></div>
                <div class="col-1"> <label>OPERACION:</label> </div>
                <div class="col-2"> 
                    
                    
                    <select style="width: 190px" name="cbOperacion">
                        <option value="0">Seleccione Operacion</option>
                        <option value="1">Registrar Persona</option>
                        <option value="2">Modificar Persona</option>
                        <option value="3">Eliminar Persona</option>
                    </select>
                
                </div>
                <div class="col-3"></div>
            </div>
             
              <div class="row">
                <div class="col-3"></div>
                <div class="col-1"> CUI:</div>
                <div class="col-2"> <input type="text" name="pCUI" placeholder="INGRESE CUI"></div>
                <div class="col-3"></div>
            </div>
            
            
            
             <div class="row">
                <div class="col-3"></div>
                <div class="col-1"> NOMBRE: </div>
                <div class="col-2"> <input type="text" name="pNombre" placeholder="INGRESE NOMBRE"></div>
                <div class="col-3"></div>
            </div>
            
            
             <div class="row">
                <div class="col-3"></div>
                <div class="col-1"> PUESTO:</div>
                <div class="col-2"> <input type="text" name="pPuesto" placeholder="INGRES PUESTO"></div>
                <div class="col-3"></div>
            </div>
            
             
            <div class="row">
                <div class="col-3"></div>
                <div class="col-1"> SALARIO: </div>
                
                <div class="col-2"> <input type="number" step="0.01" name="pSalario" placeholder="INGRESE SALARIO">
                    
                
                    <br><br><center> <input type="submit" name="pRegistro" value="  GUARDAR  " class="btn btn-danger" ></center>
                </div>
                <div class="col-3"></div>
             </div>
  
               
        </form>
       
        
        
  
        <div class="modal-dialog modal-lg" id="Mensaje" style="<%=flgMensaje%>">
            <div class="modal-content">
                 <div class="modal-header">
                     <h5 class="modal-title" id="modalTitle"><%=Titulo%></h5>
                </div>
                <div class="modal-body">
                                   <h4 class="modal-title" id="modalTitle"><%=Mensaje%></h5>

                </div>
                <div class="modal-footer">
                        <button type="button" class="btn btn-success" onclick="miFunc();"  >ACEPTAR</button>
                        <button type="button" class="btn btn-dark">Dark</button>   
                </div>

            </div> 
        </div>
        
        
        
    </body>
</html>
