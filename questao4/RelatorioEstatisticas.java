public class RelatorioEstatisticas extends RelatorioDecorator {
    public RelatorioEstatisticas(Relatorio relatorio) {
        super(relatorio);
    }

    public void gerar() {
        super.gerar();
        System.out.println("Adicionando estatísticas de faturamento.");
    }
}