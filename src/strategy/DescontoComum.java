package src.strategy;
// Estratégia de desconto comum

public class DescontoComum implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {

        // Calcula 5% de desconto
        return valor * 0.05;
    }
}