import java.util.Scanner; // #include <iostream>

// DONE

public class D2Array
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int [][] array = new int[2][3]; // r x c

        // INPUT
        for (int i = 0; i < 2; i++) // Rows
        {
            for (int j = 0; j < 3; j++) // Columns
            {
                System.out.print(" Enter Number at (" + i + "," + j + ")" + " = ");
                array[i][j] = obj.nextInt();
            }
        }

        int lowest = array[0][0]; // highest

        for (int i = 0; i < 2; i++) // Rows
        {
            for (int j = 0; j < 3; j++) // Columns
            {
                if (array[i][j] < lowest)
                {
                    lowest = array[i][j];
                }
            }
        }

        System.out.println(" Lowest : " + lowest);

        obj.close(); // closing scanner object as this is end now

    }
}
