import java.util.*;

public class CountNumbers {
    
    public static void main(String[] args){

        int positive=0;
        int negative=0;
        int zero = 0;
        

        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        while (true) {
        float num = sc.nextFloat();
        
            if (num==0) {
                break;
            }
            if(num>0){
                positive++;
            }
            else if(num<0){
                negative++;
            }
            else{
                zero++;
            }
        
        }
        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);

      }
}

