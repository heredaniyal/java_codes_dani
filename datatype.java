
import java.util.Scanner; // #include <iostream>

public class datatype {
    public static void main(String[] args)
    {
        // entered integer is even or odd
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = obj.nextInt(); // entering int value through object

        boolean b = true; // for checking whether true or false

        b = a % 2 == 0; // right hand side of = is a condition and left hand
        // is assignment easy scene

        if (b)
        { System.out.print(a + " is even!");}
        else { System.out.print(a + " is odd!"); }

        obj.close(); // closing scanner object as this is end now
    }
}
