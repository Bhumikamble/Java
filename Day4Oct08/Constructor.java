class Car {
    String color;
    String Brand;
    int speed;

    // Constructor
    Car(String color, String Brand, int speed) {
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }

    // Method 1
    void displayInfo() {
        System.out.println(Brand);
        System.out.println(color);
        System.out.println(speed);
    }

    // Method 2
    void accelerate(int incr) {
        int or_speed = speed;

        speed = speed + incr;

        System.out.println("Original Speed: " + or_speed);
        System.out.println(Brand + " accelerated by " + speed + " Km/hr");
    }
}

public class Constructor {
    public static void main(String[] args) {

        Car c1 = new Car("Blue", "BMW", 360);

        c1.displayInfo();

        c1.accelerate(50);
    }
}