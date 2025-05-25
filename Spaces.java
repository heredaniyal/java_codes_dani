import java.util.Scanner; // #include <iostream>

// DONE

public class Spaces {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // created an object

        System.out.print(" Enter String : ");
        String val = obj.nextLine();

        String version = val.replace(" ", "_");

        System.out.println(" Replacement : " + version);

    }
}
