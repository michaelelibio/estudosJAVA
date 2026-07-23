import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos número terá entrada: ");
        int x = sc.nextInt();
        System.out.println("Digite " + x + " números");
        int in = 0, out = 0;

        for(int i = 0; i <= x; i++ ){

            int valor = sc.nextInt();

            if(valor >= 10 && valor <=20){
                in++;
            }
            else{
                out++;
            }
        }

        System.out.println("In " + in);
        System.out.println("out " + out);
        sc.close();
    }
}
