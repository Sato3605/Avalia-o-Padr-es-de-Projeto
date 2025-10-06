// Padrão de Projeto: DECORATOR
// Justificativa: Usamos Decorator para adicionar novas funcionalidades ao relatório
// (estatísticas, gráficos, exportação) sem modificar o código do relatório básico.

public interface Relatorio {
    void gerar();
}