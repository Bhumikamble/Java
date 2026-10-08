class BankAccount{
    String accountHolder;
    double balance;
    BankAccount(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    //Deposit
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: "  + amount);
        System.out.println("New Balance: " + balance);

    }

    //withhdraw
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal: " +amount);
            System.out.println("Updated Balance: " +balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }

        
    }
        void displayAccount() {
            System.out.println("Account holder name: " + accountHolder);
            System.out.println("Current Balance " + balance + "\n");
        }
}


public class Bank {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Bhumi", 5000);

        b1.displayAccount();

        b1.deposit(12000);

        b1.withdraw(1000);

        b1.withdraw(10000);
    }
}
