import java.util.Scanner;

public class exercicio003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.println("Diferença do produto de A e B pelo produto de C e D");
        System.out.println("Diferença = "+ ((num1 * num2) - (num3 * num4)));

        scanner.close();
    }

}
