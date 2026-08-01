import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira a senha: ");

    String senha = scanner.nextLine();

    while (!senha.equals("2002")){
        System.out.print("Senha Invalida, tente novamente: ");
        senha = scanner.nextLine();
    }
    System.out.print("Acesso Permitido");
}
