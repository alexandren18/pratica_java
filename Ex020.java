import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for( int i = 1; i < n;i++){
            if( i >= 10 && i <= 20){
                in += 1;
            
            }
            else{
                out += 1;
            }


        }
        System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
    }
    
}
