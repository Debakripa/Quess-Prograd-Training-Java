//Calculates the sum of digits of an integer entered by user
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Math.abs(sc.nextInt());
        int sum = 0;
        while (num > 0)
        {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println(sum);
    }
}
