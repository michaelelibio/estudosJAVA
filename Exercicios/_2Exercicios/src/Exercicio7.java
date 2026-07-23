package src;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        System.out.println("Escreva as coordenadas x");
        x = sc.nextDouble();
        System.out.println("Escreva as coordenadas y");
        y = sc.nextDouble();

        if(x == 0 && y ==0){
            System.out.println("Origem.");
        }
        else if(y == 0){
            System.out.println("Eixo x");
        }
        else if(x == 0){
            System.out.println("Eixo y");
        }
        else if(x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if(x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else{
            System.out.println("Q4");
        }

        sc.close();



    }
}
