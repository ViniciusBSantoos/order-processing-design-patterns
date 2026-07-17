# 🛒 Sistema de Processamento de Pedidos

Projeto desenvolvido em **Java** com o objetivo de demonstrar a aplicação dos principais **Design Patterns (Padrões de Projeto)** utilizando conceitos de Programação Orientada a Objetos.

O sistema simula o processamento de pedidos, permitindo calcular descontos, escolher o tipo de notificação e finalizar o pedido por meio de uma interface simplificada.

---

## 📋 Funcionalidades

- Cadastro do cliente
- Informar o valor do pedido
- Escolha do tipo de desconto
- Escolha da forma de notificação
- Cálculo automático do valor final
- Exibição do resumo do pedido
- Simulação do envio de notificações

---

## 🎯 Padrões de Projeto Utilizados

### ✅ Strategy

Permite alterar a regra de cálculo do desconto sem modificar o restante do sistema.

Classes:

- `EstrategiaDesconto`
- `SemDesconto`
- `DescontoComum`
- `DescontoVip`

---

### ✅ Factory Method

Responsável por criar dinamicamente o tipo de notificação escolhido pelo usuário.

Classes:

- `Notificacao`
- `NotificacaoEmail`
- `NotificacaoSms`
- `NotificacaoWhatsApp`
- `NotificacaoFactory`

---

### ✅ Singleton

Garante que exista apenas uma instância das configurações do sistema durante toda a execução.

Classe:

- `ConfiguracaoSistema`

---

### ✅ Facade

Centraliza todo o fluxo de processamento do pedido em uma única classe, simplificando o uso do sistema.

Classe:

- `ProcessamentoPedidoFacade`

---

## 📁 Estrutura do Projeto

```text
src/
├── Main.java
├── facade/
│   └── ProcessamentoPedidoFacade.java
├── factory/
│   ├── Notificacao.java
│   ├── NotificacaoEmail.java
│   ├── NotificacaoFactory.java
│   ├── NotificacaoSms.java
│   └── NotificacaoWhatsApp.java
├── model/
│   └── Pedido.java
├── singleton/
│   └── ConfiguracaoSistema.java
└── strategy/
    ├── DescontoComum.java
    ├── DescontoVip.java
    ├── EstrategiaDesconto.java
    └── SemDesconto.java
```

---

## 💻 Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Design Patterns
- VS Code

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/SEU-USUARIO/order-processing-design-patterns.git
```

2. Abra o projeto no VS Code.

3. Execute o arquivo:

```text
src/Main.java
```

4. Informe os dados solicitados no terminal.

---

## 📷 Exemplo de Execução

```text
==============================
       RESUMO DO PEDIDO
==============================

Cliente: Vinicius
Valor original: R$ 500,00
Desconto aplicado: R$ 75,00
Valor final: R$ 425,00

E-mail enviado para Vinicius.
Mensagem: Seu pedido foi finalizado no valor de R$ 425,00
```

---

## 📚 Conceitos Praticados

- Programação Orientada a Objetos
- Encapsulamento
- Interfaces
- Polimorfismo
- Organização em Pacotes
- Design Patterns
- Clean Code

---

## 🚀 Possíveis Melhorias

- Persistência de dados em banco de dados
- Interface gráfica
- API REST com Spring Boot
- Testes unitários com JUnit
- Validação de dados
- Cadastro de produtos e múltiplos pedidos

---

## 👨‍💻 Autor

**Vinicius Batista Santos**

- LinkedIn:www.linkedin.com/in/viniciussantosbatista

---

## 📄 Licença

Este projeto foi desenvolvido para fins de estudo e prática de Programação Orientada a Objetos e Design Patterns.
