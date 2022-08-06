package User;

import BankAccount.BankAccount;

public class User {
    private String name;
    private BankAccount bankAccount;

    public User(String inputName) {
        name = inputName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount newBankAccount) {
        bankAccount = newBankAccount;
    }
}
