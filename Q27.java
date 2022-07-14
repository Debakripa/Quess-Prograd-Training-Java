import java.util.Scanner;

//Find the table of a user-given number using recursion

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose multiplication table you want: ");
        int num = sc.nextInt();
        System.out.println("The multiplication table of " + num + " is: ");
        table(num,1);
        //We want to find the table of the number from 1 to 10
    }
    //Recursive function to calculate table of the user-given number

    static long table(int num, int position)
    {
        if (position == 11)
        {
            return 1;
            //We are calculating table till 10 just, here in this code
        }
        System.out.println(num * position);
        return table(num,position+1);
    }
}
