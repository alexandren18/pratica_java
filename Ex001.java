import java.util.Locale;

public class Ex001 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
        
        // Declarando variavéis
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30 ;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measue = 53.234567;

        // saida
        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is %.2f", product2, price2);
        System.out.println();
        System.out.printf("Record %d years old, code %d and gender: %s\n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %f\n", measue);
        System.out.printf("Rouded ( three decimal places): %.3f", measue);






    }
    
}
