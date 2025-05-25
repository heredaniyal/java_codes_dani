// DONE

public class ArrayInReverse
{
    public static void main(String[] args)
    {
         int [] dani = {1,2,3,4,5}; // array of 5 integers

        // length has no curly brackets

        // reverse order
        System.out.println(" REVERSE");
        for (int i = dani.length - 1; i >= 0; i--) // 4 to 0 remember
        {
            System.out.println(dani[i]);
        }

        // Using for each loop
        System.out.println(" Using For-Each : ");
        for (int i : dani)
        { // dani is an array and i can be said as a single element of array
            System.out.println(i);
        }

    }
}
