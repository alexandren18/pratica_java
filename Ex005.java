import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner resposta = new Scanner(System.in);

        // declarando variaveis
        int funcionario = resposta.nextInt();
        int horas = resposta.nextInt();
        double valorHora = resposta.nextDouble();
        double salario = horas * valorHora;

        // saida
        System.out.println("Number = " + funcionario);
        System.out.printf("Salary = U$ %.2f", salario);
        resposta.close();
    
    }
}
