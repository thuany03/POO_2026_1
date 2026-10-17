public interface Autenticavel {

    int TAMANHO_MINIMO_SENHA = 8;

    boolean autenticar(String senha);
}
