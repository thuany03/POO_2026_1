import java.util.Scanner;

public class ListaJogos {


    static Scanner leia = new Scanner(System.in);
    static int tamanho = 10;
    static String[] jogos = new String[tamanho];

    static void main() {

        int opcao = 0;

        do {
            System.out.println("Digite o número da sua opção:");
            System.out.println("1. Cadastrar Jogo"); 
            System.out.println("2. Listar Jogos");
            System.out.println("3. Atualizar Jogo");
            System.out.println("4. Remover Jogo");
            System.out.println("5. Sair");

            opcao = leia.nextInt();

            leia.nextLine();

            switch (opcao) {
                case 1:
                    CadastrarJogo();
                    break;

                case 2:
                    ListarJogos();
                    break;

                case 3:
                    AtualizarJogo();
                    break;

                case 4:
                    RemoverJogo();
                    break;

                case 5:
                    break;
            }

        } while (opcao != 5);

    }

    private static void CadastrarJogo() {

        for(int i = 0; i < tamanho; i++){
            if(jogos[i]==null){
                System.out.println("Digite o nome do jogo:");
                String nomeJogo = leia.nextLine();

                if(JaEstaNaLista(nomeJogo) != -1){
                    System.out.println("Este jogo já está na lista.");
                    return;
                } else {
                    jogos[i] = nomeJogo;
                    System.out.println("Jogo adicionado com sucesso!");
                    break;
                }
            }
        }
        System.out.println("A lista de jogos está cheia.");
    }

    private static int JaEstaNaLista(String nomeJogo2){
        for(int i = 0; i < tamanho; i++){
            if( (jogos[i] != null) && (jogos[i].equals(nomeJogo2))){
                return i;
            }
        }
        return -1;
    }

    private static void ListarJogos() {
        for (int i = 0; i < jogos.length; i++){
            if(jogos[i] != null){
                System.out.println(jogos[i]);
            }

        }


    }

    private static void AtualizarJogo() {
        System.out.println("Digite o nome do jogo que deseja atualizar:");
        String nomeJogo = leia.nextLine();

        if(JaEstaNaLista(nomeJogo) == -1){
            System.out.println("Jogo inexistente na lista.");
        }

    }

    private static void RemoverJogo() {

    }
}
