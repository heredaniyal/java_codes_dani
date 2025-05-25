package OOP;

// RUNNING

import java.util.Scanner;

class Rectangle
{
    private int l, w; // private for data hiding bro

    // default constructor
    public Rectangle()
    {
        l = 4;
        w = 5;
    }

    // constructor
    public Rectangle (int length, int width)
    {
        l = length;
        w = width;
    }

    // member functions
    public int area()
    {
        return (w * l);
    }

    public int perimeter()
    {
        return (2*(l+w));
    }
}

public class RectangleM
{
    // MAIN CLASS
    public static void main(String[] args)
    {
        int len, wid; // for input purposes
        Scanner obj = new Scanner(System.in); // for input

        // PROMPT
        System.out.print(" Enter length : ");
        len = obj.nextInt();
        System.out.print(" Enter width : ");
        wid = obj.nextInt();

        Rectangle sui = new Rectangle(len, wid); // object made bro

        // OUTPUT
        System.out.println(" AREA : " + sui.area());
        System.out.println(" PERIMETER : " + sui.perimeter());

    }

}
