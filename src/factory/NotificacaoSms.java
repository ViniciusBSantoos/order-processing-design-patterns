package src.factory;
// Classe responsável por enviar uma notificação por SMS

public class NotificacaoSms implements Notificacao {

    @Override
    public void enviar(String cliente, String mensagem) {

        System.out.println("\nSMS enviado para " + cliente + ".");
        System.out.println("Mensagem: " + mensagem);
    }
}