/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class clsLista {
    private clsNodo ptrInicio, ptrFinal;
    
    public clsLista(){
        ptrInicio = null;
        ptrFinal = null;
    }
    
    public boolean RegistroRepetido(){
        clsNodo ptrAuxAnt = new clsNodo();
        clsNodo ptrAux = new clsNodo();
        clsNodo ptrAuxSig = new clsNodo();
        clsNodo objNodo = new clsNodo();
        boolean resp = false;
        int registroRepetido = 0;
        
        ptrAux = ptrInicio;
        ptrAuxAnt = ptrAux.ptrDetras;
        ptrAuxSig = ptrAux.ptrAdelante;
        
        while(ptrAux != null){
            if(objNodo.valor == ptrAux.valor){
                registroRepetido = registroRepetido + 1;
            }
            ptrAuxAnt = ptrAux;
            ptrAux = ptrAuxSig;
            ptrAuxSig = ptrAux.ptrAdelante;
        }
        if(registroRepetido > 1){
            resp = true;
        }
        
        return resp;
    }
    
    public boolean ListaVacia(){
        boolean resp = false;
        if(ptrInicio == null){
            resp = true;
        }
        
        return resp;
    }
    
    public int fncRegistro(){
        clsNodo objNodo = new clsNodo();
        clsNodo ptrAux = new clsNodo();
        clsNodo ptrAuxAtras = new clsNodo();
        int resp = 0;
        
        if(ListaVacia() == true){
            ptrInicio = objNodo;
            ptrFinal = objNodo;
            
            resp = 1; // primer registro realizado con exito
        }else{
            if(ptrInicio == ptrFinal){
            if(objNodo.valor < ptrInicio.valor){
                ptrInicio = objNodo;
                ptrInicio.ptrAdelante = ptrFinal;
                ptrFinal.ptrDetras = objNodo;
                resp = 2; // segundo registro realizado con exito
            }else{
                ptrFinal = objNodo;
                ptrFinal.ptrDetras = ptrInicio;
                ptrInicio.ptrAdelante = ptrFinal;
                resp = 3;  // registro realizao con exito
                }
            }else{
                ptrAux = ptrInicio;
                while(ptrAux != null){
                    if(objNodo.valor < ptrAux.valor && ptrAux.valor == ptrInicio.valor){
                        ptrAux.ptrDetras = objNodo;
                        ptrInicio = objNodo;
                        ptrInicio.ptrAdelante = ptrAux;
                        resp = 4;
                    }
                    if(objNodo.valor > ptrAux.valor && ptrAux.valor == ptrFinal.valor){
                        ptrAux.ptrAdelante = objNodo;
                        ptrFinal = objNodo;
                        resp = 5;
                    }
                    if(objNodo.valor < ptrAux.valor){
                        ptrAux.ptrDetras =objNodo;
                        ptrAuxAtras.ptrAdelante = objNodo;
                        resp = 6;
                    }
                    ptrAuxAtras = ptrAux;
                    ptrAux = ptrAux.ptrAdelante;
                }
            }
        }
        return resp;
    }
    
    public int fncBorrarCola(){
        clsNodo ptrAuxAnt = new clsNodo();
        clsNodo ptrAux = new clsNodo();
        clsNodo ptrAuxSig = new clsNodo();
        int resp = 0;
        
        ptrAuxAnt = ptrInicio;
        ptrAux = ptrAuxAnt.ptrAdelante;
        ptrAuxSig = ptrAux.ptrAdelante;
        
        if(ListaVacia() != true){
            ptrInicio = ptrAux;
            ptrAux.ptrDetras = null;
            
            ptrAuxSig = ptrAuxSig.ptrAdelante;
            ptrAux = ptrAux.ptrAdelante;
            ptrAuxAnt = ptrAuxAnt.ptrAdelante;
            
            resp = 1;
        }else{
            resp = 444;//lista sin elementos
        }
        return resp;
    }
    
    public int fncBorrarPila(){
        clsNodo ptrAuxAnt = new clsNodo();
        clsNodo ptrAux = new clsNodo();
        clsNodo ptrAuxSig = new clsNodo();
        int resp = 0;
        
        ptrAuxAnt = ptrFinal;
        ptrAux = ptrAuxAnt.ptrAdelante;
        ptrAuxSig = ptrAux.ptrAdelante;
        
         if(ListaVacia() != true){
            ptrFinal = ptrAux;
            ptrAux.ptrDetras = null;
            
            ptrAuxSig = ptrAuxSig.ptrAdelante;
            ptrAux = ptrAux.ptrAdelante;
            ptrAuxAnt = ptrAuxAnt.ptrAdelante;
            
            resp = 1;
        }else{
            resp = 444;//lista sin elementos
        }
        
        return resp;
    }
    
    public int fncBorrarNodo(){
        clsNodo ptrAuxAnt = new clsNodo();
        clsNodo ptrAux = new clsNodo();
        clsNodo ptrAuxSig = new clsNodo();
        clsNodo objNodo = new clsNodo();
        int resp = 0;

        ptrAux = ptrInicio;
        ptrAuxAnt = ptrAux.ptrDetras;
        ptrAuxSig = ptrAux.ptrAdelante;
        
        while(ptrAux != null){
            if(objNodo.valor == ptrAux.valor){
                ptrAuxAnt.ptrAdelante = ptrAuxSig;
                ptrAuxSig.ptrDetras = ptrAuxAnt;
                resp = 1;
                
                ptrAux = ptrAuxSig;
                ptrAuxSig = ptrAuxSig.ptrAdelante;
            }
            ptrAuxAnt = ptrAux;
            ptrAux = ptrAuxSig;
            ptrAuxSig = ptrAux.ptrAdelante;
        }
        
        return resp;
    }
    
    public String fncMostrarNodo(){
        clsNodo ptrAuxAnt = new clsNodo();
        clsNodo ptrAux = new clsNodo();
        clsNodo ptrAuxSig = new clsNodo();
        clsNodo objNodo = new clsNodo();
        clsPersona objPersona = new clsPersona();
        String resp = "";
        
        ptrAux = ptrInicio;
        ptrAuxAnt = ptrAux.ptrDetras;
        ptrAuxSig = ptrAux.ptrAdelante;
        
        while(ptrAux != null){
            if(objNodo.valor == ptrAux.valor && objNodo.valor == objPersona.NumeroPadron){
                resp = "Numero de padron: " + Integer.toString(objPersona.getNumeroPadron()) +"\n" + 
                        "CUI: " + objPersona.getCUI() + "\n" + "Nombre: " + objPersona.getNombre() + "\n" + "Direccion: " + objPersona.getDireccion();
            }else{
                resp = "Registro no encontrado.";
            }
            ptrAuxAnt = ptrAux;
            ptrAux = ptrAuxSig;
            ptrAuxSig = ptrAux.ptrAdelante;
        }
        return resp;
    }
    
    public String fncMostrarPU(){
        clsNodo ptrAuxAnt = new clsNodo();
        clsNodo ptrAux = new clsNodo();
        clsNodo ptrAuxSig = new clsNodo();
        clsNodo objNodo = new clsNodo();
        clsPersona objPersona = new clsPersona();
        String resp = "";
        
        ptrAux = ptrInicio;
        ptrAuxAnt = ptrAux.ptrDetras;
        ptrAuxSig = ptrAux.ptrAdelante;
        
        while(ptrAux != null){
            if(ptrAux.valor == objPersona.getNumeroPadron()){
                resp = resp + "\n" + "Numero de padron: " + Integer.toString(objPersona.getNumeroPadron()) +"\n" + 
                        "CUI: " + objPersona.getCUI() + "\n" + "Nombre: " + objPersona.getNombre() + "\n" + "Direccion: " + objPersona.getDireccion();
            }
            ptrAuxAnt = ptrAux;
            ptrAux = ptrAuxSig;
            ptrAuxSig = ptrAux.ptrAdelante;
        }
        return resp;
    }
    
    public String fncMostrarUP(){
        clsNodo ptrAuxAnt = new clsNodo();
        clsNodo ptrAux = new clsNodo();
        clsNodo ptrAuxSig = new clsNodo();
        clsNodo objNodo = new clsNodo();
        clsPersona objPersona = new clsPersona();
        String resp = "";
        
        ptrAux = ptrFinal;
        ptrAuxAnt = ptrAux.ptrAdelante;
        ptrAuxSig = ptrAux.ptrDetras;
        
        while(ptrAux != null){
            if(ptrAux.valor == objPersona.getNumeroPadron()){
                resp = resp + "\n" + "Numero de padron: " + Integer.toString(objPersona.getNumeroPadron()) +"\n" + "CUI: " + objPersona.getCUI() + "\n" + "Nombre: " + objPersona.getNombre() + "\n" + "Direccion: " + objPersona.getDireccion();
            }
            ptrAuxAnt = ptrAux;
            ptrAux = ptrAuxSig;
            ptrAuxSig = ptrAux.ptrDetras; 
        }

        return resp;
    }
    
     /*   public int fncRegistrar(){
        clsNodo2 objNodo = new clsNodo2();
        int resp = 0;
        
        clsNodo2 ptrAuxAnt;
        clsNodo2 ptrAux = ptrInicio;
        clsNodo2 ptrAuxSig = ptrAux.ptrAdelante;
        
        if(ListaVacia() == true){
            ptrInicio = objNodo;
            ptrFinal = ptrInicio;
            resp = 1;
        }else {
            if(ptrInicio == ptrFinal && ptrInicio != null){
                    if(objNodo.valor > ptrInicio.valor){
                        ptrFinal = objNodo;
                        ptrFinal.ptrDetras = ptrInicio;
                        ptrInicio.ptrAdelante = ptrFinal;
                        resp = 2;
                    }else{
                        ptrInicio = objNodo;
                        ptrInicio.ptrAdelante = ptrFinal;
                        ptrFinal.ptrDetras = ptrInicio;
                        resp =3;
                    }
                }else if(ptrInicio != ptrFinal){
                ptrAux = ptrInicio;
                ptrAuxAnt = ptrAux.ptrDetras;
                ptrAuxSig = ptrAux.ptrAdelante;
                while(ptrAuxSig != null){
                    if(objNodo.valor > ptrAux.valor){
                        ptrAuxAnt = ptrAux;
                        ptrAux = ptrAuxSig;
                        ptrAuxSig = ptrAuxSig.ptrAdelante;
                    }else{
                        ptrAuxAnt = ptrAux;
                        ptrAux = objNodo;
                        
                        ptrAuxAnt.ptrAdelante = ptrAux;
                        ptrAux.ptrDetras = ptrAuxAnt;
                        
                        ptrAux.ptrAdelante = ptrAuxSig;
                        ptrAuxSig.ptrDetras = ptrAux;
                        resp = 4;
                    }
                }
                if(ptrAux == null){
                    ptrFinal = objNodo;
                    ptrFinal.ptrDetras = ptrAuxAnt;
                    ptrAuxAnt.ptrAdelante = ptrFinal;
                }
            }
        }
        
        return resp;
    }
    
    public String fncMostrarPU(){
        clsNodo2 ptrAuxAnt = new clsNodo2();
        clsNodo2 ptrAux = new clsNodo2();
        clsNodo2 ptrAuxSig = new clsNodo2();
        clsNodo2 objNodo = new clsNodo2();

        String resp = "";
        
        ptrAux = ptrInicio;
        ptrAuxAnt = ptrAux.ptrDetras;
        ptrAuxSig = ptrAux.ptrAdelante;
        
        while(ptrAux.ptrAdelante != null){

            resp = resp + "\n" + "Numero de padron: " + ptrAux.valor;

            ptrAuxAnt = ptrAux;
            ptrAux = ptrAuxSig;
            ptrAuxSig = ptrAux.ptrAdelante;
        }
        return resp;
    }*/
    
 /*   public int fncRegistrar(){
        clsNodo2 objNodo = new clsNodo2();
        clsNodo2 ptrAuxAnt = new clsNodo2();
        clsNodo2 ptrAux = new clsNodo2();
        clsNodo2 ptrAuxSig = new clsNodo2();
        int resp = 0;
        
        
        if(ListaVacia() == true){
            ptrInicio = objNodo;
            ptrFinal = objNodo;
            resp = 1;
        }else{
            ptrAuxAnt = ptrInicio.ptrDetras;
            ptrAux = ptrInicio;
            ptrAuxSig = ptrAux.ptrAdelante;
            
            while(ptrAux != null){
                if(objNodo.valor < ptrInicio.valor){
                    ptrAuxAnt = objNodo;
                    ptrInicio = ptrAuxAnt;
                    ptrInicio.ptrAdelante = ptrAux;
                    ptrAux.ptrDetras = ptrInicio;
                    
                    resp = 2;
                }else if(objNodo.valor > ptrFinal.valor){
                    ptrAux = ptrFinal;
                    ptrAuxAnt = ptrAux.ptrDetras;
                    ptrAuxSig = objNodo;
                    
                    ptrFinal = ptrAuxSig;
                    ptrFinal.ptrDetras = ptrAux;
                    resp = 3;
                }else if(objNodo.valor < ptrAux.valor && ptrAux.valor != ptrInicio.valor){
                    ptrAuxAnt.ptrAdelante = objNodo;
                    ptrAux.ptrDetras = objNodo;
                    
                    ptrAuxSig = ptrAux;
                    ptrAux = objNodo;
                    ptrAux.ptrDetras = ptrAuxAnt;
                    ptrAux.ptrAdelante = ptrAuxSig;
                    resp = 4;
                }
                
                ptrAuxAnt = ptrAuxAnt.ptrAdelante;
                ptrAux = ptrAux.ptrAdelante;
                ptrAuxSig = ptrAuxSig.ptrAdelante;
            }
        }
        return resp;
    }*/
    
    /*  public int fncInsertar(int pValor){
        clsNodo2 objNodo = new clsNodo2();
        int resp = 0;
        
        objNodo.valor = pValor;
        
        if(ptrInicio == null){
            ptrInicio = objNodo;
            resp = 1;
        }else{
            if(objNodo.valor < ptrInicio.valor){
                objNodo.ptrAdelante = ptrInicio;
                ptrInicio = objNodo;
                resp = 2;
            }else{
                clsNodo2 ptrAux = ptrInicio;
                clsNodo2 ptrAuxAnt = ptrInicio;
                
                while(objNodo.valor > ptrAux.valor && ptrAux.ptrAdelante != null){
                    ptrAuxAnt = ptrAux;
                    ptrAux = ptrAux.ptrAdelante;
                }
                if(objNodo.valor > ptrAux.valor){
                    ptrAux.ptrAdelante = objNodo;
                }else{
                    objNodo.ptrAdelante = ptrAux;
                    ptrAuxAnt.ptrAdelante = objNodo;
                    resp = 3;
                }
            }
        }
        
        return resp;
    }*/
    
}
