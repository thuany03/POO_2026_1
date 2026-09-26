public class ContaEmpresarial extends Conta {

    protected double limiteEmprestimo;

    public ContaEmpresarial(int numero, String titular, double saldo, double limiteEMprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEMprestimo;
    }

    public void emprestimo (double valor){
        if (valor < limiteEmprestimo){
            saldo += valor - 10;
        } else {
            System.out.println("Valor excede o limite.");
        }
    }

    @Override
    public void sacar (double valor){
        saldo -= valor + 5;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
}




