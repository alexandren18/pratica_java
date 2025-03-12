import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
         String fraseSemA = frase.replace("a","*");
         String fraseSemE = fraseSemA.replace("e", "*");
         String fraseSemI = fraseSemE.replace("i", "*");
         String fraseSemO = fraseSemI.replace("o", "*");
         String fraseSemVogal = fraseSemO.replace("u", "*");
         System.out.println(fraseSemVogal);
         sc.close();
    }
    
}
