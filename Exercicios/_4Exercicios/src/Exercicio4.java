import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pares quais seram divididos: ");
        int pares = sc.nextInt();

        for (int i = 1; i <= pares; i++) {
            System.out.println("Par número " + i);
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b != 0) {
                double divisao = a / b;
                System.out.println("Valor da divisão: " + divisao);
            } else {
                double divisao = a / b;
                System.out.println("Divisão impossivel " + divisao);
            }
        }
    }
}
