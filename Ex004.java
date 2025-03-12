import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // declarando vareavies

        Scanner resposta = new Scanner(System.in);
        int a = resposta.nextInt();
        int b = resposta.nextInt();
        int c = resposta.nextInt();
        int d = resposta.nextInt();
        int diferença = (a * b) - (c * d);

        // saida 
        System.out.println("Diferença = " + diferença);

        resposta.close();



    }
    
}
