package ExercicioFormas;

public class Circulo extends Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro(){
        return Math.PI * raio * 2;
    }
}
