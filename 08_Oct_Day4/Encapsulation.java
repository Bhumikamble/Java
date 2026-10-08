class BankAccount1{
    private String holderName;
    private double balance;

    public BankAccount1(String holderName,double balance){
        this.holderName=holderName;
        setBalance(balance);
    }

    //getter read-only-access
    public double getBalance(){
        return this.balance;
    }

    //Setter (Controlled write access with validation)
    public void setBalance(double amount){
        if(amount>=0){
            this.balance=amount;  
        }  
        else{
            System.out.println("Invalid Balance: cannot be negative");
        }
    
    }
}


public class Encapsulation {
    public static void main(String[] args){

        BankAccount1 acc = new BankAccount1("Bhumi",12000);
        // acc.balance = -100; // COMPILER ERROR: balance has private access!
        acc.setBalance(100);
        System.out.println(acc.getBalance());
    }
}
