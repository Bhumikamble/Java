// print 
// 12345
// 1234
// 123
// 12
// 1


package Pattern;

public class InvertNumber {
     public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {       //i is for rows will compare 5 with j which is strarting from 1

            for (int j = 1; j <= i; j++) {   //we will compare j with i till it becomes less than or equal to i
                System.out.print(j);     
            }

            System.out.println();
        }
    }
}

