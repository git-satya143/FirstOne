package bank;

public class Account {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String accountNumber, String accountHolder, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.accountHolder= accountHolder;
        this.balance= balance;
    }

    public void  deposit(double amount){
        balance += amount;
        System.out.println(amount+"deposited, and new balance is:"+ balance);
    }
    public  void  withdraw(double amount){
        if (balance>=amount){
            balance -= amount;
            System.out.println(amount+"withdraw. And New balance is:"+balance);
        }
        else
            System.out.println("insufficient balance");
    }

}
