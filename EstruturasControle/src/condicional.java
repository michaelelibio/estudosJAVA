import java.util.Scanner;

public class condicional {
    public static void main(String[] args){
        double preco = 34.5;
        double desconto;

        if (preco < 20.0){
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        System.out.println(desconto);

        double desconto2 = (preco > 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto2);
    }
}

class escopo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount = 0.0;


        if (price > 200.00){
            discount = price * 0.1;

        } else {
            discount = 0;
        }

        double finalPrice = price - discount;

        System.out.println("O preço total é de: " + price);
        System.out.println("O desconto é de: " + discount);
        System.out.println("O preço final é de: " + finalPrice);

        sc.close();
    }
}

class expressoesLogicas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.print("Quais são as horas? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else {
            if (hora < 18){
                System.out.println("Boa tarde");
            } else {
                System.out.println("Boa noite");
            }
        }
        sc.close();
    }
}


