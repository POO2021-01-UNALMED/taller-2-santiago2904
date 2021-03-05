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
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    
    public void cambiarRegistro(int registro){
        this.registro = registro;
    }
    
    public void asignarTipo(String tipo){
        if (tipo.equals("electrico") || tipo.equals("gasolina")){
            this.tipo = tipo;                  
        }
    }
}
