import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for( int i = 1; i <= numero;i++){
            int quadrado = (int)Math.pow(i, 2);
            int cubo = (int)Math.pow(i, 3);
            System.out.println(i + " " + quadrado + " " + cubo);
        }
    sc.close();}
}
