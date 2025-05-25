import java.util.Scanner; // input kay liye

// DONE

public class Prime
{
    public static void main(String[] args) // main
    {
        Scanner obj = new Scanner(System.in);
        int n; // declaration for validation purposes

        do // validation
        {
            System.out.print(" Enter a Number : ");
            n = obj.nextInt();
        } while (n < 0); // no -ive

        boolean check = false; // by default given value is false

        if (n < 2) // for 0 and 1
        {
            System.out.println(n + " is not a prime Number!" );
            return; // end
        }
        else if(n == 2)
        {
            System.out.println(n + " is a prime Number!" );
            return; // end
        }
        else
        {
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0) // meaning perfect divide
                {
                    break;
                } else {
                    check = true;
                }
            }
        }

        // Output
        if (check)
        {
            System.out.println(n + " is a prime Number!");
        }
        else {
            System.out.println(n + " is not a prime Number!" );
        }
    }
}