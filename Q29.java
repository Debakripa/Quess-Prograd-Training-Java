/*
Print the pattern:
ABCDE
BCDE
CDE
DE
E
 */

public class Q29 {
    public static void main(String[] args) {
        //In this pattern, every row ends with E
        char chr;//to store characters in each row
        for(int i = 1; i <= 5; i++)//Rows
        {
            switch (i)
            {
                case 1:
                    //1st row starts with A
                    chr = 'A';
                    while (chr <= 'E')
                    {
                        System.out.print(chr);
                        chr++;
                    }
                    System.out.println();
                    break;
                case 2:
                    //2nd row starts with B
                    chr = 'B';
                    while (chr <= 'E')
                    {
                        System.out.print(chr);
                        chr++;
                    }
                    System.out.println();
                    break;
                case 3:
                    //3rd row starts with C
                    chr = 'C';
                    while (chr <= 'E')
                    {
                        System.out.print(chr);
                        chr++;
                    }
                    System.out.println();
                    break;
                case 4:
                    //4th row starts with D
                    chr = 'D';
                    while (chr <= 'E')
                    {
                        System.out.print(chr);
                        chr++;
                    }
                    System.out.println();
                    break;
                case 5:
                    //5th row starts with E
                    chr = 'E';
                    System.out.println("E");
                default:
                    //Never executes as this for loop ranges just from 1 to 5
                    break;
            }
        }
    }
}