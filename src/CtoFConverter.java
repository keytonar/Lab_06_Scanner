import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double cVal = 0.0;
        double fVal = 0.0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Enter the value in Celsius: ");
            if(in.hasNextDouble())
            {
                cVal = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid double not: " + trash);
            }
        }
        while (!done);

        fVal = (cVal * 1.8) + 32;
        System.out.printf("The value for %5.2f is %5.2f", cVal, fVal);
    }
}