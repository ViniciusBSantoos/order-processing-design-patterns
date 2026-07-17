package src.factory;
// Classe responsável por enviar uma notificação pelo WhatsApp

public class NotificacaoWhatsApp implements Notificacao {

    @Override
    public void enviar(String cliente, String mensagem) {

        System.out.println("\nMensagem enviada pelo WhatsApp para " + cliente + ".");
        System.out.println("Mensagem: " + mensagem);
    }
}