import java.util.*;

public class Circumference {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        
        float radius = sc.nextFloat();

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference of the circle = " + circumference);
    }
}
// hello