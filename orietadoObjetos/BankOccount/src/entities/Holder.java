package entities;

public class Holder {
    public String name;
    public int account;
    public double balance;

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdrawn(double amount){
        balance -= amount;
        return balance;
    }
    }

