import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        //declarando variaveis
        Scanner resposta = new Scanner(System.in);
        int n1 = resposta.nextInt();

        // estrutura de condição
        if(n1 % 2 == 0){
            System.out.println("PAR");
        }

        else{
            System.out.println("IMPAR");
        }
    resposta.close();}
}
