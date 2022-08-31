import java.util.Scanner;

//Count total number of unique elements in the array
public class Q32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        int i,j;//Looping variables
        for(i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int uniqueCount = 0;//Total number of unique elements in array
        for(i = 0; i < arr.length; i++)//Getting each element of the array
        {
            int count = 0;//Frequency of each array element
            for(j = 0; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                }
            }
            if (count == 1)
            {
                uniqueCount++;
            }
        }
        System.out.println("The number of unique elements in the array = " + uniqueCount);
    }
}
