import java.util.Scanner;

/*
Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
        If driver is married
        If driver is unmarried male and age above 30
        If driver is unmarried female and age above 25

 */
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M if you are married, U if you are unmarried: ");
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'M' , 'm'://Married
                System.out.println("You ARE ELIGIBLE for driver insurance");
                break;
            case 'U' , 'u'://Unmarried
                System.out.println("Enter M if you are Male, F if you are Female");
                char chr = sc.next().charAt(0);
                System.out.println("Enter your age: ");
                int age = sc.nextInt();
                switch(chr)
                {
                    case 'M' , 'm'://Male
                        if (age >= 30)
                        {
                            System.out.println("Congratulations! You ARE ELIGIBLE for driver insurance");
                        }
                        else
                        {
                            System.out.println("Sorry, you are NOT ELIGIBLE for driver insurance");
                        }
                        break;

                    case 'F' , 'f'://Female
                        if (age >= 25)
                        {
                            System.out.println("Congratulations! You ARE ELIGIBLE for driver insurance");
                        }
                        else
                        {
                            System.out.println("Sorry, you are NOT ELIGIBLE for driver insurance");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
