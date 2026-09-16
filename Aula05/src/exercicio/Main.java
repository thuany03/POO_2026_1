package exercicio;

public class Main {

    public void main(){

        Mago mago = new Mago("Esther", 50, 120, 40, 80);
        Guerreiro guerreiro = new Guerreiro("Oscar", 46, 200, 90, 25);
        Arqueiro arqueiro = new Arqueiro("Carla", 53, 160, 45,87, 68);

        arqueiro.atacar();
        mago.lancarMagia();
        guerreiro.atacar();
        guerreiro.recebrDano(24);
        arqueiro.atirarFlechas();

    }


}
