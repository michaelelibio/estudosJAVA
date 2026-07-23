import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int total = 1;

        for(int i = x; i >= 1; i--){
            total = total * i;


        }
        System.out.println(total);
        sc.close();
    }
}
