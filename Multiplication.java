import java.util.Scanner; // input

// DONE with improvison

public class Multiplication
{
    // DONE
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        // PROMPT
        System.out.print(" Enter a number : ");
        int n = obj.nextInt();

        System.out.print(" Where do you want the limit till : ");
        int size = obj.nextInt();

        for (int i = 1; i <= size; i++)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
}
