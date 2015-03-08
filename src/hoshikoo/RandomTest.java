package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
import java.util.Scanner;
import java.util.Random;

public class RandomTest {
    public static void main (String[] args){
        Random random = new Random();
        int i = 0;
        while (i< 20){
            System.out.println(random.nextInt(10) +1);
            i += 1;

        }
    }
}
