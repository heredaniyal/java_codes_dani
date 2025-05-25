import java.util.Scanner; // #include <iostream>

// DONE

public class LowCase {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.print(" Enter String : ");
        String val = obj.nextLine(); // getline() function in c++ like

        String version = val.toLowerCase(); // sending lower case to another string class

        System.out.println(" LOWER CASE VERSION : " + version);

        // closing Scanner object
        obj.close();

    }
}
