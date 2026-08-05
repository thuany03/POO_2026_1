import java.util.Scanner;

public class ex5 {

    static double tarifaBase = 2;

    static void main(){

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite" +
                "quantas horas você ficou" + "no estacionamento:");
        double horas = leia.nextDouble();

        System.out.println(Math.ceil(horas));

        double valorPagar = calcularEncargos(horas, tarifaBase);
        System.out.println("Valor a pagar é R$ " + valorPagar);

    }
    private static double calcularEncargos(Double horas, double tarifaBase){
        double valorAdicional = 0.5;

        if (horas <= 3){
            return tarifaBase;
        } else {
            return tarifaBase + (valorAdicional * (Math.ceil(horas)-3));
        }
    }
}
