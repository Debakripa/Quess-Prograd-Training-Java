import java.util.Scanner;

public class Q34
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int i;//Loop control variable
        System.out.println("Please enter the array elements: ");
        for(i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        int countEven = 0, countOdd = 0;//Keeps count of even and odd elements
        for(i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        int even[] = new int[countEven];
        int odd[] = new int[countOdd];
        int pos1 = 0, pos2 = 0;
        for (i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                even[pos1] = arr[i];
                pos1++;
            }
            else
            {
                odd[pos2] = arr[i];
                pos2++;
            }
        }
        System.out.println("Separating given array elements into odd and even:");
        System.out.println("Even elements are: ");
        for (i = 0; i < countEven; i++)
        {
            System.out.print(even[i] + " ");
        }
        System.out.println("Odd elements are: ");
        for (i = 0; i < countOdd; i++)
        {
            System.out.print(odd[i] + " ");
        }
    }
}
