import java.sql.SQLOutput;
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int a = 0;
        int g = 0;
        int d = 0;

        while(x != 4){
            x = sc.nextInt();
            if(x == 1){
                a += 1;
            }
            else if(x == 2){
                g += 1;
            }
            else if(x == 3){
                d += 1;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);

        sc.close();
    }
}
