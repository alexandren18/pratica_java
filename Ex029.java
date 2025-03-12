import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
         int primeiraLetraA = nome.indexOf("a");
         int ultimaLetraA = nome .lastIndexOf("a");
         System.out.println(primeiraLetraA);
         System.out.println(ultimaLetraA);
         sc.close();
         

    }
    
}
