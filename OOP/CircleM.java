package OOP;

// RUNNING

import java.util.Scanner;

class Circle
{
    private float radius; // private for data hiding bro

    // constructor
    Circle (float r)
    {
        radius = r;
    }

    // member functions
    public float area()
    {
        return (float)(3.142 * radius * radius); // pi * r * r
    }

    public float perimeter()
    {
        return (float)(2*3.142*radius); // 2xpixr
    }
}

public class CircleM
{
    // MAIN CLASS
    public static void main(String[] args)
    {
        float r; // for input purposes
        Scanner obj = new Scanner(System.in); // for input

        // PROMPT
        System.out.print(" Enter radius of Circle : ");
        r = obj.nextFloat();

        Circle sui = new Circle(r); // object made bro

        // OUTPUT
        System.out.println(" AREA : " + sui.area());
        System.out.println(" PERIMETER : " + sui.perimeter());

    }

}
