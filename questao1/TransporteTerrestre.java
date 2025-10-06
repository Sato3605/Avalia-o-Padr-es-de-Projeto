public class TransporteTerrestre implements Transporte {
    @Override
    public double calcularTarifa(double distancia, double peso) {
        return distancia * 1.5; // tarifa baseada em km
    }
}