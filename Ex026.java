import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
         String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();
        String nomeSemEspaçosExtras = nome.trim();

        System.out.println(nomeMaiusculo);
        System.out.println(nomeMinusculo);
        System.out.println(nomeSemEspaçosExtras);


        sc.close();
    }
    
}
