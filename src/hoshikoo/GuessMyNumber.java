package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        int maxNumber = 1000;
        int number = new Random().nextInt(maxNumber)+1;

        int guess = maxNumber + 1;

        while (guess != number ){
            System.out.print("guess? ");
            guess = scanner.nextInt();

            if (guess <1 || guess >maxNumber)
                System.out.println("please guess between 1 and " + maxNumber);

            else if (guess > number)
                System.out.println("too high");

            else if (guess < number)
                System.out.println("too low");
        }

        System.out.println("that's right!");
    }
}
