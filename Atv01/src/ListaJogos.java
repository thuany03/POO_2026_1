import java.util.Scanner;

public class ListaJogos {


    static Scanner leia = new Scanner(System.in);

    static void main() {


        int tamanho = 10;

        String[] jogos = new String[tamanho];

        int opcao = 0;

        do {
            System.out.println("Digite uma opção:");
            System.out.println("1. Cadastrar Jogo");
            System.out.println("2. Listar Jogos");
            System.out.println("3. Atualizar Jogo");
            System.out.println("4. Remover Jogo");
            System.out.println("5. Sair");

            opcao = leia.nextInt();

            leia.nextLine();

            switch (opcao) {
                case 1:
                    CadastrarJogo(jogos, tamanho);
                    break;

                case 2:
                    ListarJogos(jogos);
                    break;

                case 3:
                    AtualizarJogo(jogos);
                    break;

                case 4:
                    RemoverJogo(jogos);
                    break;

                case 5:
                    break;
            }

        } while (opcao != 5);

    }

    private static void CadastrarJogo(String[] jogos, int tamanho) {

        for(int i = 0; i < tamanho; i++){
            if(jogos[i]==null){
                System.out.println("Digite o nome do jogo:");
                String nomeJogo = leia.nextLine();

                if(JaEstaNaLista(jogos, i, nomeJogo)){
                    System.out.println("Este jogo já está na lista");
                    break;
                } else {
                    jogos[i] = nomeJogo;
                    System.out.println("Jogo adicionado com sucesso!");
                    break;
                }
            }
        }
        System.out.println("A lista de jogos está cheia");
    }

    private static boolean JaEstaNaLista(String[] jogos, int tamanho, String nomeJogo){
        for(int i = 0; i < tamanho; i++){
        if(jogos[i].equals(nomeJogo))
            return true;
         }
        return false;
    }

    private static void ListarJogos(String[] jogos) {

    }

    private static void AtualizarJogo(String[] jogos) {

    }

    private static void RemoverJogo(String[] jogos) {

    }
}
