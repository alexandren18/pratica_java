public class Ex031 {
    public static String saudacao( String a) {
        return "Ola, " + a + "!";
    }

    public static void main(String[] args) {
        String mensagem = saudacao("Alexandre");
        System.out.println(mensagem);
        
    }
}