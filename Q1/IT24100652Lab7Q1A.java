import java.util.Scanner;

public class IT24100652Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input marks for four subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 4: ");
        int subject4 = scanner.nextInt();
        
        // Calculate average
        int total = subject1 + subject2 + subject3 + subject4;
        double average = total / 4.0;

        // Determine grade
        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        // Display the result
        System.out.println("Average Marks: "  + average);
        System.out.println(" Overall Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}
