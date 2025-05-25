package OOP;

import java.util.Scanner;

// DONE

class OOPRectangle
{
    Scanner obj = new Scanner(System.in);
   protected int length, width, area, perimeter; // attributes

    // methods (function inside a class)
    public void input() // for rectangle
    {
        System.out.print(" Enter Length : ");
        length = obj.nextInt();
        System.out.print(" Enter Width : ");
        width = obj.nextInt();
    }
    public int calculateArea()
    {
        area = length * width; // l x w
        return area;
    }

    public int calculatePerimeter()
    {
        perimeter = 2 * (length + width); // l x w
        return perimeter;
    }
}

// SINGLE INHERITANCE APPLIED
class OOPCuboid extends OOPRectangle
{
    Scanner obj = new Scanner(System.in);
    private int height; // this is only for cuboid no one else

    @Override
    public void input()
    {
        System.out.print(" Enter Length : ");
        length = obj.nextInt();
        System.out.print(" Enter Width : ");
        width = obj.nextInt();
        System.out.println(" Enter Height : ");
        height = obj.nextInt();
    }

    @Override
    public int calculateArea()
    {
        area = 2 * length * width + 2 * length * height + 2 * height * width;
        return area;
    }

    @Override
    public int calculatePerimeter()
    {
        perimeter = 4 * (length + width + height); // l x w
        return perimeter;
    }

}

public class RectangleCuboid // MAIN CLASS
{
    public static void main(String[] args)
    {
        // 2 objects made
        OOPRectangle sannan = new OOPRectangle();
        OOPCuboid faheem = new OOPCuboid();

        // inputting values
        sannan.input();
        faheem.input();

        // CALCULATION AND OUTPUT
        System.out.println(" AREA OF RECTANGLE : " + sannan.calculateArea());
        System.out.println(" PERIMETER OF RECTANGLE : " + sannan.calculatePerimeter());
        System.out.println(" AREA OF CUBOID : " + faheem.calculateArea());
        System.out.println(" PERIMETER OF CUBOID : " + faheem.calculatePerimeter());

    }
}
