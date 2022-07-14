//Display the Armstrong numbers between 2 given intervals
//153 = 1^3 + 5^3 + 3^3, so 153 is Armstrong
//1634 = 1^4 + 6^4 + 3^4 + 4^4, so 1634 is Armstrong

import java.util.*;
public class Q20
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower interval: ");
        int interval1 = Math.abs(sc.nextInt());
        System.out.println("Enter higher interval");
        int interval2 = Math.abs(sc.nextInt());
        System.out.println("Armstrong numbers in this range are: ");
        //Check if each number from interval1 to interval2 are Armstrong or not
int j;
        for(int i = interval1; i <= interval2; i++)
        {
            int sum = 0;
            int temp = i;
            String number = Integer.toString(temp);
            //int len = number.length();
            j=i;
            while (j > 0)
            {
                int len = number.length();
                int rem = j % 10;
                int value = 1;
                while (len > 0)
                {
                    value *= rem;
                    len--;
                }
                //System.out.println(value);
                sum += value;
                 j /= 10;
            }
            if (sum == temp)
            {
                System.out.println(temp);
            }

        }

    }
}
