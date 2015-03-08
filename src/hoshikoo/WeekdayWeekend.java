package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
import java.util.Scanner;
public class WeekdayWeekend {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("What day of the week is it?");
        String WhatDay = input.next();
        String Weekday;

        if (WhatDay.equalsIgnoreCase("monday") || WhatDay.equalsIgnoreCase("wednesday") || WhatDay.equalsIgnoreCase("tuesday") || WhatDay.equalsIgnoreCase("thursday") || WhatDay.equalsIgnoreCase("friday")){
            Weekday = "weekday";
        }else if (WhatDay.equalsIgnoreCase("saturday")
                ||WhatDay.equalsIgnoreCase("sunday")){
            Weekday = "weekend";
        }else {
            System.out.println("your input is wrong");
            return;
        }

        System.out.println("It's a " + Weekday);



    }
}
