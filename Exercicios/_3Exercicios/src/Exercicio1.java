import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int senha, senhaCorreta;
        senhaCorreta = 2002;
        senha = sc.nextInt();

        while(senha != senhaCorreta){
            System.out.println("A senha esta incorreta");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta.");
        sc.close();
    }
}
