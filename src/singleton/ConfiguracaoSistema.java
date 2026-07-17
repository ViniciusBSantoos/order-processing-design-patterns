package src.singleton;
// Classe Singleton
public class ConfiguracaoSistema {

    // Aqui ficará armazenada a única instância da classe
    private static ConfiguracaoSistema instancia;

    // Informações do sistema
    private String nomeLoja;
    private String versao;

    // O construtor é privado.
    // Isso impede que alguém faça:
    // new ConfiguracaoSistema();
    private ConfiguracaoSistema() {

        nomeLoja = "Tech Store";
        versao = "1.0";
    }

    // Método responsável por devolver a única instância
    public static ConfiguracaoSistema getInstancia() {

        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }

        return instancia;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public String getVersao() {
        return versao;
    }

}