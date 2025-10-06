// Padrão de Projeto: STRATEGY
// Justificativa: Usamos Strategy para permitir que diferentes modos de transporte
// (terrestre, aéreo, marítimo) tenham suas próprias regras de cálculo de tarifa,
// mantendo o código principal genérico e facilmente extensível.

public interface Transporte {
    double calcularTarifa(double distancia, double peso);
}