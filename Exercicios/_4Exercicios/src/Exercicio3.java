import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de testes a serem feitos: ");
        int teste = sc.nextInt();

        for(int i = 1; i <= teste; i++){
            System.out.println("teste de número " + i);
            System.out.println("Digite o valor 1: ");
            double valor1 = sc.nextDouble();
            System.out.println("Digite o valor 2: ");
            double valor2 = sc.nextDouble();
            System.out.println("Digite o valor 3: ");
            double valor3 = sc.nextDouble();

            double media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10.0;
            System.out.printf("A foi de média: %.1f%n", media);

        }
        sc.close();

    }
}
