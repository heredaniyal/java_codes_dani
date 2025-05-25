import java.util.Scanner; // input output

// DONE

public class Searching
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // input
        int [] array = new int[5]; // made array of 5 integers


        // INPUT
        int i = 0;

        while(i < 5)
        {
            System.out.print(" Enter the " + (i+1) + " Number : ");
            array[i] = obj.nextInt();
            i++;
        }

        System.out.println(); // SPACING

        // searching
        System.out.print(" Enter the number you want to search : ");
        int search = obj.nextInt();

        int j = 0; // manual gear
        boolean found = false; // number isn't found yet

        while (j < 5)
        {
            if (array[j] == search) {
                found = true;
                break;
            }
            j++;
        }

        // added efficient code
        if (found)
        {
            System.out.println(search + " is found at i = " + (j+1));
        }
        else
        {
            System.out.println(" SORRY! number not found");
        }

    }
}
