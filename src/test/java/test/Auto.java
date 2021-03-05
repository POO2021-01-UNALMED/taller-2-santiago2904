package test;
public class Auto {

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidacreados;

    public int cantidadAsientos() {
        return asientos.length;
    }
    public String verificarIntegridad(Motor motor, Auto auto, Asiento asiento){
        if ((motor.registro == asiento.registro) && (asiento.registro == this.registro )){
            return "Auto original";
        }
        return "Las piezas no son originales ";
    }
    
}
