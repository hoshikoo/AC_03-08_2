package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
import java.util.Scanner;
public class WhichDay {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the name of the month");
        String month = input.next();
        System.out.println("Enter the day");
        int day = input.nextInt();

        if (month.equals("January") && day == 1){
            System.out.println("It's New Years Day");
        }else if (month.equals("May") && day == 5){
            System.out.println("It's Cinco de Mayo");
        }else if (month.equals("July") && day == 4){
            System.out.println("It's Fourth of July");
        }else if (month.equals("December") && day == 25){
            System.out.println("It's Christmas");
        }else{
            System.out.println("It's a normal day");
        }
    }
}
