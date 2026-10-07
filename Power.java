//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 


import java.util.*;

public class Power{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = sc.nextInt();

        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println("Answer = " + result);


    }
}
