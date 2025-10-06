public class MainRelatorio {
    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioBasico();
        relatorio = new RelatorioEstatisticas(relatorio);
        relatorio = new RelatorioPDF(relatorio);

        relatorio.gerar();
    }
}