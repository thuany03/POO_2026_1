public class Profissional {

    private String cpf;
    private String nome;
    private float salarioBruto;

    public Profissional(String cpf, String nome, float salarioBruto) {
        this.cpf = cpf;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    double calcularSalarioLiquido(double desconto, double bonus){
        return salarioBruto - (salarioBruto*desconto) + bonus;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
