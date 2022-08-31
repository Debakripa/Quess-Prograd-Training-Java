import java.util.Scanner;

//Find sum and average of all elements in an array
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements of the array: ");
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of elements of the array = " + sum);
        System.out.println("Average of elements of the array = " + (sum/arr.length));

    }
}
