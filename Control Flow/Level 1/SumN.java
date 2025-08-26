import java.util.*;

class SumN{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int original = n;
        int sum = 0;

        for (int i = n;i>0;i--){
            sum = sum + i;
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
