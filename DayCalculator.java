
import java.util.Scanner; // input

// DONE

public class DayCalculator {
    public static void main(String[] args)
    {
         Scanner obj = new Scanner(System.in);
         int day;

         // PROMPT
        do {
            System.out.print(" Enter Day : ");
            day = obj.nextInt();
        } while (day < 1 || day > 7);

        // CONDITIONS
        if (day == 1)
        {
            System.out.println(" MONDAY ");
        }
        if (day == 2)
        {
            System.out.println(" TUESDAY ");
        }
        if (day == 3)
        {
            System.out.println(" WEDNESDAY ");
        }
        if (day == 4)
        {
            System.out.println(" THURSDAY ");
        }
        if (day == 5)
        {
            System.out.println(" FRIDAY ");
        }
        if (day == 6)
        {
            System.out.println(" SATURDAY ");
        }
        if (day == 7)
        {
            System.out.println(" SUNDAY ");
        }

        obj.close(); // closing scanner object as this is end now

    }
}
