public class Aluno implements Autenticavel, Notificavel{

    private String matricula;
    private String nome;
    private String senha;

    public Aluno(String matricula, String nome, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + ": " + mensagem);
    }

    @Override
    public void notificarUrgente(String mensagem) {
        Notificavel.super.notificarUrgente(mensagem);
    }
}
