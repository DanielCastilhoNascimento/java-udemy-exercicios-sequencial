import java.util.Locale;
import java.util.Scanner;

public class exercicio004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero do funcionário: ");
        String numFuncionario = scanner.nextLine();

        System.out.print("Numero de horas trabalhadas:    ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Valor da hora trabalhada:       ");
        double valorHora = scanner.nextDouble();

        System.out.println("Numero:  " + numFuncionario);
        System.out.println("Salario: "+ (horasTrabalhadas*valorHora));

        scanner.close();
    }
    

}
