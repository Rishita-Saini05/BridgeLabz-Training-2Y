import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight in kg: ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height in meters: ");
            heights[i] = input.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f m, BMI = %.2f, Status = %s\n",
                    (i + 1), weights[i], heights[i], bmis[i], statuses[i]);
        }
    }
}