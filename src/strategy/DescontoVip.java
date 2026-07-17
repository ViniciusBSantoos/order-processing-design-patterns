package src.strategy;
// Classe responsável pelo desconto de cliente VIP

public class DescontoVip implements EstrategiaDesconto {

    // Indica que estamos implementando o método da interface
    @Override
    public double calcularDesconto(double valor) {

        // Calcula 15% do valor
        return valor * 0.15;
    }
}