import java.util.*;
class Calc
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter no. 1 : ");
        int n1 = obj.nextInt();
        System.out.print("enter no. 2 : ");
        int n2 = obj.nextInt();
        int add = n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        double div = n1/n2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ n1 +" and " +n2+" is " +add+ ","+sub+","+mul+" and " +div);
    }
}