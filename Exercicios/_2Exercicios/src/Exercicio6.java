package src;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double intervalo;
        intervalo = sc.nextDouble();

        if(intervalo >= 0 && intervalo <= 25){
            System.out.println("O intervalo foi de 0 a 25");
        }
        else if(intervalo > 25 && intervalo <= 50){
            System.out.println("O intervalo foi de 25 a 50");
        }
        else if(intervalo > 50 && intervalo <= 75){
            System.out.println("O intervalo foi de 50 a 75");
        }
        else if(intervalo > 75 && intervalo <= 100){
            System.out.println("O intervalo foi de 75 a 100");
        }
        else{
            System.out.println("Fora de qualquer intervalo");
        }
    }
}
