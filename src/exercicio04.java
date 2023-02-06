import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();

            if(x > 0 && x < 1001){
                for(int i=0; i <= x; i++ ){
                    if(i % 2 != 0){
                        System.out.println(i);
                    }
                }
            }
            else{
                System.out.println("Numero invalido");
            }

        sc.close();
    }
}
