package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
import java.util.Scanner;
public class Profession {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Do you carry a sword? ");
    String response = scanner.next();
    boolean sword = response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y");

    System.out.print("Do you wear a helmet? ");
    response = scanner.next();
    boolean helmet = response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y");
    System.out.print

    System.out.print("Do you use a shovel? ");
    response = scanner.next();
    boolean shovel= response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y");

    String profession;
    if (sword && helmet && !shovel)
    profession = "samurai";
    else if (sword && !helmet && !shovel)
    profession = "ninja";
    else if (!sword && helmet && shovel)
    profession = "construction worker";
    else if (!sword && !helmet && shovel)
    profession = "gardener";
    else if (!sword && helmet && !shovel)
    profession = "astronaut";
    else if (!sword && !helmet && !shovel)
    profession = "coder";
    else
    profession = "something else";

}   System.out.println ("your profession is "+profession);
