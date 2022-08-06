package BankAccount;

public class BankAccount {
    private int balance;

    public BankAccount(int inputBalance) {
        balance = inputBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }
}
