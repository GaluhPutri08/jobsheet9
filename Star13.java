import java.util.Scanner;

public class Star13{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai N = ");
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            System.out.println("*");
        } sc.close();
    }
}
