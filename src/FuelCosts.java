import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double fuelEff = 0;
        double gasPrice = 0;
        // •	The number of gallons of gas in the tank
        //•	The fuel efficiency in miles per gallon
        //•	The price of gas per gallon
        String trash = "";
        double costPer100 = 0;
        double driveLeft = 0;
        boolean done = false;

        do
        {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if(in.hasNextDouble())
            {
                gallonsInTank = in.nextDouble();
                in.nextLine();
                System.out.print("Enter the cars fuel efficiency in miles per gallon: ");
                if(in.hasNextDouble())
                {
                    fuelEff = in.nextDouble();
                    in.nextLine();
                    System.out.print("Enter the price of gas: ");
                    if(in.hasNextDouble())
                    {
                        gasPrice = in.nextDouble();
                        in.nextLine();
                        done = true;
                    }
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("ERROR: You must enter a valid number not: " + trash);
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println("ERROR: You must enter a valid number not: " + trash);
            }
        }
        while(!done);

        // Then print the cost per 100 miles and how far the car can go with the gas in the tank.

        costPer100 = gasPrice * 100;

        System.out.println("The cost per 100 miles is " + costPer100);

    }
}
