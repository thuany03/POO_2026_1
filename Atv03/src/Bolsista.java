public class Bolsista extends Aluno{

    private double desconto = 0.3;

    public Bolsista(int matricula, String nome, String email, String nascimento, int serie) {
        super(matricula, nome, email, nascimento, serie);
    }

    public double getDesconto() {
        return desconto;
    }

    public double calcularMensalidadeBolsista(){
       return getMensalidade()-(getMensalidade()*getDesconto());
    }

}
