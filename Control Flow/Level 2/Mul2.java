import java.util.*;

public class Mul2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            int counter = 1;
            while (number * counter < 100) {
                System.out.println(number * counter);
                counter++;
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 99.");
        }

        
    }
}
