//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int[] numeros = {4, 3, 2, 1, 5, 9, 8, 6, 7, 10};
//    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (int i = 0; i < 9; i++){
        if(numeros[i]>numeros[i+1]){
            System.out.print("Não está em ordem crescente");
            return;
        }
    }
    System.out.print("Está em ordem crescente");
}
