import java.util.Scanner;

public class GCD {

    static void gcd(int a, int b) {
        int n = Math.min(a, b);//we are finding min value between a and b because GCD can never be greater than the smaller number

        for (int i = 1; i <= n; i++) { //check number from 1 to n
            
            if (a % i == 0 && b % i == 0) {  //checks if i divides both the numbers
                System.out.println("GCD = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        gcd(a, b);
    }
}