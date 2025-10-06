public class TransporteAereo implements Transporte {
    @Override
    public double calcularTarifa(double distancia, double peso) {
        return peso * 5.0; // tarifa baseada no peso
    }
}