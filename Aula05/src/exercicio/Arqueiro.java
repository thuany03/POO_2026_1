package exercicio;

public class Arqueiro extends Personagem{

    private int precisao;
    private int qtdFlechas;

    public Arqueiro(String nome, int nivel, float vida, int forca, int precisao, int qtdFlechas) {
        super(nome, nivel, vida, forca);
        this.precisao = precisao;
        this.qtdFlechas = qtdFlechas;
    }

    public void atirarFlechas(){
        System.out.println("Flecha disparada...");
        dispararFlecha();
        System.out.println("Agora você possui " + getQtdFlechas() + " flechas");
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getQtdFlechas() {
        return qtdFlechas;
    }

    public void dispararFlecha() {
        this.qtdFlechas--;
    }

    public void ganharFlechas(int flechas) {
        this.qtdFlechas += flechas;
    }

}
