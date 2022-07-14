import java.util.Scanner;

//Counts all factors of a number

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose factors you want to find: ");
        int num = sc.nextInt();
        System.out.println("Number of factors of " + num + " is: ");
        int count = 0;
        if (num == 0)
        {
            System.out.println("As all numbers are factors, so answer = infinity");
        }
        else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    //Then both +i and -i are factors of num
                    //Example: For 10, both 5 (5*2=10) and -5(-5*-2=-10) are factors
                    count += 2;
                }
            }
            System.out.println(count);
        }
    }
}
