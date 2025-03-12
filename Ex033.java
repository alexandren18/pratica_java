import java.util.Scanner;

public class Ex033 {
    
    public static boolean ehPar(int a){
        if(a % 2 == 0){
            return true;
        }
        else{
             return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean resultado = ehPar(numero);
        System.out.println(resultado);
        sc.close();
        
        
    }
    
}
