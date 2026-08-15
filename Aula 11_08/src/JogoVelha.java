import java.util.Scanner;

public class JogoVelha{

    static Scanner leia = new Scanner(System.in);
    static char jogadorAtual = 'X';
    static char[][] tabuleiro = new char [3][3];

    static void main(){

        limpar();
        imprimir();

        while(true) {

            System.out.println("Escolha uma linha:");
            int linha = leia.nextInt();

            System.out.println("Escolha uma coluna:");
            int coluna = leia.nextInt();

            jogar(linha,coluna);
            imprimir();
        }

    }

    public static void limpar(){

    }

    public static void imprimir(){
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro[0].length; j++){
                System.out.print(tabuleiro[i][j]);
            }

            System.out.print("| ");


            }
        }


    public static void jogar(int linha, int coluna){
        if(linha>=1 && linha<=3 && tabuleiro[linha][coluna] == ' ' && coluna>=1 && coluna<=3){
            tabuleiro[linha][coluna] = jogadorAtual;
            if(jogadorAtual == 'X'){
                jogadorAtual = 'O';
            } else {
                jogadorAtual = 'X';
            }
        } else {
            System.out.println("Posição Inválida");
        }
    }
}
