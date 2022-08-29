import java.util.Scanner;

/*
Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

 */

public class MatrixOp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For input matrix: ");
        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = scanner.nextInt();
        int input[][] = new int[rows][columns];

        int i,j;
        int index = -1;
        int count = 0;
        int rowNo,columnNo;


        System.out.println("Enter elements of matrix: ");
        for(i = 0; i < rows; i++)
        {
            for(j = 0; j < columns; j++)
            {
                input[i][j] = scanner.nextInt();
                if (input[i][j] == 0)
                {
                    count++;
                }
            }
        }

        System.out.println("The matrix you entered is: ");
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

        int zeroIndex[][] = new int[count][2];
        for(i = 0; i < rows; i++)
        {
            for(j = 0; j < columns; j++)
            {
                if (input[i][j] == 0)
                {
                    zeroIndex[++index][0] = i;
                    zeroIndex[index][1] = j;
                }
            }
        }

        for(i = 0; i < count; i++)
        {
            for(j = 0; j < 2; j++)
            {
                if (j == 0)
                {
                    rowNo = zeroIndex[i][j];
                    for (int k = 0; k < columns; k++) {
                        input[rowNo][k] = 0;
                    }
                }
                else
                {
                    columnNo = zeroIndex[i][j];
                    for(int l = 0; l < rows; l++)
                    {
                        input[l][columnNo] = 0;
                    }
                }
            }
        }
        
        System.out.println("Resultant matrix: ");
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }
}
