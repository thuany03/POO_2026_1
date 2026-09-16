public class Medico extends Profissional {

    private String crm;

    public Medico(String cpf, String nome, float salarioBruto, String crm) {
        super(cpf, nome, salarioBruto);
        this.crm = crm;
    }

    public void solicitarExame(){
        System.out.println("Solicitando exame");
    }
}
