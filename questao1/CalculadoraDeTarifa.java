public class CalculadoraDeTarifa {
    private Transporte transporte;

    public CalculadoraDeTarifa(Transporte transporte) {
        this.transporte = transporte;
    }

    public double calcular(double distancia, double peso) {
        return transporte.calcularTarifa(distancia, peso);
    }

    public static void main(String[] args) {
        CalculadoraDeTarifa terrestre = new CalculadoraDeTarifa(new TransporteTerrestre());
        System.out.println("Terrestre: R$" + terrestre.calcular(100, 20));

        CalculadoraDeTarifa aereo = new CalculadoraDeTarifa(new TransporteAereo());
        System.out.println("Aéreo: R$" + aereo.calcular(100, 20));

        CalculadoraDeTarifa maritimo = new CalculadoraDeTarifa(new TransporteMaritimo());
        System.out.println("Marítimo: R$" + maritimo.calcular(100, 20));
    }
}