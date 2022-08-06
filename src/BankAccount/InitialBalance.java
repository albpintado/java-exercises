package BankAccount;

import User.User;

import java.util.ArrayList;
import java.util.List;

public class InitialBalance {
    public static void main(String[] args) {
        List<User> usersList = getUsers();
        for (User user :
                usersList) {
            if (user.getName().contains(" ")) {
                BankAccount userBankAccount = new BankAccount(100);
                user.setBankAccount(userBankAccount);
            } else {
                BankAccount userBankAccount = new BankAccount(0);
                user.setBankAccount(userBankAccount);
            }
        }

        for (User user : usersList) {
            System.out.println(user.getBankAccount().getBalance());
        }
    }

    static List<User> getUsers() {
        String[] names = {"Alberto", "Luis Alberto", "Nabil", "Juan Miguel", "Nabil"};
        List<User> usersList = new ArrayList<>();

        for (String name : names) {
            User user = new User(name);
            usersList.add(user);
        }

        return usersList;
    }
}
