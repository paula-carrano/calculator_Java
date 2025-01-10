package src.operaciones;

import src.interfaces.Operacion;

public class Suma implements Operacion {
    @Override
    public double calcular(double x, double y) {
        return x + y;
    }
}
