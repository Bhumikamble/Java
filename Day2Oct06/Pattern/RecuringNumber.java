// print 
// 1
// 01
// 101
// 0101

package Pattern;

public class RecuringNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {   //i is for rows 

            for (int j = 1; j <= i; j++) {

                if ((i+j) % 2 == 0) {    //j is for column
                    System.out.print("1");
                } 
                else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }
}

