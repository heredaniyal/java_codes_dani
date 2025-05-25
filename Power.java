import java.util.Scanner; // #include <iostream>

/* Write a Java program that uses a while loop to compute the power of a number.
Given a base x and an exponent n, calculate x^n. */

// DONE

public class Power {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // input
        int result = 1; // multiplication kay mamlay mai 1 rakhna zaroori

        System.out.print(" Enter base : ");
        int base = obj.nextInt();
        System.out.print(" Enter Power : ");
        int power = obj.nextInt();

        int i = 0;

        while (i < power)
        {
            result = result * base;
            i++;
        }

        System.out.println(" Result : " + result);
    }
}
