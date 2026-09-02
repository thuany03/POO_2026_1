public class Funcionario {

    String nome;
    int horasTrabalhadas;
    private double valorHora;
    double desconto;

    public Funcionario(String nome, int horasTrabalhadas, int valorHora, int desconto) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.desconto = desconto;
    }

    public void setValorHora(double valorHora){

        if(valorHora > 0){
            this.valorHora = valorHora;
        } else {
            System.out.println("Valor inválido");
        }
    }
}
