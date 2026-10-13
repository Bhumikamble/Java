package Day8Oct13;

import java.util.*;
public class Array1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter " +n+" elements:");


        //take input for each array element
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;

        //adding al array elements
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }

        double average=(double) sum/n;

        System.out.println("Sum: " +sum);
        System.out.println("Average: " +average);

    }
}
