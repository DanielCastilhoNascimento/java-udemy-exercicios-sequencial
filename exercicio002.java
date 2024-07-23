import java.util.Scanner;

public class exercicio002 {
public static void main(String[] args) {;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o raio de um circulo : ");
    double raio = scanner.nextDouble();

    System.out.printf("AREA = %.4f", (3.14159 * (raio * raio)));

    scanner.close();
}
}
