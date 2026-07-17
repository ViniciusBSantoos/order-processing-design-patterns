package src.model;
// Esta classe representa um pedido
public class Pedido {

    // Nome do cliente
    private String cliente;

    // Valor original do pedido
    private double valorOriginal;

    // Construtor utilizado para criar um pedido
    public Pedido(String cliente, double valorOriginal) {
        this.cliente = cliente;
        this.valorOriginal = valorOriginal;
    }

    // Retorna o nome do cliente
    public String getCliente() {
        return cliente;
    }

    // Retorna o valor original do pedido
    public double getValorOriginal() {
        return valorOriginal;
    }
}