import java.util.Scanner;

// DONE

public class CelciusToFahrenHeit
{
    static int calculation(int c)
    {
        // c = celcius
        int fahrenheit = 0; // declaring with default value 0

        fahrenheit = ((c*9)/5) + 32; // formula brother

        return fahrenheit; // result
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // INPUT

        // PROMPT
        System.out.print(" Enter Temperature in Celcius : ");
        int c = obj.nextInt();

        // output && calculation
        System.out.println(" Temperature in Fahrenheit : " + calculation(c));

        obj.close(); // closing scanner object as this is end now
    }
}
