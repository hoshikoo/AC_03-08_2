package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class DaylightSavingTime {

    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the name of the month");
        String month = input.next();

        int monthNum;

       if (month.equalsIgnoreCase("january")) {
           monthNum = 1;
       }else if (month.equalsIgnoreCase("february")) {
           monthNum = 2;
       }else if (month.equalsIgnoreCase("march")) {
           monthNum = 3;
       }else if (month.equalsIgnoreCase("april")) {
           monthNum = 4;
       }else if (month.equalsIgnoreCase("may")) {
           monthNum = 5;
       }
       else if (month.equalsIgnoreCase("june")) {
           monthNum = 6;
       }
       else if (month.equalsIgnoreCase("july")) {
           monthNum = 7;
       }
       else if (month.equalsIgnoreCase("august")) {
           monthNum = 8;
       }
       else if (month.equalsIgnoreCase("september")) {
           monthNum = 9;
       }else if (month.equalsIgnoreCase("october")) {
           monthNum = 10;
       }
       else if (month.equalsIgnoreCase("november")) {
           monthNum = 11;
       }else if (month.equalsIgnoreCase("december")) {
           monthNum = 12;
       }else{
           System.out.println("Your input was not recognized");
           return;
       }

        System.out.println("Enter the day");
        int day = input.nextInt();

        DecimalFormat twodigitsMonth = new DecimalFormat("00");
        /*System.out.println(twodigitsMonth.format(monthNum)); */
        DecimalFormat twodigitsDay = new DecimalFormat("00");
        /*System.out.println(twodigitsDay.format(day));  */
        /* System.out.println((twodigitsMonth.format(monthNum))+(twodigitsDay.format(day))); */
        String MonthDay = (twodigitsMonth.format(monthNum))+(twodigitsDay.format(day));
        int MMDD = Integer.parseInt(MonthDay);
        /* System.out.println(MMDD+MMDD);  */

        if (MMDD > 0307 && MMDD < 1101) {
            System.out.println("Daylight Savings Time is in effect");
        }else {
            System.out.println("Daylight Savings Time is not in effect");
        }


    }
}
