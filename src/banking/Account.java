package banking;

import java.util.ArrayList;

public abstract class Account {

    private Customer customer;
    private double balance;
    private Long account_number;
    private ArrayList<Transaction> transactions;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract double addInterest();

    @Override
    public String toString() {
        return "Bank{" +
                "customer=" + customer +
                ", balance=" + balance +
                ", account_number=" + account_number +
                ", transactions=" + transactions +
                '}';
    }

}
