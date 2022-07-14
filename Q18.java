//Prints the reverse of a positive integer

import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Math.abs(sc.nextInt());
        int rev = 0;//To store the reverse of the number
        while (num > 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse is " + rev);
    }
}
