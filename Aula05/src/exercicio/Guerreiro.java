package exercicio;

public class Guerreiro extends Personagem{

    private int armadura;

    public Guerreiro(String nome, int nivel, float vida, int forca, int armadura) {
        super(nome, nivel, vida, forca);
        this.armadura = armadura;
    }

    private void golpeEspecial(){
        System.out.println("Ataque de golpe poderoso...");
    }

}
