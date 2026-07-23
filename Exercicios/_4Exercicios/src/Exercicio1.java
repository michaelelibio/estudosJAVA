import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        for(int i = 0; i <= a; i++){
            if(i % 2 !=0 ) {
                System.out.println(i);
            }

        }
        sc.close();
    }
}
