import java.util.Scanner;

public class Q41
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String string = input.toLowerCase();
        int count = 0;
        int value = 1;
        for(int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) != string.charAt(string.length() - value))
            {
                count++;
            }
            value++;
        }
        if (count == 0)
        {
            System.out.println(input + " is palindrome");
        }
        else
        {
            System.out.println(input + " is not palindrome");
        }
    }
}
