import java.util.Scanner;

public class exercicio001 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite dois inteiros : ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    System.out.println("SOMA = " + (num1 + num2));
    
    scanner.close();
}
}
