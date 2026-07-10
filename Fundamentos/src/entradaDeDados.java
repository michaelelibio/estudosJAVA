import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        System.out. println("Você digitou: " + x);
    }
}

class numeroInteriro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        System.out. println("Você digitou: " + x);

        sc.close();
    }
}
class numeroflutuante{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);// para que a entrada de dedos tenha a entrada comum com o ponto (.)
        Scanner sc = new Scanner (System.in);

        double x;
        x = sc.next().charAt(0);

        System.out.println(x);
        sc.close();
    }
}

class leituraCaractere{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char x;
        x = sc.next().charAt(0);

        System.out.println(x);
        sc.close();
    }
}

class maisVariaveis {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados");
        System.out.println("Nome: " + x);
        System.out.println("idade: " + y);
        System.out.println("Altura: " + z);
    }
}


