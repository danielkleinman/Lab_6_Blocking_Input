import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;
        String trash = "";
        do{
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess < randNum) {
                    System.out.println("Too low. Try again.");
                } else if (guess > randNum) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number!");
                    done = true;
                }
            } else {
                trash = in.nextLine();
                System.out.println("You inputted: " + trash + " which is not a number. Please input a number.");
            }
        }while(!done);
    }
}
