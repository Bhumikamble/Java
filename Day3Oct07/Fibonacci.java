



import java.util.Scanner;  

public class Fibonacci {  

    static void fibonacci(int n) {  

        int a = 0;  // First number
        int b = 1;  // Second number

        for (int i = 1; i <= n; i++) {  

            System.out.print(a + " ");  

            int c = a + b;  //we will add a and b to get next number

            a = b; //move b into a 

            b = c;  
        }
    }

    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter number of terms: ");  

        int n = sc.nextInt();  

        fibonacci(n);  
    }
}
