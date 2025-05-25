package OOP;

// NOT DONE

import java.util.Scanner;

class Cylinder
{
    private double radius , height; // two data members

    public Cylinder() // default for at least tou chale
    {

    }

    public Cylinder(double r, double h) // parametrized constructor
    {
        radius = r;
        height = h;
    }

    public void set(double r, double h) // one setter needed only
    {
        radius = r;
        height = h;
    }

    // GETTERS
    public double getRadius() {return radius;}
    public double getHeight() {return height;}

    // calculate area
    public double getArea()
    {
        double area = 0; // giving default value aswell
        area = (2)*(3.141592653589793238)*(radius)*(height + radius);
        return area;
    }

    // calculate area
    public double getVolume()
    {
        double volume = 0; // giving default value aswell
        volume = 3.141592653589793238 * radius * radius * height; // pir^2h
        return volume;
    }

}

public class MainCylinder
{
    public static void main(String[] args)
    {

        Scanner obj = new Scanner(System.in); // for input

        double r, h; // entering and passing values

        // PROMPT
        System.out.print(" Enter Radius : ");
        r = obj.nextFloat();
        System.out.print(" Enter Height : ");
        h = obj.nextFloat();

        // dani.set(r,h); // passing through setter
        Cylinder dani = new Cylinder(r,h); // made object with constructor

        // OUTPUT
        System.out.println(" SURFACE AREA : " + dani.getArea());
        System.out.println(" VOLUME : " + dani.getVolume());


    }
}
