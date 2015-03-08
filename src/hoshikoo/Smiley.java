package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */

import java.util.Scanner;

public class Smiley {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("How are you? ");
        String smiley= input.next();

        String emotion;
        if (smiley.equals(":)"))
            emotion = "happy";
        else if (smiley.equals(":("))
            emotion = "sad";
        else if (smiley.equals(":|"))
            emotion = "plain";
        else{
            System.out.println("I don't know that one.");
            emotion = "???"; //This needs to be set for the last else, or IntelliJ will complain about the uninitialized variable.
        }
        System.out.println("You're "+ emotion + ".");
    }
}
