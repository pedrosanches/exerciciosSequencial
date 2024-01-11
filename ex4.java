package exEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Identificação funcionario: ");
        int funcionario = scan.nextInt();
        System.out.println("Horas trabalhadas: ");
        double horas = scan.nextDouble();
        System.out.println("Valor U$/HR: ");
        double valorhr = scan.nextDouble();

        System.out.println("Funcionario: " + funcionario);
        System.out.printf("Salario: %.2f%n", horas*valorhr);

        scan.close();


        
    }
}