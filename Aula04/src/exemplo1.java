public class exemplo1 {

    static void main(){

    int tamanho = 10;

        //Declarando um vetor
        String[] nomes = new String[tamanho];

        //Inserindo em uma posição específica
        nomes[5] = "Fabio";

        //Imprimir conteudo de uma posição
        System.out.println(nomes[5]);

        for (String nome: nomes){
            System.out.println(nome);
        }

        //Removendo Fabio

    }
}
