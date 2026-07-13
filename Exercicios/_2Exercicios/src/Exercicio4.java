package src;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dia, a, b, duracao;
        dia = 24;

        System.out.println("Digite o horario do inicio do jogo: ");
        a = sc.nextDouble();
        System.out.println("Digite o horario do fim do jogo: ");
        b = sc.nextDouble();

        if (a < b) {
            duracao = b - a;
            System.out.printf("O jogo durou %.2f%n", duracao);
        } else if (a > b) {
            duracao = (dia - a) + b;
            System.out.printf("O jogo durou %.2f%n", duracao);
        } else {
            System.out.println(" jogo teve 24h ");
            sc.close();
        }
    }
}


