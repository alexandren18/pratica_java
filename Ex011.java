import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // declarando variaveis
        
        Scanner resposta = new Scanner(System.in);
        int entrada = resposta.nextInt();
        int saida = resposta.nextInt();
        int duraçao;

        if( entrada < saida) {
            duraçao = saida - entrada ;

        }

        else{
            duraçao = 24 - entrada + saida;
        }

        System.out.println("O JOGO DUROU " + duraçao + " HORA(S))");

        
        resposta.close();}
    
}
