public class Professor extends Profissional{

    private int horasTrabalhadas;

    public Professor(String cpf, String nome, float salarioBruto, int horasTrabalhadas) {
        super(cpf, nome, salarioBruto);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    double calcularSalarioLiquido(double desconto, double bonus){
        double salario = getSalarioBruto() * horasTrabalhadas;
        return salario - (salario*desconto) + bonus;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
