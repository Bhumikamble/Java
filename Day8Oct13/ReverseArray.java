// problem 3:reverse an array in-place
// problem statementreverse the elements of an array without using a second
// auxiliary array by using the two-pointer approach.

package Day8Oct13;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();

        //creating an array of size n
        int[] arr=new int[n];

        //asks the user to enter the n number of elements
        System.out.println("Enter " +n+ " elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int start=0;
        int end=n-1;

        while(start<end){
            //temperory variable stores the first side variable
            int temp=arr[start];
            // Put the last-side value at the start
            arr[start]=arr[end];
            arr[end]=temp;
            //moving start one position forward
            start++;
            //moving end one position backward
            end--;        
        }

        System.out.println("Reversed array: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }  
        System.out.println();  
    }
}
