public class TestePolimorfismo {

    static void main(){

    Profissional[] lista = new Profissional[5];

    lista[0] = new Engenheiro("123456", "Rogerio", 5000, "123456");

    lista[1] = new Medico("1234567", "Rogerio", 15000, "1234567");

    lista[2] = new Professor("12345678", "Rogerio", 50,40);

    for(Profissional prof:lista){

        double salario = prof.calcularSalarioLiquido(0.1,100);
        System.out.println("Salário Final R$ " + salario);

    }


    }
}
