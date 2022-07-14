import java.util.Scanner;

//Find the sum of 1 to n using recursion
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Math.abs(sc.nextInt());
        //We won't consider a negative number
        System.out.println("Sum from 1 to " + num + " = " + sum(num));
    }
    static long sum(int num)
    {
        if (num == 1)
        {
            return num;
        }
        return num + sum(num-1);
    }
}
