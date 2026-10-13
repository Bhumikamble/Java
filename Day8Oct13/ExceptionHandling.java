
package Day8Oct13;


//try = contains a code that might throw an exception
//catch=handles an exception
//throw=explicitly throws an exception
//finally=runs after try and catch like a default statement


//try catch
//try catch catch
//finally
//throw
//throws



//try catch
// public class ExceptionHandling {
//     public static void main(String[] args){
//         int a = 10;
//         int b=0;
        
//         try{
//             int result=a/b;
//             System.out.println(result);
//         }
//         catch(ArithmeticException e){
//             System.out.println("You cannot divide by 0.");
//         }
//     }
// }



//try catch catch
// public class ExceptionHandling{
//     public static void main(String[] args){
//        try{
//         int result=10/0;
//         System.out.println(result);
//         int[] numbers={10,20,30};
//         System.out.println(numbers[5]);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//         System.out.println("Invalid array index");
//        }
//        catch(ArithmeticException e){
//         System.out.println("Cannot divide by 0");
//        }

//     }
// }



//finally keyword
// public class ExceptionHandling{
//     public static void main(String[] args){
//        try{
//         int result=10/5;
//         System.out.println(result);
        
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//         System.out.println("Invalid array index");
//        }
//        finally{
//         System.out.println("finally block executed");
//        }

//     }
// }



//throw
// import java.util.Scanner;

// public class ExceptionHandling {

//     public static void main(String[] args) {

//         // Create Scanner object to take input
//         Scanner sc = new Scanner(System.in);

//         // Ask the user to enter age
//         System.out.println("Enter age:");

//         // Read the age entered by the user
//         int age = sc.nextInt();

//         // Check if age is negative
//         if (age < 0) {
//             throw new IllegalArgumentException("Age cannot be negative");
//         }

//         // Print age if it is valid
//         System.out.println("Age: " + age);

//         // Close Scanner
//         sc.close();
//     }
// }



//throws
// import java.io.*;
// class ExceptionHandling{
//     static void readFile() throws IOException{
//         FileReader file=new FileReader("data.txt");
//         System.out.println("File opened");

//     }

//     public static void main(String[] args){
    
//         try{
//             readFile();
//         }
//         catch(IOException e){
//             System.out.println("Could not find the file");
//         }
//     }
// }




// class ExceptionHandling{
//     public static void main(String[] args) {
//         int balance=6000;
//         // int withdrawal=7000;
//         int withdrawal=2000;

//         try{
//             if(withdrawal>balance){   
//                 throw new IllegalArgumentException(
//                     "Insufficient balance"
//                 );

//             }
//             balance -= withdrawal;  
//             System.out.println("Withdrawal was successful");//if withdrawal amount is less than balance amount then this will get executed
//             System.out.println("Remaining balance: " + balance);
//           }
//           catch(IllegalArgumentException e){
//             System.out.println(e.getMessage());
//           }
//           System.out.println("Program completed");
//     }
// }



//Write a program that takes two integer inputs from the user and calculates their division. If the second number is zero, handle the resulting ArithmeticException gracefully and print an error message instead of crashing.
import java.util.*;
public class ExceptionHandling{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.println( "Enter 2nd number:");
        int num2=sc.nextInt();

        
        try{
            int result=num1/num2;
        }catch(ArithmeticException e){
                System.out.println("cannot divide by 0");
        }finally{
            System.out.println("program executed");
        }
    }
}