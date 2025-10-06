public class FabricaDePagamentos {
    public static ProcessadorPagamento criarProcessador(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cartao":
                return new PagamentoCartaoCredito();
            case "boleto":
                return new PagamentoBoleto();
            case "pix":
                return new PagamentoPIX();
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido");
        }
    }

    public static void main(String[] args) {
        ProcessadorPagamento pagamento = FabricaDePagamentos.criarProcessador("pix");
        pagamento.processarPagamento(250.00);
    }
}