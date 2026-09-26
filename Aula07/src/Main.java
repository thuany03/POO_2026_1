import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o número de contas que serão preenchidas: ");
    int quant_contas = leia.nextInt();

    //Limpeza de buffer
    leia.nextLine();

    Conta[] contas = new Conta[quant_contas];

    for (int i = 0; i < quant_contas; i++){

        System.out.println("Conta #" + (i+1) + ":");

        System.out.println("Conta Poupança ou Empresarial?");
        String tipoConta = leia.nextLine().toLowerCase();

        System.out.println("Número da conta: ");
        int numConta = leia.nextInt();

        //Limpeza de buffer
        leia.nextLine();

        System.out.println("Nome do Titular: ");
        String nome = leia.nextLine();

        System.out.printf("Saldo Inicial: R$");
        int saldo = leia.nextInt();

        //Limpeza de buffer
        leia.nextLine();

        switch (tipoConta) {
            case "p":
                ContaPoupanca poupanca = new ContaPoupanca(numConta, nome, saldo, 0.1);
                contas[i] = poupanca;
                break;

            case "e":
                ContaEmpresarial empresarial = new ContaEmpresarial(numConta, nome, saldo, 1500);
                contas[i] = empresarial;
                break;

        }
    }

    double saldoTotal = 0;

    for (Conta conta: contas){

        saldoTotal += conta.getSaldo();

        if(conta instanceof ContaPoupanca){
            ((ContaPoupanca) conta).atualizarSaldo();
        }

        if(conta instanceof ContaEmpresarial){
            ((ContaEmpresarial) conta).emprestimo(500);
        }

    }

}
