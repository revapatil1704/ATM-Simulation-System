package bankManagement;

public class ATMSystem {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);
        ATM atm = new ATM(account);

        atm.checkPin();   // PIN check + menu inside
    }
}

