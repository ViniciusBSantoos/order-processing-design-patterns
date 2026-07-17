package src.factory;
// Classe responsável por enviar uma notificação por e-mail

public class NotificacaoEmail implements Notificacao {

    @Override
    public void enviar(String cliente, String mensagem) {

        System.out.println("\nE-mail enviado para " + cliente + ".");
        System.out.println("Mensagem: " + mensagem);
    }
}