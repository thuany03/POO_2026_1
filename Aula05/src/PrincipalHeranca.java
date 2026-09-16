public class PrincipalHeranca {

    static void main(){

        Engenheiro eng = new Engenheiro("123456", "Thuany", 10000, "123456");
        Medico med = new Medico("123456", "Thuani", 12000, "123456");

        System.out.println("Nome: " + eng.getNome());
        System.out.println(med.calcularSalarioLiquido(0.1,1000));


    }

}
