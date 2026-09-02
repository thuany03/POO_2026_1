import java.util.Scanner;

public class Principal {

    static void main(){

        Scanner leia = new Scanner(System.in);
        Hospedagem[] hospedagens = new Hospedagem[10];

        int quant_est = 0;
        System.out.println("Digite a quantidade hospedes:");
        quant_est = leia.nextInt();

        while(quant_est>10){
            System.out.println("O limite máximo é de 10 estudantes hospedados simultaneamente.");
            System.out.println("Digite a quantidade de estudante que irão se hospedar:");
            quant_est = leia.nextInt();
        }

        leia.nextLine();

        for (int i = 0; i < quant_est; i++){
            System.out.println("Digite as informações do hóspede " + i+1 + ":");

            System.out.println("Escolha o número do quarto:");
            int num_quarto = leia.nextInt();

            //Limpeza de buffer
            leia.nextLine();

            System.out.println("Nome:");
            String nome = leia.nextLine();

            leia.nextLine();

            System.out.println("E-mail:");
            String email = leia.nextLine();

            System.out.println("Quantidade de dias hospedado:");
            int dias = leia.nextInt();

            //Limpeza de buffer
            leia.nextLine();

            System.out.println("Deseja incluir o café da manhã? ");
            String str_cafe = leia.nextLine().toLowerCase();
            boolean cafe = validaCafe(str_cafe);

            Hospedagem hospedagem = new Hospedagem(nome, email, num_quarto, dias, cafe);
            hospedagens[i] = hospedagem;
        }

        System.out.println("Quartos Ocupados: ");
        for (int i = 0; i < quant_est; i++){
            double total = hospedagens[i].valorDiaria(100, 30);

            System.out.println(hospedagens[i].quarto + ": "
                + hospedagens[i].nome + ", "
                + hospedagens[i].email + ", "
                + hospedagens[i].dias + ", Café da manhã: "
                + hospedagens[i].cafe + "Total: R$" + total);
        }


    }

   static boolean validaCafe (String str_cafe){
        if(str_cafe.equals("sim")){
            return true;
        } else {
            return false;
        }
    }

}
