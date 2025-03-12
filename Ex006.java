import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner resposta = new Scanner(System.in);

        //Declarando variaveis

        int codigo1 = resposta.nextInt();
        int peça = resposta.nextInt();
        double valor = resposta.nextDouble();
        int codigo2 = resposta.nextInt();
        int peça2 = resposta.nextInt();
        double valor2 = resposta.nextDouble();
        double total =  (peça * valor) + (peça2 * valor2);

        // saida 

        System.out.printf("Valor a pagar R$ %.2f", total);
        resposta.close();


        

    resposta.close();}
    
    
}
