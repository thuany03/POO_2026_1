public class Integral extends Aluno {

    private float adicional = 300;

    public Integral(int matricula, String nome, String email, String nascimento, int serie) {
        super(matricula, nome, email, nascimento, serie);
    }

    public float getAdicional() {
        return adicional;
    }

    public double calcularMensalidadeIntegral(){
        return getMensalidade() + getAdicional();
    }
}
