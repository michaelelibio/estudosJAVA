package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Person person = new Person();

        person.name = sc.nextLine();
        person.age = sc.nextInt();
        person.hight = sc.nextDouble();

        if(person.age >= 18){
            System.out.println("This person is adult.");
        }
        else{
            System.out.println("This person is a child.");
        }
    }
}
