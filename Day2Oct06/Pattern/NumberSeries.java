// print
// 1
// 23
// 456
// 78910

package Pattern;

public class NumberSeries {
    public static void main(String[] args) {

        int count= 1;

        for (int i = 1; i <= 4; i++) {  //i is for rows

            for (int j = 1; j <= i; j++) {  //j is for columns
                System.out.print(count);
                count++;
            }

            System.out.println("  ");
        }
    }
}
