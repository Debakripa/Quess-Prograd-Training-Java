/*
Write a program to input electricity unit charge and calculate the total electricity bill
according to the given condition:
        For first 50 units Rs. 0.50/unit
        For next 100 units Rs. 0.75/unit
        For next 100 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill.
 */

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your electricity input charge: ");
        int units = sc.nextInt();
        double bill = 0.0;
        //Number of units can't be negative
        if (units < 0)
        {
            System.out.println("Invalid choice");
        }
        //For 1st 50 units
        else if (units >= 0 && units <= 50)
        {
            bill = 0.50 * units;
        }
        //For next 100 units
        else if (units > 50 && units <= 150)
        {
            bill = 0.50 * 50 + 0.75 * (units - 50);
        }
        //For next 100 units
        else if (units > 150 && units <= 250)
        {
            bill = 0.50 * 50 + 0.75 * 100 + 1.20 * (units - 100);
        }
        //For units > 250
        else
        {
            bill = 0.50 * 50 + 0.75 * 100 + 1.20 * 100 + 1.50 * (units - 250);
        }
        //Adding 20% surcharge to the bill obtained to get final bill
        bill += bill * (20/100.0);
        System.out.println("Your bill is " + bill);
    }
}
