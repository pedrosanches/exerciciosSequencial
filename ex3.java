package exEstruturaSequencial;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrada: ");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        System.out.println("Saída: ");
        System.out.println(A*B-(C*D));

        scan.close();


        
    }
}
