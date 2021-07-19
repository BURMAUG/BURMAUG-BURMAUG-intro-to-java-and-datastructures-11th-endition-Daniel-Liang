package banking;

public class Senior extends Account implements AllAccounts{
    private int age;
    private String name;
    private String address;
    private double balance;

    public Senior(int age, String name, String address, double balance) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
         balance = balance - amount;
    }

    @Override
    double addInterest() {
        return balance *= SAVINGS_INTEREST; //IF SAVINGS ACCOUNT
    }

    @Override
    public String toString() {
        return "Senior{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", balance= '" + balance + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Account account = new Senior(123, "Burmau Garba", "Alex", 5000);
        account.deposit(2300);
        String result = account.toString();
        System.out.println(result);
        account.withdraw(300);
        result = account.toString();
        System.out.println(result);
    }
}
