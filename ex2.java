package exEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrada: ");
        double raio = scan.nextDouble();
        double pi = 3.14159;
        double area = pi * (raio * raio);

        System.out.printf("A= %.4f%n ", area);

        scan.close();

    }
}
