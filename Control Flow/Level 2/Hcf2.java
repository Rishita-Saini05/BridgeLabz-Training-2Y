import java.util.*;

public class Hcf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int greatestFactor = 1;

        if (number > 1) {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("Greatest factor (excluding the number itself): " + greatestFactor);
        } else {
            System.out.println("Please enter a number greater than 1.");
        }

        
    }
}
