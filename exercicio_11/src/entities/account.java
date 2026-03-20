package entities;

public class account {

    private int numberAccount;
    private String userName;
    private double balance;

    public account(int numberAccount, String userName, double balance) {
        this.numberAccount = numberAccount;
        this.userName = userName;
        this.balance = balance;
    }

    public account(int numberAccount, String userName) {
        this.numberAccount = numberAccount;
        this.userName = userName;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.00;
    }

    @Override
    public String toString() {
        return "BankAccount{"
                + "numberAccount= " + numberAccount
                + ", userName='" + userName + '\''
                + ", balance= R$ " + String.format("%.2f", balance)
                + '}';
    }
}