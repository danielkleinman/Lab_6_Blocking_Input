import java.util.Scanner;
class CtoFConverter {
    public static void main() {
        Scanner in = new Scanner(System.in);
        double C = 0;
        double F = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("Enter number in Celcius: ");

            if(in.hasNextDouble()) {
                C = in.nextDouble();
                in.nextLine();
                done = true;
            }
        else
            {
                trash = in.nextLine();
                System.out.println("You inputted: " + trash + " which is not a number. Please input a number.");
            }
        }while(!done);
        F = (C * 9 / 5) + 32;
        System.out.println("This number in fahrenheit is: " + F);

    }
}
