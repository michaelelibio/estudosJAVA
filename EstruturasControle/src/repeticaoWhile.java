import java.util.Scanner;

public class repeticaoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;

        while(x != 0){
            soma = soma + x;
            x = sc.nextInt();

        }

        System.out.println(soma);

        sc.close();

        int y = 0;
        int z = 4;

        while(y < 3){
            y = y + 2;
            z = z + 1;

            System.out.println(y + " , " + z);
        }


    }
}
