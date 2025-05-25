import java.util.Scanner; // for n

// using while loop & for loop (2 & 11)
// DONE

public class Nsum {
    public static void main(String[] args)
    {
         Scanner obj = new Scanner(System.in);

         // PROMPT
        System.out.print(" Enter a number : ");
        int n = obj.nextInt();

        int sum = 0;
        int i = 2;

        // using while loop
        while (i <= n)
        {
            if (i % 2 == 0) // even numbers have no remainders
            {
                sum = sum + i;
            }
            i++; // manual gear shift
        }

        /*

        // using for loop
        for (int i = 2; i <= n; i++)
        {
            if (i % 2 == 0) // even numbers have no remainders
            {
                sum = sum + i;
            }
        } */

        System.out.println(" Sum : " + sum);

    }
}
