
import java.util.Scanner; // #include <iostream>

// DONE

public class MileToKm {
    public static void main(String[] args)
    {
         Scanner obj = new Scanner(System.in);
        System.out.print(" Enter in km : "); // cout
        float km = obj.nextFloat();

        float miles = km / 1.60934f; /* f is required to be written for float
        as default is double always */

        System.out.println(km + " km in miles : " + miles);
    }
}
