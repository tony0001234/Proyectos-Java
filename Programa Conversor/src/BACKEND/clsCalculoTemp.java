/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author PC
 */
public class clsCalculoTemp {
    /*CONSTRUCTOR*/
    public clsCalculoTemp() {
    }
    
    /*ATRIBUTOS*/
    /*METODOS*/
    public double fncCelsiusAfahrenheit(double valorTemp) {
        
        double calculo = 0;
        
        calculo = (valorTemp * 1.8) + 32;
        
        return calculo;
        
    }
    public double fncCelsiusAkelvin(double valorTemp) {
        
        double calculo = 0;
        
        calculo = valorTemp + 273.15;
        
        return calculo;
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
    public double fncFahrenheitAcelsius(double valorTemp) {
        
        double calculo = 0;
        
        calculo = (valorTemp - 32) * (0.5555555555);
        
        return calculo;
        
    }
    public double fncFahrenheitAkelvin(double valorTemp) {
        
        double calculo = 0;
        
        calculo = ((valorTemp - 32) * (0.5555555555)) + 273.15;
        
        return calculo;
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
    public double fncKelvinAcelsius(double valorTemp) {
        
        double calculo = 0;
        
        calculo = valorTemp - 273.15;
        
        return calculo;
        
    }
    public double fncKelvinAfahrenheit(double valorTemp) {
        
        double calculo = 0;
        
        calculo = (valorTemp - 273.15) * 1.8 + 32;
        
        return calculo;
        
    }
}
