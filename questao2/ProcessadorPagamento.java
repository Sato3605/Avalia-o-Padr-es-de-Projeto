// Padrão de Projeto: FACTORY METHOD
// Justificativa: Usamos Factory Method para criar dinamicamente o processador de
// pagamento sem que o código principal precise saber qual classe concreta instanciar.

public interface ProcessadorPagamento {
    void processarPagamento(double valor);
}