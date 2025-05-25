import java.util.Scanner;

// DONE 5 & 6

public class Factorial
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in); // it has all the functions

        // PROMPT
        System.out.print(" Enter a number : ");
        int n = obj.nextInt(); // this is assignment operator =

        int factorial = 1; // default value given to remove garbage value

        /*
        for (int i = 1; i <= n; i++) // as per condition
        {
             factorial = factorial * i;
        } */

        int i = 1;

        while(i <= n)
        {
            factorial = factorial * i;
            i++; // manual gear
        }

        // OUTPUT
        System.out.println(" Factorial : " + factorial);

        obj.close(); // closing scanner object as this is end now

    }
}
