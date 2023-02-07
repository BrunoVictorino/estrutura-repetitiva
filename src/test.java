import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char res;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalente a Fahrenheit : %.1f%n", F);
            System.out.print("deseja repetir ? (s/n)");
            res = sc.next().charAt(0);
        } while (res != 'n');

        sc.close();
    }
}
