package src.strategy;
// Estratégia usada quando o pedido não possui desconto

public class SemDesconto implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {

        // Sem desconto, portanto retorna zero
        return 0;
    }
}