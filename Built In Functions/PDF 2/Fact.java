import java.util.Scanner;

public class Fact{

    public static void main(String[] args) {
        int number = getInput();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        while (n < 0) {
            System.out.print("Invalid input. Please enter a non-negative integer: ");
            n = scanner.nextInt();
        }
        return n;
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is " + result);
    }
}
