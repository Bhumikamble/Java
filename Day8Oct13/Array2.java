// //problem 2: find the largest and smallest element
// problem statement given an array of integers,traverse through the array to find and
// print the maximum and minimum values present in it.

package Day8Oct13;

import java.util.*;
public class Array2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array; ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter " + n + " elements");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //assume that the 1st element is 0
        int min=arr[0];

        //assume that the first element is maximum
        int max=arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("Maximum: " + max );
        System.out.println("Minimum: " + min )
;
        
    }
}
