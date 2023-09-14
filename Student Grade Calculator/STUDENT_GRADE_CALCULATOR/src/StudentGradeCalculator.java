import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks for subject 1:");
        int subject1Marks = scanner.nextInt();

        System.out.println("Enter the marks for subject 2:");
        int subject2Marks = scanner.nextInt();

        System.out.println("Enter the marks for subject 3:");
        int subject3Marks = scanner.nextInt();

        System.out.println("Enter the marks for subject 4:");
        int subject4Marks = scanner.nextInt();

        System.out.println("Enter the marks for subject 5:");
        int subject5Marks = scanner.nextInt();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;

        float averagePercentage = (float) totalMarks / 500 * 100;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
