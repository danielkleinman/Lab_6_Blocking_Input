import java.util.Scanner;
public class FuelCosts {
    public static void main() {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double pricePerGallon = 0;
        double mpg = 0;
        String trash = "";
        boolean done = false;
        double costPer100Miles = 0;
        double range = 0;
        do {
            System.out.print("Enter the number of gallons: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You inputted :" + trash + " which is not a number. Please input a number.");
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the price per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You inputted :" + trash + " which is not a number. Please input a number.");
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You inputted :" + trash + " which is not a number. Please input a number.");
            }
        } while (!done);
        costPer100Miles = (100 / mpg) * pricePerGallon;
        range = gallons * mpg;
        System.out.println("The cost per 100 miles is: " + costPer100Miles);
        System.out.println("The range of the vehicle is: " + range);
    }
}
