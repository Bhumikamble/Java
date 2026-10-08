class StudentProfile {

    
    private String name;
    private int studentId;
    private double score;

    // Constructor 1: Exam Taker
    StudentProfile(String name, int studentId, double score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    // Constructor 2: Direct Walk-in
    StudentProfile(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.score = 0.0;
    }

    // Determine letter grade
    char getGrade() {
        
        if (score >= 90) {
            return 'A';
        } 
        else if (score >= 75) {
            return 'B';
        } 
        else if (score >= 50) {
            return 'C';
        } 
        else {
            return 'F';
        }
    }

    // Print report card
    void printReportCard() {
        
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + getGrade());
        System.out.println();
    }
}


public class StudentProfileDemo {

    public static void main(String[] args) {

        // Exam Taker
        StudentProfile student1 =
                new StudentProfile("Bhumi", 101, 100);

        // Direct Walk-in
        StudentProfile student2 =
                new StudentProfile("Ved", 102);

       
        student1.printReportCard();
        student2.printReportCard();
    }
}