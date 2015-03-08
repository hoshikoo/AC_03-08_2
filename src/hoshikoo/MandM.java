package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
import java.util.Scanner;

public class MandM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NumLeft = 100;

        while (NumLeft > 0) {

            System.out.println(NumLeft + " M&M left");

            System.out.println("eat how many?");
            int NumEaten = input.nextInt();

            if (NumEaten < 0) {
                System.out.println("you can't eat a negative M&M");
                NumEaten = input.nextInt();
            } else if (NumEaten > NumLeft) {
                System.out.println("You don't have that many");
                NumEaten = input.nextInt();
            }
            NumLeft = NumLeft - NumEaten;
        }
        System.out.println("you ate all the M&Ms");
    }
}
