import java.util.Scanner; // input

// DONE

public class SumOf8
{
    // DONE
    
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        // PROMPT
        System.out.print(" Enter a number : ");
        int n = obj.nextInt();

        int sum = 0;

        for (int i = 1; i <= 10; i++)
        {
            sum = sum +  (n * i);
        }

        System.out.println(" Sum of " + n + " Table is : " + sum);

        // Closing Scanner class object
        obj.close();
    }
}
