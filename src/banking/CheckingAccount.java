package banking;

public class CheckingAccount extends Account implements AllAccounts{
    double balance;

    @Override
    void deposit(double amount) {
        balance = amount;
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    double addInterest() {
        return balance *= CHECKING_INTEREST;
    }
}
