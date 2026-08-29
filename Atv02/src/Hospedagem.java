public class Hospedagem {

    String nome;
    String email;
    int num_quarto;
    int dias;
    boolean cafe;
    int valorDiaria = 150;
    int valorCafe = 20;

    Hospedagem(){}

    Hospedagem(String nome, String email, int num_quarto, int dias, boolean cafe){
        this.nome = nome;
        this.email = email;
        this.num_quarto = num_quarto;
        this.dias = dias;
        this.cafe = cafe;
    }

    double calcularDiaria(){
        double total = valorDiaria*dias;
        if (cafe){
           total += valorCafe*dias;
        }
        return total;
    }
}
