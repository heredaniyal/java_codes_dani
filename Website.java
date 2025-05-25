
import java.util.Scanner; // input stream for string

// DONE

public class Website {
    public static void main(String[] args)
    {
          Scanner obj = new Scanner(System.in); // created an object

        System.out.print(" Enter Website : ");
        String website = obj.nextLine(); // getline()

        if (website.endsWith(".com"))
        {
            System.out.println(website + " is a commercial website!");
        }
        else if (website.endsWith(".org"))
        {
            System.out.println(website + " is a organisation website!");
        }
        else if (website.endsWith(".in"))
        {
            System.out.println(website + " is a indian website!");
        }

    }
}
