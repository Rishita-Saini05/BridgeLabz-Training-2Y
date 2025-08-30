import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String[] studentNames = new String[numberOfStudents];
        int[][] studentMarks = new int[numberOfStudents][3];
        double[] studentPercentages = new double[numberOfStudents];
        String[] studentGrades = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            input.nextLine();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();
            System.out.println("Enter marks for " + studentNames[i] + " (Physics, Chemistry, Maths):");
            studentMarks[i][0] = getValidMark(input, "Physics");
            studentMarks[i][1] = getValidMark(input, "Chemistry");
            studentMarks[i][2] = getValidMark(input, "Maths");
            double totalMarks = studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2];
            studentPercentages[i] = (totalMarks / 300) * 100;
            if (studentPercentages[i] >= 80) {
                studentGrades[i] = "A";
            } else if (studentPercentages[i] >= 70) {
                studentGrades[i] = "B";
            } else if (studentPercentages[i] >= 60) {
                studentGrades[i] = "C";
            } else if (studentPercentages[i] >= 50) {
                studentGrades[i] = "D";
            } else if (studentPercentages[i] >= 40) {
                studentGrades[i] = "E";
            } else {
                studentGrades[i] = "R";
            }
        }
        System.out.println("\n--- Student Report Card ---");
        System.out.println("Name\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%s\t%d\t%d\t\t%d\t%.2f%%\t\t%s\n",
                    studentNames[i], studentMarks[i][0], studentMarks[i][1], studentMarks[i][2],
                    studentPercentages[i], studentGrades[i]);
        }
    }
    public static int getValidMark(Scanner input, String subject) {
        int mark;
        do {
            System.out.print(subject + " mark: ");
            mark = input.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Please enter a value between 0 and 100.");
            }
        } while (mark < 0 || mark > 100);
        return mark;
    }
}