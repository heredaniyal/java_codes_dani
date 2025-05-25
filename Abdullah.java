import java.util.Scanner; // for input

// COMPLETED & TESTED

/* Scenario: A container is being filled with water at a changing rate.
Q1. Water Level in a Container (Volume over Time)  */

class Container
{
  private double current_volume, max_volume; // 2 data members

    public Container (double m) // JAVA DOESN'T HAVE DEFAULT PARATERMIZED CONSTRUCTOR
    {
        max_volume = m;
    }

    public void add_water(double rate, double time) // to simulate water being added over time.
    {
        double choice; // CONSTANT OR VARYING RATE KAY LIYE
        Scanner obj = new Scanner(System.in); // for entering choice

        // PROMPT
        // CHOICE FOR USER WHETHER HE WANTS CONSTANT OR VARYING RATE
        do { // taakay user 1 or 2 kay ilawa kuch enter na kar sake
            System.out.println(" WHAT DO YOU WANT? ");
            System.out.println(" 1. CONSTANT RATE");
            System.out.println(" 2. VARYING RATE");
            choice = obj.nextInt();
        } while (choice < 1 || choice > 2); // -1, 0, 3,4 ye wale numbers par loop hojaye dobara

        System.out.println(); // SPACING

        if (choice == 1) // CONSTANT RATE IT IS
        {
            for (int t = 1; t <= time; t++) // time changes all the time eg. 1 to 10
            {
                current_volume = current_volume + (rate * t); // calculation
                if (current_volume > max_volume) // meaning overflow hojaye agar
                {
                    break; // break from the FOR LOOP as no more water can be added
                }
                System.out.println(current_volume); // display of calculation after validation
                // more efficient way
            }
        }
        else // VARYING RATE IT IS THEN
        {
            for (double t = 1; t <= time; t++) // time changes all the time eg. 1 to 10
            {
                rate = (2*t) + 1; // rate = 2t + 1
                current_volume = current_volume + (rate * t); // calculation
                if (current_volume > max_volume) // meaning overflow hojaye agar
                {
                    break; // breakf rom the FOR LOOP as no more water can be added
                }
                System.out.println(current_volume); // display of calculation after validation
                // more efficient way
            }
        }

        // CONTAINER will GET FULL whatever the type of rate is (varying, constant)
        System.out.println("FULL");
    } // end of add water function

    // RETURN TYPE STRING HAI
    public String get_rate_of_change(double v1, double v2, double t1, double t2)
    {
        String answer = " "; // assigning space for removing garbage value

        // aik jo validation idhar lage gi is of dono times same nahi hone chahiye
        if (t1 >= t2) // is the starting time >= ending time?
        {
            // yes, meaning ye rate of change kay liye suitable nai
            // because of -ve and math error (10 - 10 -> 0)
            answer = " Ending time should be greater than Starting Time" ;
        }
        else {
            double rate = (v2 - v1) / (t2-t1);
            answer = Double.toString(rate); // built in function for converting
            // double to STRING
        }
            return answer;
    }
}

public class Abdullah {
    public static void main(String[] args) {
          Container Areeb = new Container(20); // max = 20 L
         Areeb.add_water(2,10); // you can also pass values here
        System.out.println(Areeb.get_rate_of_change(2,8,1,2));

    }
}
