import java.util.Locale;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        //Declarando vareaveis
        Scanner resposta = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int a = resposta.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = resposta.nextInt();
        int soma = a + b;

        // saida
        System.out.println("Soma = " + soma);
        resposta.close();


    }
    
}
