import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        // declarando vareaveis
        Scanner resposta = new Scanner(System.in);
        int n1 = resposta.nextInt();
         
        // estrutura de condição
        if (n1 >= 0) {
            System.out.println("não negativo");
         }

         else{
            System.out.println("Negativo");
         }
         resposta.close();

    }
    
}
