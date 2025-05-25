import java.util.Scanner;

// DONE

public class Minimum
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // for input

        int [] a = new int[5]; // array of 5 elements

        for (int i = 0; i < 5; i++) // input
        {
            System.out.print(" Enter the " + (i+1) + " Number : ");
            a[i] = obj.nextInt();
        }

        int i = 1; // manual gear shifting
        int smallest = a[0]; // array ki first value ko rakh
        // dena behtar as 0 ya large value isn't suitable for memory

        while (i < 5)
        {
            if (a[i] < smallest)
            {
                smallest = a[i];
            }
            i++;
        }

        // OUTPUT
        System.out.println(" Smallest : " +  smallest);

    }
}
