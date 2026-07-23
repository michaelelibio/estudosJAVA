package application;

import entities.Holder;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Holder holder =  new Holder();

        System.out.print("Entry name of holder account: ");
        holder.name = sc.nextLine();
        System.out.print("Number account?: ");
        holder.account = sc.nextInt();
        System.out.print("Balance account?: ");
        holder.balance = sc.nextDouble();

        System.out.println("Holder: " + holder.name);
        System.out.println("Number account: " + holder.account);
        System.out.println("Balance account: " + holder.balance);
        System.out.println();
        System.out.println("Name holder: " + holder.name + " Number account:  " + holder.account + " Balance: " + holder.balance);
        System.out.println();

        System.out.print("Enter the amount to be deposited: ");
        double amount = sc.nextDouble();
        holder.deposit(amount);
        System.out.println("Current balance: " + holder.balance);
        System.out.println();


        String response;
        System.out.println("Do you want to make a withdrawal?: ");
        System.out.println("Yes or not");
        System.out.println("response: Y/N");
        response = sc.next();

        while (response.equalsIgnoreCase("Y")){
            System.out.print("How much would you like to withdraw?: ");
            amount = sc.nextDouble();
            holder.withdrawn(amount);
            System.out.println("Current balance: " + holder.balance);
            System.out.println("Do you want to make a withdrawal?: ");
            System.out.println("response: Y/N");
            response = sc.next();

        }
        System.out.println("End program.");
        sc.close();

    }
}
