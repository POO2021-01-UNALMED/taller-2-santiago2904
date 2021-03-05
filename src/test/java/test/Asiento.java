/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santi
 */
package test;
public class Asiento {
    String color;
    int precio;
    int registro;
    
    public void cambiarColor(String color){
    if (color.equals("rojo") || color.equals("verde") || color.equals("negro")
            || color.equals("amarillo") || color.equals("blanco")){
            this.color = color;                  
        }
    }
}
