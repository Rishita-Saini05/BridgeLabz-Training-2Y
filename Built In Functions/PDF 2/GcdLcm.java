import java.util.Scanner;

public class GcdLcm {

    public static void main(String[] args) {
        int[] numbers = getInput();
        int a = numbers[0];
        int b = numbers[1];

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        displayResult(a, b, gcd, lcm);
    }

    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2};
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0)
            return a;
        return calculateGCD(b, a % b);
    }

    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
