package ExercicioAlunos;

public class Bolsista extends Aluno{

    private double desconto = 0.3;

    public Bolsista(int matricula, String nome) {
        super(matricula, nome);
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    public double calcularMensalidade(){
        return valorBase-(valorBase*desconto);
    }

}
