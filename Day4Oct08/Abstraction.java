abstract class PaymentGateway{
    // Concrete method (shared behavior)
    void printReceipt(){
        System.out.println("Receipt is generated.");
    }

    //Abstract Method
    abstract void processPayment(double amount);
}


//concrete child class 1
class UPIPayment extends PaymentGateway{
    @Override void processPayment(double amount){
        System.out.println("Processing" +amount+ "via UPI QR code");

    }
}


//Concrete child class 2
class CreditCardPayment extends PaymentGateway{
    @Override 
    void processPayment(double amount){
        System.out.println("Processing" +amount+"via card swipe ans OTP");
    }
}


public class Abstraction {
    public static void main(String[] args){

        PaymentGateway payment=new UPIPayment();
        payment.processPayment(250.00);
        payment.printReceipt();
    }
}
