import java.util.Locale;
import java.util.Scanner;

public class exercicio006 {

/*
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B
 */

public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 3 valores : ");

    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double num3 = scanner.nextDouble();

    System.out.printf("Triangulo = %.3f \n", (num1 * num3)/2);
    System.out.printf("Circulo   = %.3f \n", (num3 * num3)*3.14159);
    System.out.printf("Trapezio  = %.3f \n", (num1 + num2)/2 * num3);
    System.out.printf("Quadrado  = %.3f \n", num2 * num2);
    System.out.printf("Retangulo = %.3f \n", num1 * num2);



    scanner.close();
}
}
