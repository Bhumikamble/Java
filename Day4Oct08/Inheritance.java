class Vehicle{
    String brand;

    //method
    void startEngine(){
        System.out.println(brand + "Engine started.");
    }
}

//child class (Subclass) inherits from vehicle
class Bike extends Vehicle{
    boolean hasCarrier;

    void kickStand(){
        System.out.println("Kickstandput down");
    }
}
public class Inheritance {
    
    public static void main(String[] args){

        Bike myBike=new Bike();
        myBike.brand="shine";
        myBike.startEngine();
        myBike.kickStand();
    }
}
