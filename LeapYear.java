import java.util.Scanner; // input

// DONE

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int year;

        // PROMPT
        do {
            System.out.print(" Enter Year : ");
            year = obj.nextInt();
        } while (year < 1000 || year > 9999); // 4 digit only

        // leap year is always in table of 4
        if (year % 4 == 0)
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is NOT a leap year");
        }

         // closing Scanner object
         obj.close();

    }
}
