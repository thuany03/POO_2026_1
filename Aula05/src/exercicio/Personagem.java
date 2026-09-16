package exercicio;

public class Personagem {

    private String nome;
    private int nivel;
    private float vida;
    private int forca;

    public Personagem(String nome, int nivel, float vida, int forca) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(){
        System.out.println("Atacando o inimigo...");
    }

    void recebrDano(float dano){
        this.vida -= dano;
        System.out.println("Você recebeu um dano, sua vida agora está em " + getVida());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
