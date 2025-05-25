package OOP;

// RUNNING

import java.util.Scanner;

class Square
{
    private int side; // private for data hiding bro

    // constructor
    Square(int s)
    {
        side = s;
    }

    // member functions
    public int area()
    {
        return (side * side);
    }

    public int perimeter()
    {
        return (side * 4);
    }
}

public class SquareM
{
    // MAIN CLASS
    public static void main(String[] args)
    {
        int side; // for input purposes
        Scanner obj = new Scanner(System.in); // for input

        // PROMPT
        System.out.print(" Enter side : ");
        side = obj.nextInt();

        Square sui = new Square(side); // object made bro

        // OUTPUT
        System.out.println(" AREA : " + sui.area());
        System.out.println(" PERIMETER : " + sui.perimeter());

    }

}
