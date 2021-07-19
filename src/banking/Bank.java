package banking;

import java.util.ArrayList;

public abstract class Bank {

    private ArrayList<Account> accounts;

    abstract void addAccount(long account);
    abstract void makeDeposit(float amount);
    abstract void makeWithdrawal(float amount);
    abstract long getAccount();

}
