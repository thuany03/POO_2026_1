package ExercicioAlunos;

public class Regular extends Aluno {

    public Regular(int matricula, String nome) {
        super(matricula, nome);
    }

    public double calcularMensalidade(){
        return valorBase;
    }
}
