public class PagamentoPIX implements ProcessadorPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " via PIX processado.");
    }
}