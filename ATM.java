package bankManagement;

	import java.util.Scanner;
	public class ATM {
	    int pin = 1234;
	    BankAccount acc;
	    Scanner sc = new Scanner(System.in);

	    ATM(BankAccount a) {
	        acc = a;
	    }

	    void checkPin() {
	        System.out.print("Enter PIN: ");
	        int p = sc.nextInt();

	        if (p == pin) {
	            menu();
	        } else {
	            System.out.println("Wrong PIN");
	        }
	    }

	    void menu() {
	        int ch;

	        do {
	            System.out.println("\n1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");

	            ch = sc.nextInt();

	            if (ch == 1) {
	                acc.showBalance();

	            } else if (ch == 2) {
	                System.out.print("Enter amount: ");
	                double amt = sc.nextDouble();
	                acc.deposit(amt);

	            } else if (ch == 3) {
	                System.out.print("Enter amount: ");
	                double amt = sc.nextDouble();
	                acc.withdraw(amt);

	            } else if (ch == 4) {
	                System.out.println("Thank you");

	            } else {
	                System.out.println("Invalid choice");
	            }

	        } while (ch != 4);
	    }
	}

