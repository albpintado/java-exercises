package BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NegativeBalance {
    public static void main(String[] args) {
        List<BankAccount> bankAccountsList = new ArrayList<BankAccount>();
        List<BankAccount> negativeBankAccounts = new ArrayList<BankAccount>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type balances to add to list\nType NaN chars to stop");
        while (scanner.hasNextInt()) {
            BankAccount account = new BankAccount(scanner.nextInt());
            bankAccountsList.add(account);
        }

        for (int i = 0; i < bankAccountsList.size(); i++) {
            if (bankAccountsList.get(i).getBalance() < 0) {
                negativeBankAccounts.add(bankAccountsList.get(i));
            }
        }

        for (BankAccount i : negativeBankAccounts) {
            System.out.println(i.getBalance());
        }
    }
}
