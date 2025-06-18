import java.util.Scanner;

class Grade {
    // Instance variables
    private String name;
    private int roll;
    private double marks;
    private char grade;

    // Constructor
    public Grade(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        Grade_Calculation(); // Automatically calculate grade
    }

    // Method to calculate grade
    private void Grade_Calculation() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();
        System.out.print("Enter obtained marks: ");
        double marks = scanner.nextDouble();

        // Creating object and testing the functionality
        Grade student = new Grade(name, roll, marks);
        student.displayInfo();

        scanner.close();
    }
}
