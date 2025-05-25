import java.util.Scanner;

// DONE

public class ArrayFloat {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);

          float [] array = new float[5]; // 5 elements in array

        // INPUT
        // int i = 0;
        // float sum = 0.0f;

        /*while (i < 5)
        {
            System.out.print(" Enter the " + (i+1) + " Number : ");
            array[i] = obj.nextFloat(); // remmeber im entering float values
            sum = sum + array[i]; // banda saath saath hi add karle
            // user ko konsa pata lag jana
            i++; // manual gear shifting
        }*/

        float sum = 0.0f;

        for (int i = 0; i < 5; i++) // 0 to 4
        {
            System.out.print(" Enter the " + (i+1) + " Number : ");
            array[i] = obj.nextFloat(); // remmeber im entering float values
            sum += array[i];
        }

        System.out.println(" Sum : " + sum);

        obj.close(); // closing scanner object as this is end now

    }
}
