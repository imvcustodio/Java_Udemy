package applocation;

import entities.Account;
import entities.BusinnesAcount;
import entities.SavingsAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Account account = new Account(1001, "Isac", 1000.0);
            account.withdraw(100.0);
            System.out.println(account.getBalance());

            Account account2 = new SavingsAccount(1002, "Isac", 1000.0, 0.0);
            account2.withdraw(100.0);
            System.out.println(account2.getBalance());

            Account account3 = new BusinnesAcount(1003, "Isac", 1000.0, 0.0);
            account3.withdraw(100.0);
            System.out.println(account3.getBalance());
        scanner.close();
    }
}