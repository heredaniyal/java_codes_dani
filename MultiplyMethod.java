import java.util.Scanner; // #include <iostream>

// DONE

public class MultiplyMethod
{
    void calculation(int n) // don't wanna return anything
    {
        System.out.println(" Table of " + n); // display purposes
        int i = 1;
        while(i<=10)
        {
            System.out.println(n + " x " + i + " = " + (n*i));
            i++; // manual gear shifting
        }
    }

    public static void main(String[] args)
    {
        MultiplyMethod ehtisham = new MultiplyMethod(); // object
        Scanner obj = new Scanner(System.in); // for input

        System.out.print(" Enter a Number : ");
        int a = obj.nextInt();

        ehtisham.calculation(a); // method for multiplication table bro
    }
}
