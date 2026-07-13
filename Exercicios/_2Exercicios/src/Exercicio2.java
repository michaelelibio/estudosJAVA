package src;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        if(a % 2 == 0){
        System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        sc.close();
    }
}
