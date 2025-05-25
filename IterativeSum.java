
import java.util.Scanner; // for input objects

// DONE

public class IterativeSum
{
    static int calculation(int a)
    {
         int sum = 0; // this will be returned

        for (int i = 1; i <= a; i++)
        {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int n; // limit of natrual numbers to be entered

        do // PROMPT WITH VALIDATION
        {
            System.out.print(" Enter Number for Sum Limit : ");
            n = obj.nextInt();
        } while (n < 1);

        // OUTPUT With returning value
        System.out.println(" Sum from 1 to " + n + " = " + calculation(n));

        // closing Scanner object
        obj.close();

    }
}
