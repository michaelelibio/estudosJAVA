import java.util.Scanner;

public class condicionalternaria {
    public static void main(String[] args) {

    double preco = 34.5;
    double desconto;

            if (preco < 20.0) {
        desconto = preco * 0.1;
            }
            else {
                desconto = preco * 0.5;
            }
        System.out.println(desconto);

        double desconto2 = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto2);
    }

}

