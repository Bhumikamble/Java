// problem 4: find the second largest element
// problem statement given an array of integers,find the second largest distinct
// element in a single traversal without sorting the array.

package Day8Oct13;

import java.util.*;
public class secondLargest {

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the size of an array: ");
    int n=sc.nextInt();

    if(n<2){
        System.out.println("Array must contain atleast 2 elements.");
        return;
    }


    //entering n number of array elements
    int[] arr=new int[n];
    System.out.println("Enter: "+n+ " elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;

    for(int i=0;i<n;i++){
        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
        }
        else if(arr[i]> secondLargest && arr[i] != largest){
            secondLargest=arr[i];
        }
    }
    }
}


