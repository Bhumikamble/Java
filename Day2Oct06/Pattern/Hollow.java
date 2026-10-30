// print
// *****
// *   *
// *   *
// *****

package Pattern;

public class Hollow {
    
 public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {   //i is for rows 

            for (int j = 1; j <= 5; j++) {

                if (i == 1 || i == 4 || j == 1 || j == 5) {  //j is for column
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}