import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner resposta = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double raio = resposta.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(raio,2);

        // saida
        System.out.printf("A= %.4f", area);

        resposta.close();
        

    }
    
}
