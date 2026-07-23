package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Student stud = new Student();

        System.out.print("Entry student name: ");
        stud.name = sc.nextLine();
        System.out.print("Grade firts semester: ");
        stud.grade1 = sc.nextDouble();
        System.out.print("Grade second semester: ");
        stud.grade2 = sc.nextDouble();
        System.out.print("Grade third semester: ");
        stud.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", stud.finalGrade());

        if (stud.finalGrade() <60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", stud.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}