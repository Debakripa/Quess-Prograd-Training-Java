import java.util.Scanner;

//Prints all factors of a number
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose factors you want to find: ");
        int num = sc.nextInt();
        System.out.println("The factors of " + num + " are: ");
        if (num == 0)
        {
            System.out.println("All numbers");
        }
        else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    System.out.println("-" + i);
                }
            }
        }
    }
}
