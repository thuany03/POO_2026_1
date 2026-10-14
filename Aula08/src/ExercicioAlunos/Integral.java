package ExercicioAlunos;

public class Integral extends Aluno {

    private float adicional = 300;

    public Integral(int matricula, String nome) {
        super(matricula, nome);
    }

    public float getAdicional() {
        return adicional;
    }

    @Override
    public double calcularMensalidade(){
        return valorBase + getAdicional();
    }
}
