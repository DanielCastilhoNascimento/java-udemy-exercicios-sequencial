import java.util.Locale;
import java.util.Scanner;

public class exercicio005 {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o código, quantidade, e valor unitario da peça 1 : ");
    int codigo = scanner.nextInt();
    int qtde = scanner.nextInt();
    double valor = scanner.nextDouble();

    System.out.println("Digite o código, quantidade, e valor unitario da peça 2 : ");
    int codigo2 = scanner.nextInt();
    int qtde2 = scanner.nextInt();
    double valor2 = scanner.nextDouble();
    double valorPagar = (qtde*valor) + (qtde2*valor2);
    System.out.printf("Valor a pagar das peças %d e %d:  R$ %.2f",codigo, codigo2, valorPagar);

    scanner.close();
}
}
