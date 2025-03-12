import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        // declarando variaveis
        
        Scanner resposta = new Scanner(System.in);
         int a = resposta.nextInt();
         int b = resposta.nextInt();

         if ( a % b == 0 || b % a == 0){
            System.out.println("São mutiplos");
         }

         else{
            System.out.println("Não são multiplios");
         }
         resposta.close();


    }
    
}
