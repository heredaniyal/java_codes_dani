package PF;

import java.util.Scanner; // #include <iostream>

// DONE

public class Sum {
    public static void main(String[] args)
    {
         Scanner obj = new Scanner(System.in);

         // PROMPT
        System.out.print(" Enter 1st number : ");
        int a = obj.nextInt();
        System.out.print(" Enter 2nd number : ");
        int b = obj.nextInt();

        // result & output as well
        System.out.println(" PF.Sum : " + (a+b));

    }
}
