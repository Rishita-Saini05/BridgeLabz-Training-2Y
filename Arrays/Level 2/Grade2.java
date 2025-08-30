import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        
        String[] studentNames = new String[numberOfStudents];
        int subjects = 3; // Physics, Chemistry, Maths
        int[][] marks = new int[subjects][numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();
            System.out.println("Enter marks for " + studentNames[i] + " (Physics, Chemistry, Maths):");
            marks[0][i] = getValidMark(input, "Physics");
            marks[1][i] = getValidMark(input, "Chemistry");
            marks[2][i] = getValidMark(input, "Maths");

            double total = marks[0][i] + marks[1][i] + marks[2][i];
            percentages[i] = (total / 300.0) * 100;

            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else if (percentages[i] >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        System.out.println("\n--- Student Report Card ---");
        System.out.println("Name\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%s\t%d\t%d\t\t%d\t%.2f%%\t\t%s\n",
                    studentNames[i], marks[0][i], marks[1][i], marks[2][i],
                    percentages[i], grades[i]);
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
