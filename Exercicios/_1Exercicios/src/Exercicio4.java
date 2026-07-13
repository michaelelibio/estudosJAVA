import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String nome;
        int matricula;
        double horasTrabalhadas, valorHora, salario;

        System.out.print("Digite seu nome: ");
        nome = sc.next();
        System.out.print("Digite sua matricula: ");
        matricula = sc.nextInt();
        System.out.print("Quantas horas foram trabalhadas?: ");
        horasTrabalhadas = sc.nextDouble();
        System.out.print("Quanto você recebe a hora?: ");
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("Nome: " + nome + " - Matricula: " + matricula);
        System.out.printf("Seu salario foi de: %.2f%n", salario);

        sc.close();

    }
}
