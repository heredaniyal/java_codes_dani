
// DONE

public class Max
{
    public static void main(String[] args)
    {
        // Scanner obj = new Scanner(System.in); // for input

        int [] a = {1,2,3,4,5}; // array of 5 elements

        // main purpose is to reverse the array

        int i = 0, largest = 0;

        while (i < 5)
        {
             if (a[i] > largest)
             {
                 largest = a[i];
             }
             i++;
        }

        // OUTPUT
        System.out.println(" Largest : " +  largest);

        // obj.close();

    }
}
