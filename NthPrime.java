import java.util.Scanner;

/*
You are given a number 'N'. Your task is to find Nth prime number.
If you are asked to find the 7th prime number, it’ll be 17 because the first 7 prime
numbers are 2, 3, 5, 7, 11, 13, 17.

 */
public class NthPrime
{
    public static void main(String[] args)
    {
        System.out.println("Enter value of n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[10000];
        arr[0] = 2;
        int pos = 0;
        int i = 3;
        while(pos + 1 <= n)
        {
            if (check(i) != 0)
            {
                    arr[++pos] = i;
            }
            i++;
        }

        System.out.println(n + "th prime number is: " + arr[n-1]);
    }
    static int check(int num)
    {
            if(num <= 1)
            {
                return 0;
            }
            int c = 2;
            while (c * c <= num) {
                if (num % c == 0) {
                    return 0;
                }
                c = c + 1;
            }
            if (c * c > num)
            {
                return 1;
            }
            return 0;
    }
}
