import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double miles = 0;
        double inches = 0;
        double feet = 0;
        double meters = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter your amount in meters: ");
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("ERROR: You must enter a valid number not: " + trash);
            }
        }
        while(!done);

        miles = meters / 1609.344;
        inches = meters * 39.370079;
        feet = meters / 3.28084;

        System.out.println("Your measurement in miles is " + miles);
        System.out.println("Your measurement in inches is " + inches);
        System.out.println("Your measurement in feet is " + feet);

    }
}
