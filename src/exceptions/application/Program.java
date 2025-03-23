package exceptions.application;


import exceptions.entities.Account;
import exceptions.exception.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Account number: ");
            int accountNumber =  sc.nextInt();
            sc.nextLine();
            System.out.print("\nHolder: ");
            String holder = sc.nextLine();
            System.out.print("\nInitial Balance: ");
            double initalBalance = sc.nextDouble();
            System.out.print("\nWithdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(accountNumber, holder, initalBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
            System.out.println("\n New balance: " + account.getBalance());

        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }

    }
}
