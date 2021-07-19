package banking;

public class SavingAccount extends Account implements  AllAccounts{

    double balance;

    @Override
    void deposit(double amount) {
       balance += amount;
    }

    @Override
    void withdraw(double amount) {
         balance -= amount;
    }

    @Override
    double addInterest() {
        return  balance *= SAVINGS_INTEREST;
    }
}
