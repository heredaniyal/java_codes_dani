// DONE

import java.util.Scanner; // input

public class FibonacciRecursion
{
    static void process(int a, int b, int next, int n, int i)
    {
        // n is number and a is starting value which is one
        // 0 1 1 2 3 5 (need to output this)

        if (i < n) // 0 to n - 1
        { // as i is starting from 0
            System.out.print(a + " "); // outputting
            next = a + b;
            a = b; // a now becomes end
            b = next; // next gives new ending value
            i++; // i = i + 1
            process(a, b, next, n, i); // recursive procedure
        }

    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // for amount of numbers to show

        // PROMPT
        System.out.print(" Enter how many terms to show : ");
        int n = obj.nextInt();

        // process without using return
        process(0, 1, 0, n ,0); // (start, end, next, number, i)

        obj.close(); // closing scanner object as this is end now

    }
}
