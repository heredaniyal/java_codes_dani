import java.util.Scanner;

// DONE

public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // for input

        int [] a = {1,2,3,4,5}; // array of 5 elements

        // main purpose is to reverse the array

        int i = 1;

        while (i < 5)
        {
            for (int j = 0; j < 5 - i; j++) {
                if (j == 4) {
                    continue; // agai barh ja bey
                }
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
            i++;
        }

        // OUTPUT
        for (int k = 0; k < 5; k++)
        {
            System.out.println(a[k]);
        }

    }
}
