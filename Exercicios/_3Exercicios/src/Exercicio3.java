import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigo, gasolina, alcool, diesel;
        gasolina = 0;
        alcool = 0;
        diesel = 0;
        codigo = sc.nextInt();

        while(codigo != 4){

            if(codigo == 1){
                gasolina++;
            }
            else if(codigo == 2){
                alcool ++;
            }
            else if(codigo == 3){
                diesel ++;
            }
            else{
                System.out.println("codigo invalido, digite um novo código");
            }
            codigo = sc.nextInt();
        }

        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Dielse: " + diesel);
        System.out.println("Muito obrigado");
        sc.close();
    }
}
