package exercicio;

public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, int nivel, float vida, int forca, int mana) {
        super(nome, nivel, vida, forca);
        this.mana = mana;
    }

    public void lancarMagia(){
        System.out.println("Lançando feitiço no inimigo...");
        perderMana(5);
        System.out.println("Agora você possui " + getMana() + " de mana");

    }

    public int getMana() {
        return mana;
    }

    public void perderMana(int mana) {
        this.mana--;
    }

    public void recuperarMana(int mana) {
        this.mana++;
    }
}
