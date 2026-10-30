// Problem 3: Filter odd numbers from an ArrayList
// Task: Create an ArrayList<Integer> with mixed numbers, remove all odd numbers, and
// print the remaining list.

package Day8Oct13;

import java.util.*;

public class Problem3 {
    public static void main(String[] args){
        List<Integer> numbers=new ArrayList<>();

        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(18);
        numbers.add(10);

        List<Integer> evens=new ArrayList<>();
        for(Integer num:numbers){
            if(num%2==0){
                evens.add(num);
            }
        }
        System.out.println("Even numbers: " + evens);
    }
}
