import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                System.out.print("Enter the height of the rectangle: ");
                if(in.hasNextDouble())
                {
                    height = in.nextDouble();
                    in.nextLine();
                    done = true;
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You must enter a valid double. ");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid double. ");
            }

        }
        while (!done);
        area = width * height;
        System.out.println("The area of the rectangle is " + area);

        perimeter = (width * 2) + (height * 2);
        System.out.println("The perimeter of the rectangle is " + perimeter);

        diagonal = Math. sqrt(Math. pow(width,2)+Math. pow(height,2));
        System.out.printf("The diagonal of the rectangle is %5.2f", diagonal);
    }
}
