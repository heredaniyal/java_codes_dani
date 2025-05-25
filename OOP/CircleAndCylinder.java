package OOP;

// done

import java.util.Scanner;

// circle class
class CircleS
{
    // attributes
    protected double radius, area, perimeter;

    // methods
    public void input()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Radius of Circle : ");
        radius = obj.nextDouble();
        obj.close();
    }

    public double calculateArea()
    {
        area = 3.142 * radius * radius;
        return area;
    }

    public double calculatePerimeter()
    {
        perimeter = 3.142 * 2 * radius;
        return perimeter;
    }
}

class CylinderS extends CircleS
{
    // attributes
    private double h;

    // methods
    @Override
    public void input()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print(" Enter Radius of Cylinder : ");
        radius = obj.nextDouble();
        System.out.print(" Enter Height of Cylinder : ");
        h = obj.nextDouble();
        obj.close();
    }

    @Override
    public double calculateArea()
    {
        area = 3.142 * 2 * radius*(h+radius);
          return area;
    }

    @Override
    public double calculatePerimeter()
    {
        perimeter = 4*radius + 2*h;
        return perimeter;
    }
}

public class CircleAndCylinder
{
    public static void main(String[] args)
    {
        // 2 objects made
        CircleS c = new CircleS();
        CylinderS s = new CylinderS();

        // PROMPT
        c.input();
        s.input();

        // CALCULATION AND OUTPUT
        System.out.println(" AREA OF CIRCLE : " + c.calculateArea());
        System.out.println(" PERIMETER OF CIRCLE : " + c.calculatePerimeter());
        System.out.println(" AREA OF CYLINDER : " + s.calculateArea());
        System.out.println(" PERIMETER OF CYLINDER : " + s.calculatePerimeter());
    }
}
