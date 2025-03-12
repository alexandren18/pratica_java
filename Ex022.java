import java.util.Locale;
import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         for( int i = 1; i<= n; i++){
            double numero1 = sc.nextDouble();
            double numero2 = sc.nextDouble();
            double divisao = numero1 / numero2;
            if(numero2 == 0){
                System.out.println("Divisão Impossivel");
            }

            else{
                System.out.printf("%.1f\n", divisao);
            }


         }
         
        sc.close();}
    
}
