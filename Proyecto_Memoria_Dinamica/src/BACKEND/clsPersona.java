/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author PC
 */
public class clsPersona {

    /*CONSTRUCTOR*/
    public clsPersona() {
    }


    
    /*ATRIBUTOS*/
    public int NumeroPadron;
    public double CUI;
    public String nombre;
    public String direccion;
    /*METODOS*/

    public int getNumeroPadron() {
        return NumeroPadron;
    }

    public void setNumeroPadron(int NumeroPadron) {
        this.NumeroPadron = NumeroPadron;
    }

    public double getCUI() {
        return CUI;
    }

    public void setCUI(double CUI) {
        this.CUI = CUI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
