class Constructor {

    // Private data members
    private String name;
    private double balance;

    // Initializing constructor
    Constructor(String name, double initialDeposit) {
        this.name = name;
        this.balance = initialDeposit;
    }

    // Adding funds
    void addFunds(double amount) {
        balance = balance + amount;
        System.out.println("Added " + amount);
        System.out.println("Current balance: " + balance);
    }

    // Making a purchase
    void purchase(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Purchase successful: " + amount);
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
            System.out.println("Balance remains: " + balance);
        }
    }

    // Quick Account Overview
    void accountOverview() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}


public class CoffeeWallet {

    public static void main(String[] args) {

        Constructor wallet = new Constructor("Bhumi", 500);

        wallet.accountOverview();

        wallet.addFunds(200);

        wallet.purchase(150);

        wallet.purchase(800);

        wallet.accountOverview();
    }
}