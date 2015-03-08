package hoshikoo;

/**
 * Created by Hoshiko on 3/8/15.
 */
public class hundredToTen {
    public static void main(String[] args){
        int count = 100;
        while (count >= 1) {
            System.out.println(count);
            if (count >10)
            count -=5;
            else
                count-=1;
        }

    }
}
