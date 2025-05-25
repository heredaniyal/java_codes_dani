import java.util.Scanner;

// DONE

public class Physics
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int [] arr = new int[5]; // 5 marks of physics

        for (int i = 0; i < 5; i++) // storing values
        {
            System.out.print(" Enter the " + (i+1) + " Number : ");
            arr[i] = obj.nextInt();
        }

        float sum = 0;

        for (int i : arr) // for each loop as per requirement
        {
            sum += i;
        }

        System.out.println(" Average : " + (sum/5));

         // closing Scanner object
         obj.close();

    }
}
