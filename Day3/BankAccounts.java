import java.util.Scanner;

class BankAccount {
    Scanner sc = new Scanner(System.in);
    long acNo;
    double balance;

    BankAccount(long acNo, double balance) {
        this.acNo = acNo;
        this.balance = balance;
    }

    void withdraw() {
        System.out.println("Enter Amount to withdraw");
        balance = balance - sc.nextDouble();
        displayBalance();

    }

    void deposit() {
        System.out.println("Enter Amount to deposite");
        balance = balance + sc.nextDouble();
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Balance is " + balance);
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter account number ");
        long acno = s.nextLong();
        System.out.println("Enter Balance");
        double balance = s.nextLong();

        BankAccount ba = new BankAccount(acno, balance);
        ba.withdraw();
        ba.deposit();
    }
}