import java.util.Scanner;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

 */
public class RotateArray
{
    public static void main(String[] args)
    {
        System.out.println("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        int i;
        for(i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter number of steps by which you want to rotate array " +
                "to the right: ");
        int k = scanner.nextInt();
        for(i = 1; i <= k; i++)
        {
            rotate(arr);
        }
        System.out.println("Resultant array is: ");
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    static void rotate(int arr[])
    {
        int i;
        int temp = arr[0];
        for(i = 0; i < arr.length; i++)
        {
            if ( i == arr.length - 1)
            {
                arr[0] = temp;
            }
            else
            {
                int prev = arr[i + 1];
                arr[i + 1] = temp;
                temp = prev;
            }
        }
    }
}
