// FUNCTION OVERLOADING

import java.util.Scanner; // input kay liye

// DONE

public class Overloading
{
    int a = 0, b = 0; // these are data members

    // Member functions

    int sum() // object related
    {
        // the normal integer sum
        return a + b;
    }

    int sum(int x, int y) // object related
    {
        // the normal integer sum
        return x + y;
    }

    int sum(Overloading obj) // object related
    {
        // the normal integer sum
        return obj.a + obj.b;
    }

    public static void main(String[] args)
    {
        Overloading halima = new Overloading(); // object made of main class
        Scanner obj = new Scanner(System.in);

        // PROMPT
        System.out.print(" Enter the 1st Number : ");
        halima.a = obj.nextInt();
        System.out.print(" Enter the 2nd Number : ");
        halima.b = obj.nextInt();

        System.out.println(); // for spacing purposes

        // OUTPUT
        System.out.println(" Sum : " + (halima.sum(halima)));

    }
}
