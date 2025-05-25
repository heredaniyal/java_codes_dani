package OOP;

// NOT DONE

import java.util.Scanner;

class Sphere
{
    private double radius; // two data members

    public Sphere() // default for at least tou chale
    {
         radius = 0;
    }

    public Sphere(double r) // parametrized constructor
    {
        radius = r;
    }

    public void set(double r) // one setter needed only
    {
        radius = r;
    }

    // GETTERS
    public double getRadius() {return radius;}

    // calculate area
    public double getArea()
    {
        double area = 0; // giving default value aswell
        area = (4)*(3.141592653589793238)*(radius)*(radius);
        return area;
    }

    // calculate area
    public double getVolume()
    {
        double volume = 0; // giving default value aswell
        volume = ((3.141592653589793238 * radius * radius * radius * 4)/3); // pir^2h
        return volume;
    }

}

public class MainSphere
{
    public static void main(String[] args)
    {

        Scanner obj = new Scanner(System.in); // for input

        // Sphere dani = new Sphere(); // made object
        double r; // entering and passing values

        // PROMPT
        System.out.print(" Enter Radius : ");
        r = obj.nextFloat();

        //dani.set(r); // passing through setter
        Sphere dani = new Sphere(r); // made object with constructor

        // OUTPUT
        System.out.println(" SURFACE AREA : " + dani.getArea());
        System.out.println(" VOLUME : " + dani.getVolume());


    }
}
