public class Engenheiro extends Profissional {

    private String crea;

    public Engenheiro(String cpf, String nome, float salarioBruto, String crea) {
        super(cpf, nome, salarioBruto);
        this.crea = crea;
    }

    public void emitirLaudo(){
        System.out.println("Emitindo laudo");
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
