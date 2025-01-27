/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author PC
 */
public class clsNodo {

    /*CONSTRUCTOR*/
    public clsNodo() {
        ptrAdelante = null;
        ptrDetras = null;
    }


    /*ATRIBUTOS*/
    int valor;
    String Nombre;
    clsNodo ptrAdelante;
    clsNodo ptrDetras;
    /*METODOS*/

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public clsNodo getPtrAdelante() {
        return ptrAdelante;
    }

    public void setPtrAdelante(clsNodo ptrAdelante) {
        this.ptrAdelante = ptrAdelante;
    }

    public clsNodo getPtrDetras() {
        return ptrDetras;
    }

    public void setPtrDetras(clsNodo ptrDetras) {
        this.ptrDetras = ptrDetras;
    }
    
    
    
}
