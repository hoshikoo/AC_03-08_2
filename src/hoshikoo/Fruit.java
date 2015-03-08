package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
import java.util.Scanner;

public class Fruit {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a fruit");
        String fruit =input.next();
        String color;
        String flavor;
        if (fruit.equals("banana")){
            color = "yellow";
            flavor = "sweet";
        }
        else if (fruit.equals("grapefruit")){
            color = "pink";
            flavor = "bitter";
        }
        else if (fruit.equals("lemon")){
            color = "yellow";
            flavor = "sour";
        }
        else{
            System.out.println("I don't know that fruit.");
            return; //Exits the function.
        }
        System.out.println("a " + fruit + " is "+ color + " and tastes "+flavor);

    }

}
