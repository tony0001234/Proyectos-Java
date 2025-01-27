/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author PC
 */
public class clsLista2 {
    private clsNodo2 ptrInicio, ptrFinal;
    
    public clsLista2(){
        ptrInicio = null;
        ptrFinal = null;
    }    
    
    public boolean ListaVacia(){
        boolean resp = false;
        if(ptrInicio == null){
            resp = true;
        }
        
        return resp;
    }
    
    public int fncInsertar(int pValor){
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
    }
    
    public String fncMostrarPU(){
        clsNodo2 ptrAux = new clsNodo2();
        clsNodo2 ptrAuxSig = new clsNodo2();
        clsNodo2 objNodo = new clsNodo2();
        
        String resp = "";
        
        ptrInicio = objNodo;
        
        ptrAux = ptrInicio;
        ptrAuxSig = ptrAux.ptrAdelante;
        
        while(ptrAuxSig != null){

            resp = resp + "\n" + "Numero de padron: " + ptrAux.valor;

            ptrAux = ptrAuxSig;
            ptrAuxSig = ptrAux.ptrAdelante;
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
    
    
    
}
