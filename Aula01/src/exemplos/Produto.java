package exemplos;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    //Construtor
    Produto(){
        System.out.println("Objeto Criado");
    }

    Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        System.out.println("Objeto Criado com seus parâmetros já criados.");

    }

    double calcularTotal() {
        return preco * quantidade;
    }
}
