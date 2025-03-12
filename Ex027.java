import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        int indiceArroba = email.indexOf("@");
        String usuario = email.substring(0,indiceArroba);
        String dominio = email.substring( indiceArroba + 1);


        System.out.println(usuario);
        System.out.println(dominio);
        sc.close();}
    
}
