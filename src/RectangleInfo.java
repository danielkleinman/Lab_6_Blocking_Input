import java.util.Scanner;
public class RectangleInfo {
    public static void main(String args[])
    {
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        Scanner input = new Scanner(System.in);

        boolean done = false;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (input.hasNextDouble())
            {
                width = input.nextDouble();
                input.nextLine();
                done = true;
            }
            else
            {
                String trash = input.nextLine();
                System.out.println("You inputted: " + trash + " which is not a number. Please input a number.");
            }
        }while(!done);
        done = false;
        do{
            System.out.print("Enter the height of the rectangle: ");
            if (input.hasNextDouble())
            {
                height = input.nextDouble();
                done = true;
            }
            else
            {
                String trash = input.nextLine();
                System.out.println("You inputted: " + trash + " which is not a number. Please input a number.");
            }
        }while(!done);
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt((width * width) + (height * height));
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The diagonal of the rectangle is: " + diagonal);
    }
}
