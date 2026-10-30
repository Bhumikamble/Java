import java.util.Scanner;

public class PerformanceAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 1st subject Marathi: ");
        int a = sc.nextInt();

        System.out.println("Enter the marks of 2nd subject Hindi: ");
        int b = sc.nextInt();

        System.out.println("Enter the marks of 3rd subject English: ");
        int c = sc.nextInt();

        System.out.println("Enter the marks of 4th subject Science: ");
        int d = sc.nextInt();

        System.out.println("Enter the marks of 5th subject Maths: ");
        int e = sc.nextInt();

        int total = a + b + c + d + e;
        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (a < 35 || b < 35 || c < 35 || d < 35 || e < 35) {
            System.out.println("Result: Fail");
        }
        else if (percentage >= 85) {
            System.out.println("Result: Distinction");
        }
        else if (percentage >= 70) {
            System.out.println("Result: First Class");
        }
        else if (percentage >= 60) {
            System.out.println("Result: Second Class");
        }
        else if (percentage >= 50) {
            System.out.println("Result: Pass Class");
        }
        else {
            System.out.println("Result: Pass");
        }

        if (a >= b && a >= c && a >= d && a >= e) {
            System.out.println("Highest Scoring Subject: Marathi");
        }
        else if (b >= a && b >= c && b >= d && b >= e) {
            System.out.println("Highest Scoring Subject: Hindi");
        }
        else if (c >= a && c >= b && c >= d && c >= e) {
            System.out.println("Highest Scoring Subject: English");
        }
        else if (d >= a && d >= b && d >= c && d >= e) {
            System.out.println("Highest Scoring Subject: Science");
        }
        else {
            System.out.println("Highest Scoring Subject: Maths");
        }
    }
}