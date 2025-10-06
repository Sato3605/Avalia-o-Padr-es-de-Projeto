public class RelatorioPDF extends RelatorioDecorator {
    public RelatorioPDF(Relatorio relatorio) {
        super(relatorio);
    }

    public void gerar() {
        super.gerar();
        System.out.println("Exportando relatório em PDF.");
    }
}