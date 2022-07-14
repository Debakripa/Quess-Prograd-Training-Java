/*
Write a Java program for bonus calculation. Accept basic salary from user.
Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary.
If basic >= 20,000 then give 10% bonus otherwise give 20% bonus on basic salary.
Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)
 */

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        double basicSalary = sc.nextDouble();
        double bonus = 0, grossSalary = 0;
        double ta = (10/100.0) * basicSalary;
        double da = (15/100.0) * basicSalary;
        double hra = (20/100.0) * basicSalary;
        double pf = (12/100.0) * basicSalary;
        if (basicSalary >= 20000)
        {
            bonus = (10/100.0) * basicSalary;
        }
        else
        {
            bonus = (20/100.0) * basicSalary;
        }
        grossSalary = basicSalary + da + ta + hra + bonus - pf;
        System.out.println("Your Gross salary = " + grossSalary);
    }
}
