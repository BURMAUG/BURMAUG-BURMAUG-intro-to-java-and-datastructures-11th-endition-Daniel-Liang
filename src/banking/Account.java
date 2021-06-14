package banking;

import java.util.ArrayList;

public class Bank {

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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(Long account_number) {
        this.account_number = account_number;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

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
