import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner leia = new Scanner(System.in);
    Aluno[] alunos = new Aluno[3];

    for (int i = 0; i < 3; i++){
        System.out.println("Insira os dados do aluno " + (i+1) + ":");

        int matricula = i + 202620000;

        System.out.println("Nome:");
        String nome = leia.nextLine();

        System.out.println("E-mail:");
        String email = leia.nextLine();

        System.out.println("Data de Nascimento:");
        String nascimento = leia.nextLine();

        System.out.println("Qual a série?");
        int serie = leia.nextInt();

        //Limpeza de buffer
        leia.nextLine();

        System.out.println("Será aluno regular, bolsista ou integral?");
        String tipoAluno = leia.nextLine().toLowerCase();

        switch (tipoAluno) {
            case "regular":
                Aluno aluno = new Aluno(matricula,nome, email, nascimento, serie);
                alunos[i] = aluno;
                break;

            case "bolsista":
                Bolsista bolsista = new Bolsista(matricula,nome, email, nascimento, serie);
                alunos[i] = bolsista;
                break;

            case "integral":
                Integral integral = new Integral(matricula,nome, email, nascimento, serie);
                alunos[i] = integral;
                break;
        }
    }

    System.out.println("===== MATRÍCULAS =====");
    for (int i = 0; i < 3; i++){
        System.out.println("Nome:" + alunos[i].getNome());
        System.out.println("Matrícula: " + alunos[i].getMatricula());
        System.out.println("E-mail: " + alunos[i].getEmail());
        System.out.println("Série: " + alunos[i].getSerie() + "° do ensino médio");
        System.out.println("Valor da mensalidade: R$" + alunos[i].calcularMensalidade());
        System.out.println("----------------------------------------------");
    }

}
