public class Integral extends Aluno {

    private float adicional = 300;

    public Integral(int matricula, String nome, String email, String nascimento, int serie) {
        super(matricula, nome, email, nascimento, serie);
    }

    public float getAdicional() {
        return adicional;
    }

    @Override
    public double calcularMensalidade(){
        return Mensalidade + adicional;
    }
}
