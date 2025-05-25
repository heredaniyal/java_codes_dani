import java.util.Scanner; // #include <iostream>

// DONE

public class ReverseString {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // object needed for input in java
        String x; // input string
        String y =" "; // this is needed for assigning a value to y

        // INPUT
        System.out.print(" Enter a string : "); // basic output syntax
        x = obj.nextLine();

        // -1 removes unnecessary space which a newbie can't see clearly but
        // experienced programmers can see that

        for (int i = x.length() - 1; i > -1; i--) // same as c++
        {
            y += x.charAt(i); // new function sought of charAt(i) for checking
            // individual character
        }

        System.out.print(" Reversed String : " + y); // OUTPUT
    }
}
