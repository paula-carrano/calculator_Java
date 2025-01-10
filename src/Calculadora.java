package src;

import src.interfaces.Operacion;

public class Calculadora {
    private Operacion operacion;

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public double ejecutarOperacion(double x, double y) {
        if (operacion == null) {
            throw new IllegalArgumentException("No existe esa operación");
        }
        return operacion.calcular(x, y);
    }
}
