package nyc.c4q.hoshikoo;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);

        System.out.print ("What's your score?");
        int score = scanner.nextInt();

        String result;
        if (score == 100)
            result = "Perfect score!";
        else if (score >= 90)
            result = "Great!";
        else if (score >= 75)
            result = "Not bad!";
        else if (score >= 60)
            result = "You passed.";
        else
            result = "You failed. :(";
        System.out.println(result);
    }
}
