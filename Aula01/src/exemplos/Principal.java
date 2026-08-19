package exemplos;

public class Principal {

    static void main(){

        //criação dos objetos -- instanciação (instaciar um objeto da classe produto)
        Produto p1 = new Produto();
        p1.nome = "Teclado";
        p1.preco = 150;
        p1.quantidade = 10;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 50;
        p2.quantidade = 4;

        double valorTotal = p1.calcularTotal() + p2.calcularTotal();

        Produto p3 = new Produto("Monitor", 500, 10);

    }

}
