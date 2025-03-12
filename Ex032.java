import java.util.Scanner;

public class Ex032 {
    
    public static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int resultado = soma(numero1, numero2);
        System.out.println(resultado);
        sc.close();
        
    }
    
}
