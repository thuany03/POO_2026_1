public class Professor extends Profissional implements Autenticavel, Notificavel{

    String siape;
    String senha;
    double valorHora;
    int horasTrabalhadas;

    public Professor(String cpf, String nome, String siape, String senha, double valorHora, int horasTrabalhadas) {
        super(cpf, nome);
        this.siape = siape;
        this.senha = senha;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getSiape() {
        return siape;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularSalarioBruto() {
        return valorHora*horasTrabalhadas;
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
