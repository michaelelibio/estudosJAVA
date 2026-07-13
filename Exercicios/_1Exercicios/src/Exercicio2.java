import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, area;
        x = sc.nextDouble();
        area = 3.14159 * (x * x);

        System.out.printf("O valor da area é de: %.4f%n", area);

        sc.close();

    }
}
