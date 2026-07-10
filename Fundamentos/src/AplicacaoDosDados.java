import java.util.Scanner;

public class AplicacaoDosDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}

class quebraDeLinha{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        String x1,x2, x3;


        x1 = sc.nextLine();
        x2 = sc.nextLine();
        x3 = sc.nextLine();

        System.out.println("Dados Digitados: ");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        sc.close();
    }
}
