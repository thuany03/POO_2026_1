public class PrincipalFunc {

    static void main(){

        Funcionario func =
                new Funcionario("Rogério",
                        160,
                        100,
                        300);

        //Alterando usando encapsulamento
        func.setValorHora(-500);

        System.out.println(func.getValorHora());
    }
}
