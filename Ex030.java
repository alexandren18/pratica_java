import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        String[] nomeSeparado = nome.split(" ");
        System.out.println(nomeSeparado[0]);
        System.out.println(nomeSeparado[1]);
        System.out.println(nomeSeparado[2]);
        System.out.println(nomeSeparado[3]);
        sc.close();
        
    }
    
}
