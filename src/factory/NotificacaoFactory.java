package src.factory;

public class NotificacaoFactory {

    public static Notificacao criarNotificacao(int opcao) {

        switch (opcao) {
            case 1:
                return new NotificacaoEmail();

            case 2:
                return new NotificacaoSms();

            case 3:
                return new NotificacaoWhatsApp();

            default:
                return null;
        }
    }
}