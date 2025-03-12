import java.util.Locale;
import java.util.Scanner;

public class Ex034 {
    public static double calcularMedia(double a, double b, double c) {
        return ( a + b + c) / 3 ;

    }
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digita a terceira nota: ");
        double nota3 = sc.nextDouble();

        double resultado = calcularMedia(nota1, nota2, nota3);
        System.out.printf("Sua média é %.1f\n", resultado);
        sc.close();
    }
}
