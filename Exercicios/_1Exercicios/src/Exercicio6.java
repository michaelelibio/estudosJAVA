import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo ;

        System.out.print("Digite três valores: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a * c) / 2;
        circulo = 3.14159 * (c * c);
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;


        System.out.printf("A área do triângulo  é de: %.3f%n", triangulo);
        System.out.printf("A área do circulo é de: %.3f%n", circulo);
        System.out.printf("A área do trapezio é de: %.3f%n", trapezio);
        System.out.printf("A área do quadrado é de: %.3f%n", quadrado);
        System.out.printf("A área do retangulo é de: %.3f%n", retangulo);

        sc.close();
    }
}
