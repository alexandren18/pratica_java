import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int gasolina = 0;
        int alcool = 0;
        int disel = 0;

        while (codigo != 4) {
            if (codigo == 1){
                alcool += 1;

            }

            else if ( codigo == 2){
                gasolina += 1;
            }

            else if (codigo == 3){
                disel += 1;
            }

            codigo = sc.nextInt();

        

            }
        
    System.out.println("MUITO OBRIGADO");
    System.out.printf("Alcool: %d\n", alcool);
    System.out.printf("Gasolina: %d\n", gasolina);
    System.out.printf("Diesel: %d\n", disel);
    sc.close();}


        
}

