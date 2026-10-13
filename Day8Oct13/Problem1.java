// Problem 1: Parse and sum a comma-separated string
// Task: Given a string of numbers separated by commas, extract each number and
// calculate the total sum.

package Day8Oct13;
public class Problem1{
    public static void main(String[] args){
        String input="10,25,40,30,60";
        String[] parts=input.split(",");
        
        // Create a variable to store the sum, starting from 0
        int total=0;

        for(String part : parts){

            // Convert the String into an integer and add it to total
            total+=Integer.parseInt(part);
        }
        System.out.println("Total sum: " + total);
    }
}