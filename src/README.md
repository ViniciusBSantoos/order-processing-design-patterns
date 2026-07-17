# Sistema de Processamento de Pedidos

Projeto desenvolvido em Java para demonstrar a aplicação de padrões de projeto em um sistema simples de processamento de pedidos.

## Objetivo

O sistema permite:

- cadastrar o nome do cliente;
- informar o valor do pedido;
- escolher o tipo de desconto;
- escolher a forma de notificação;
- calcular o valor final do pedido;
- exibir um resumo no terminal.

## Padrões de projeto utilizados

### Strategy

Utilizado para definir diferentes formas de calcular descontos.

Classes:

- `EstrategiaDesconto`
- `SemDesconto`
- `DescontoComum`
- `DescontoVip`

### Factory Method

Utilizado para criar diferentes tipos de notificações.

Classes:

- `Notificacao`
- `NotificacaoEmail`
- `NotificacaoSms`
- `NotificacaoWhatsApp`
- `NotificacaoFactory`

### Singleton

Utilizado para manter uma única instância das configurações do sistema.

Classe:

- `ConfiguracaoSistema`

### Facade

Utilizado para centralizar o processo de finalização do pedido.

Classe:

- `ProcessamentoPedidoFacade`

