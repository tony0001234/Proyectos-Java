/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author PC
 */
public class clsNodo2 {
    /*CONSTRUCTOR*/
    public clsNodo2() {
        ptrAdelante = null;
        ptrDetras = null;
    }
    /*ATRIBUTOS*/
    int valor;
    String Nombre;
    clsNodo2 ptrAdelante;
    clsNodo2 ptrDetras;
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

    public clsNodo2 getPtrAdelante() {
        return ptrAdelante;
    }

    public void setPtrAdelante(clsNodo2 ptrAdelante) {
        this.ptrAdelante = ptrAdelante;
    }

    public clsNodo2 getPtrDetras() {
        return ptrDetras;
    }

    public void setPtrDetras(clsNodo2 ptrDetras) {
        this.ptrDetras = ptrDetras;
    }
    
}
