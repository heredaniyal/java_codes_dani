import java.util.Scanner;

// DONE

public class Sorted
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int [] a = new int[5];

        System.out.println(" CHECKING FOR ASCENDING ORDER \n");

         for (int i = 0; i < a.length; i++) // STORING
         {
             System.out.print(" Enter the " + (i+1) + " Number : ");
             a[i] = obj.nextInt();
         }

         int j = 0; // manual gear shifting
         boolean check = false;

        while (j < 4) // due to j+1
        {
            if (a[j] > a[j+1]) // checking for ascending order
            {
                check = false;
               break;
            }
            else
            {
                check = true;
            }
            j++;
        }

        System.out.println(); // SPACING

        if (!check) // check is false
        {
            System.out.println(" NOT SORTED! ");
        }
        else
        {
            System.out.println(" SORTED! ");
        }


    }
}
