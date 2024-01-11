package exEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrada: ");
        int pc1 = scan.nextInt();
        int qntpc1 = scan.nextInt();
        double vlrpc1 = scan.nextDouble();
        int pc2 = scan.nextInt();
        int qntpc2 = scan.nextInt();
        double vlrpc2 = scan.nextDouble();
        double totalpc1 = qntpc1 * vlrpc1;
        double totalpc2 = qntpc2 * vlrpc2;
        double total = totalpc1 + totalpc2;
        System.out.println("Saída: ");
        System.out.printf("Valor a ser pago U$: %.2f%n", total);

        scan.close();

    }
}
