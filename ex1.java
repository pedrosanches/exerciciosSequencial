package exEstruturaSequencial;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrada:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int soma = n1 + n2;

        System.out.println("Saída:");
        System.out.println("SOMA= " + soma);
        
        scan.close();
    }
}
    