package ExercicioAlunos;

public abstract class Aluno {

    protected int matricula;
    protected String nome;
    protected double valorBase = 100;


    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularMensalidade();

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
