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
        return this.asientos.length;
    }

    public String verificarIntegridad() {
        for (int i = 0; i < asientos.length; i++) {
            if ((motor.registro == this.registro) && (this.registro == asientos[i].registro)) {
                return "Auto original";
            }
        }

        return "Las piezas no son originales ";
    }

}
