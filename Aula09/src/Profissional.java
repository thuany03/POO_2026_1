public abstract class Profissional {

    protected String cpf;
    protected String nome;

    public Profissional(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalarioBruto();
}
