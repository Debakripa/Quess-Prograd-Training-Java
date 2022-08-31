import java.util.Scanner;

//Print transpose of a given matrix
public class Q37
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int cols = sc.nextInt();
        //int size = rows * cols;
        int arr[][] = new int[rows][cols];//Original array
        //int newArr[][] = new int[rows][cols];//New array
        System.out.println("Enter the elements of the matrix: ");
        int i,j;//Looping variables
        for(i = 0; i < rows; i++)
        {
            for(j = 0; j < cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array you entered is: ");
        for(i = 0; i < rows; i++)
        {
            for(j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose matrix is: ");
        for(i = 0; i < rows; i++)
        {
            for(j = 0; j < cols; j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
