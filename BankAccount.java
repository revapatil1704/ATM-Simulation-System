package bankManagement;

public class BankAccount {
	double balance;

    BankAccount(double b) {
        balance = b;
    }

    void deposit(double amt) {
        balance = balance + amt;
        System.out.println("Amount deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance = balance - amt;
            System.out.println("Amount withdrawn: " + amt);
        } else {
            System.out.println("Not enough balance");
        }
    }

    void showBalance() {
        System.out.println("Balance is: " + balance);
    }
}

