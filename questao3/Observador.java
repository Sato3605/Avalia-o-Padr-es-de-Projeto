// Padrão de Projeto: OBSERVER
// Justificativa: Usamos Observer para notificar automaticamente os leitores quando
// novas notícias são publicadas em um tópico, sem que o site precise controlar isso manualmente.

public interface Observador {
    void atualizar(String noticia);
}