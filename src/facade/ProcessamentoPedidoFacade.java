package src.facade;

import src.factory.Notificacao;
import src.model.Pedido;
import src.strategy.EstrategiaDesconto;

public class ProcessamentoPedidoFacade {

    private EstrategiaDesconto desconto;
    private Notificacao notificacao;

    public ProcessamentoPedidoFacade(
            EstrategiaDesconto desconto,
            Notificacao notificacao) {

        this.desconto = desconto;
        this.notificacao = notificacao;
    }

    public void finalizarPedido(Pedido pedido) {

        double valorDesconto =
                desconto.calcularDesconto(
                        pedido.getValorOriginal()
                );

        double valorFinal =
                pedido.getValorOriginal() - valorDesconto;

        mostrarResumo(
                pedido,
                valorDesconto,
                valorFinal
        );

        notificacao.enviar(
                pedido.getCliente(),
                "Seu pedido foi finalizado no valor de R$ "
                        + String.format("%.2f", valorFinal)
        );
    }

    private void mostrarResumo(
            Pedido pedido,
            double valorDesconto,
            double valorFinal) {

        System.out.println("\n==============================");
        System.out.println("       RESUMO DO PEDIDO");
        System.out.println("==============================");

        System.out.println(
                "Cliente: " + pedido.getCliente()
        );

        System.out.printf(
                "Valor original: R$ %.2f%n",
                pedido.getValorOriginal()
        );

        System.out.printf(
                "Desconto aplicado: R$ %.2f%n",
                valorDesconto
        );

        System.out.printf(
                "Valor final: R$ %.2f%n",
                valorFinal
        );
    }
}