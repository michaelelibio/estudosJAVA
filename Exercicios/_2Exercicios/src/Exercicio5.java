package src;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String produto;
        int codigoProduto, quantidade;
        double preco = 0;
        double total;

        codigoProduto = sc.nextInt();
        quantidade = sc.nextInt();

        if(codigoProduto == 1){
            produto = ("Cachorro quente");
            preco = 4.00;
        }
        else if(codigoProduto == 2){
            produto = ("X-Salada");
            preco = 4.50;
        }
        else if(codigoProduto == 3){
            produto = ("X-Bacon");
            preco = 5.00;
        }
        else if(codigoProduto == 4){
            produto = ("Torrada");
            preco = 2.00;
        }
        else if(codigoProduto == 5){
            produto = ("Refrigerante");
            preco = 1.50;
        }
        else{
            System.out.println("Código invalido.");
        }
        total = preco * quantidade;
        System.out.printf("O preço total foi de: R$%.2f%n", total);
        sc.close();
    }
}
