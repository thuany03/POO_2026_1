import ExercicioAlunos.*;
import java.util.Scanner;

void main() {

    Scanner leia = new Scanner(System.in);
    Aluno[] alunos = new Aluno[3];

    for (int i = 0; i < 3; i++){
        System.out.println("Insira os dados do aluno " + (i+1) + ":");

        int matricula = i + 202610000;

        System.out.println("Nome:");
        String nome = leia.nextLine();


        System.out.println("Será aluno regular, bolsista ou integral?");
        String tipoAluno = leia.nextLine().toLowerCase();

        switch (tipoAluno) {
            case "regular":
                alunos[i] = new Regular(matricula,nome);
                break;

            case "bolsista":
                alunos[i] = new Bolsista(matricula,nome);
                break;

            case "integral":
                alunos[i] = new Integral(matricula,nome);
                break;
        }
    }

    double totalArrecadado = 0;

    System.out.println("===== MATRÍCULAS =====");
    for (int i = 0; i < 3; i++){
        System.out.println("Nome:" + alunos[i].getNome());
        System.out.println("Matrícula: " + alunos[i].getMatricula());
        System.out.println("Valor da mensalidade: R$" + alunos[i].calcularMensalidade());
        System.out.println("----------------------------------------------");
        totalArrecadado += alunos[i].calcularMensalidade();
    }
    System.out.println("Total Arrecadado: " + totalArrecadado);

}
