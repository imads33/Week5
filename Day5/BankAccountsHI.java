/*Create a class called BankAccount with attributes balance and interest_rate. Create two subclasses, CheckingAccount and SavingsAccount, that both inherit from BankAccount. Add an attribute transaction_fee to CheckingAccount and an attribute min_balance to SavingsAccount. Create a method in CheckingAccount called withdraw() that subtracts an amount from the balance and also subtracts the transaction fee. Create a method in SavingsAccount called add_interest() that adds interest to the balance.*/

import java.util.Scanner;

class BankAcccountHI {
    double balance = 50000;
    float intrestRate = 10.00f;
}

class CheckingAccountHI extends BankAcccount {
    double minBalance = 500;

    void addIntrest() {
        double intrest = intrestRate * balance / 100;
        balance = balance + intrest;
    }
}

class SavingsAccountHI extends BankAcccountHI {
    Scanner sc = new Scanner(System.in);
    double transactionFee = 150;

    void withdraw() {
        System.out.println("Enter the Amount");
        double amount = sc.nextDouble();
        balance = balance - amount - transactionFee;
    }
}

public class BankAccountsHI {
    public static void main(String[] args) {
        SavingsAccountHI sa = new SavingsAccountHI();
        CheckingAccountHI ca = new CheckingAccountHI();
        sa.withdraw();
        ca.addIntrest();
    }
}