import java.util.Scanner;
import java.util.Locale;

public class repeticaoDo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;

        do{
          System.out.println("Digita a temperatura em Celcios: ");
          double C = sc.nextDouble();
          double F = 9.0 * C / 5.0 + 32.0;
          System.out.println("Equivalente em Fahrenheit: " + F);
          System.out.println("Deseja repetir a conversão? (s/n)");
          resposta = sc.next().charAt(0);

        } while(resposta != 'n');
        sc.close();


    }
}
