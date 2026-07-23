package src;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
              double salario, imposto;
              imposto = 0.0;
              salario = sc.nextDouble();

              if(salario <= 2000){
                  System.out.println("Isento");
              }
              else if(salario <= 3000){
                  imposto = (salario - 2000) * 00.8;
              }
              else if(salario <= 4500){
                  imposto = (1000 * 0.08) + ((salario - 3000) * 0.18);
              }
              else {
                  imposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
              }
              System.out.println(imposto);
              sc.close();
    }
}
