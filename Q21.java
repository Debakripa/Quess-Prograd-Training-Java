//Output the greatest among 4 numbers entered using ternary operators
import java.util.*;
public class Q21
{
    public static void main(String[] args)
    {
        System.out.println("Enter 4 numbers: ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double max1,max2,max;
        max1 = (num1>num2)?num1:num2;
        max2 = (num3>num4)?num3:num4;
        max = (max1>max2)?max1:max2;
        System.out.println("Greatest number is "+max);

    }
}
