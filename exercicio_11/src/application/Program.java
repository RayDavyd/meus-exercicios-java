package application;

import entities.account;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String userName = sc.nextLine();

        System.out.print("Is there initial deposit (y/n) ? ");
        char c = sc.next().charAt(0);

        if (c == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new account(accountNumber, userName, initialDeposit);
        } else {
            account = new account(accountNumber, userName);
        }

        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}