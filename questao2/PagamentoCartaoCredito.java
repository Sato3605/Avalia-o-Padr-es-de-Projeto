public class PagamentoCartaoCredito implements ProcessadorPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Cartão de Crédito processado.");
    }
}