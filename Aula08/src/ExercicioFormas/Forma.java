package ExercicioFormas;

public abstract class Forma {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String descrever() {
        return "Nome: " + getClass().getSimpleName() + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
    }



}
