package challenge2;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<BankAccount> bankAccount = new ArrayList<>();

    public void TracksTransaction(BankAccount a, BankAccount b, double amount) {
        boolean accountsExist = bankAccount.stream().anyMatch(account -> account.equals(a) || account.equals(b));

        if (accountsExist) {
            a.deposit(amount);
            b.withdraw(amount);
        } else {
            System.out.println("One or both accounts do not exist");
        }
    }
}