import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double value = scanner.nextDouble();

            if (value <= 0 || index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total = " + total);
        scanner.close();
    }
}
