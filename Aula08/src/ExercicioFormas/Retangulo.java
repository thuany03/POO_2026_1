package ExercicioFormas;

public class Retangulo extends Forma{

    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public double calcularPerimetro(){
        return 2*base + 2*altura;
    }

}
