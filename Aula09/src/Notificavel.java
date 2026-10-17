public interface Notificavel {

    void notificar(String mensagem);

    default void notificarUrgente(String mensagem){
        notificar("[URGENTE] " + mensagem);
    }

}
