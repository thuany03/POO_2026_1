public class Aluno {

    private int matricula;
    private String nome;
    private String email;
    private String nascimento;
    private int serie;
    private double Mensalidade = 800;


    public Aluno(int matricula, String nome, String email, String nascimento, int serie) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.serie = serie;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public double getMensalidade() {
        return Mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        Mensalidade = mensalidade;
    }
}
