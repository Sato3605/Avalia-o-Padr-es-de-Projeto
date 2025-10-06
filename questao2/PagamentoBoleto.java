public class PagamentoBoleto implements ProcessadorPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Boleto Bancário processado.");
    }
}