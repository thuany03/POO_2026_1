//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite as Coordenadas (X,Y): ");

    double coordenada_x = scanner.nextDouble();
    double coordenada_y = scanner.nextDouble();

    while ((coordenada_x != 0) && (coordenada_y != 0)){
        if ((coordenada_x > 0) && (coordenada_y > 0)) {
            System.out.println("Quadrante 1");
        } else if ((coordenada_x > 0) && (coordenada_y < 0)) {
            System.out.println("Quadrante 4");
        } else if ((coordenada_x < 0) && (coordenada_y > 0)) {
            System.out.println("Quadrante 2");
        } else {
            System.out.println("Quadrante 3");
        }
        coordenada_x = scanner.nextDouble();
        coordenada_y = scanner.nextDouble();
    }
}
