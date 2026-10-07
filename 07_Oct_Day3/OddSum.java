//Enter 3 numbers from the user & make a function to print the sum of odd numbers.

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}