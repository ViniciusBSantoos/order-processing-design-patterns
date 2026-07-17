package src.strategy;
// Interface que define a regra para qualquer tipo de desconto
public interface EstrategiaDesconto {

    // Toda classe de desconto deverá implementar este método
    double calcularDesconto(double valor);
}