import java.util.Scanner; // #include <iostream>

// DONE

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        // array declaration
        int [][] a = new int [2][3];
        int [][] b = new int [2][3];
        int [][] result = new int[2][3]; // resultant matrix

        // storing data in first matrix
        System.out.println("1ST"); // indicator
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3;j++)
            {
                System.out.print(" Enter Number at (" + i + "," + j + ") = ");
                a[i][j] = obj.nextInt();
            }
        }

        // storing data in second matrix
        System.out.println("2nd"); // indicator
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3;j++)
            {
                System.out.print(" Enter Number at (" + i + "," + j + ") = ");
                b[i][j] = obj.nextInt();
            }
        }

        // multiplication
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3;j++)
            {
                 result[i][j] = a[i][j] + b[i][j]; // sorry it was add not
                // multiply
            }
        }

        // OUTPUT
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // for spacing
        }


    }
}
