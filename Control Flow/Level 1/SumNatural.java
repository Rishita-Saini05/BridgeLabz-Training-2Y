import java.util.*;

class SumNatural {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int original = n;
        int sum = 0;

        while(n > 0) {
            sum = sum +n;
            n--;
        }

        int formulaSum = (original * (original + 1)) / 2;

        if (sum == formulaSum) {
            System.out.println("true");
        } else {
            System.out.println("not equal");
        }

        System.out.println("sum = "+sum);
    }
}
