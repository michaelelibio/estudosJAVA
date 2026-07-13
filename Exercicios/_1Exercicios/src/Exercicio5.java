import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int codigoPeca1, quantidadePecas1, codigoPeca2, quantidadePecas2;
        double valorPeca1, valorPeca2, somaPecas;

        System.out.print("Código da primeira peça: ");
        codigoPeca1 = sc.nextInt();
        System.out.print("Quantidade de peças: ");
        quantidadePecas1 = sc.nextInt();
        System.out.print("Valor da peça: ");
        valorPeca1 = sc.nextDouble();
        System.out.print("Código da segunda peça: ");
        codigoPeca2 = sc.nextInt();
        System.out.print("Quantidade de peças: ");
        quantidadePecas2 = sc.nextInt();
        System.out.print("Valor da peça: ");
        valorPeca2 = sc.nextDouble();
        somaPecas = (valorPeca1 * quantidadePecas1) + (valorPeca2 * quantidadePecas2);

        System.out.printf("o valor total a ser pago foi de: R$%.2f%n", somaPecas);

        sc.close();
    }

}
