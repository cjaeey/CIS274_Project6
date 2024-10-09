// Carlos John Escala
// September 11, 2024
// Lab 6, Calculating a fee for a loan
// This project calculates a fee for a loan

import java.util.Scanner;

public class FeeCalc
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("What is the amount of the check you'd like to deposit?");
        int checkDeposit = keyboard.nextInt();
        System.out.println("Receipt:\n" + "Amount of check: $" + checkDeposit);
        int returnvalue_first = checkDeposit - 1;
        double returnvalue_secondpercent = checkDeposit * 0.1;
        double returnvalue_second = checkDeposit - returnvalue_secondpercent;
        double returnvalue_thirdpercent = checkDeposit * 0.05 + 5;
        double returnvalue_third = checkDeposit - returnvalue_thirdpercent;
        double returnvalue_fourthpercent = checkDeposit * 0.01 + 40;
        double returnvalue_fourth = checkDeposit - returnvalue_fourthpercent;

        if (checkDeposit <= 10)
        {
            System.out.println("Service Charge: 1 \nAmount returned to you: " + returnvalue_first);
        }
        else if (checkDeposit > 10 && checkDeposit <= 100)
        {
            System.out.println("Service Charge: $" + returnvalue_secondpercent);
            System.out.println("Amount returned to you: $" + returnvalue_second);
        }
        else if (checkDeposit > 100 && checkDeposit <= 1000)
        {
            System.out.println("Service Charge: $" + returnvalue_thirdpercent);
            System.out.println("Amount returned to you: $" + returnvalue_third);
        }
        else if (checkDeposit > 1000)
        {
            System.out.println("Service Charge: $" + returnvalue_fourthpercent);
            System.out.println("Amount returned to you: $" + returnvalue_fourth);
        }
        else
            System.out.println("Invalid Input, put only numbers(no commas)");
    }

}