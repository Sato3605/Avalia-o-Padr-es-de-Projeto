public class TransporteMaritimo implements Transporte {
    @Override
    public double calcularTarifa(double distancia, double peso) {
        return (distancia * 0.5) + (peso * 2); // mistura de fatores
    }
}