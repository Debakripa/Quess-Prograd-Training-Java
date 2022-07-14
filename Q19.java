import java.util.*;
public class Q19 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        String number = Integer.toString(temp);
        int len = number.length();
        while (num > 0)
        {
            len = number.length();
            int rem = num % 10;
            int value = 1;
            while (len > 0)
            {
                value *= rem;
                len--;
            }
            //System.out.println(value);
            sum += value;
            num /= 10;
        }
        if (sum == temp)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
