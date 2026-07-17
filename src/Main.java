package src;

import java.util.Scanner;
import src.facade.ProcessamentoPedidoFacade;
import src.factory.Notificacao;
import src.factory.NotificacaoFactory;
import src.model.Pedido;
import src.singleton.ConfiguracaoSistema;
import src.strategy.DescontoComum;
import src.strategy.DescontoVip;
import src.strategy.EstrategiaDesconto;
import src.strategy.SemDesconto;

public class Main {

    public static void main(String[] args) {

        // Scanner usado para ler os dados digitados
        Scanner scanner = new Scanner(System.in);

        // Usa o Singleton para acessar a configuração do sistema
        ConfiguracaoSistema configuracao =
                ConfiguracaoSistema.getInstancia();

        // Cabeçalho do sistema
        System.out.println("==============================");
        System.out.println("     " + configuracao.getNomeLoja());
        System.out.println(
                "Sistema de pedidos - versão "
                        + configuracao.getVersao()
        );
        System.out.println("==============================");

        // Nome do cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Valor do pedido
        System.out.print("Digite o valor do pedido: R$ ");
        double valorPedido = scanner.nextDouble();

        // Cria o pedido
        Pedido pedido = new Pedido(
                nomeCliente,
                valorPedido
        );

        // Menu de desconto
        System.out.println("\nEscolha o tipo de desconto:");
        System.out.println("1 - Sem desconto");
        System.out.println("2 - Desconto comum de 5%");
        System.out.println("3 - Desconto VIP de 15%");
        System.out.print("Opção: ");

        int opcaoDesconto = scanner.nextInt();

        // Variável que vai guardar a estratégia escolhida
        EstrategiaDesconto desconto;

        switch (opcaoDesconto) {

            case 1:
                desconto = new SemDesconto();
                break;

            case 2:
                desconto = new DescontoComum();
                break;

            case 3:
                desconto = new DescontoVip();
                break;

            default:
                System.out.println(
                        "Opção inválida. O pedido ficará sem desconto."
                );

                desconto = new SemDesconto();
                break;
        }

        // Menu de notificação
        System.out.println("\nEscolha a forma de notificação:");
        System.out.println("1 - E-mail");
        System.out.println("2 - SMS");
        System.out.println("3 - WhatsApp");
        System.out.print("Opção: ");

        int opcaoNotificacao = scanner.nextInt();

        // Usa a Factory para criar a notificação escolhida
        Notificacao notificacao =
                NotificacaoFactory.criarNotificacao(
                        opcaoNotificacao
                );

        // Verifica se a opção foi válida
        if (notificacao == null) {

            System.out.println(
                    "\nOpção de notificação inválida. Programa encerrado."
            );

            scanner.close();
            return;
        }

        // Cria a Facade
        ProcessamentoPedidoFacade facade =
                new ProcessamentoPedidoFacade(
                        desconto,
                        notificacao
                );

        // Finaliza o pedido
        facade.finalizarPedido(pedido);

        scanner.close();
    }
}