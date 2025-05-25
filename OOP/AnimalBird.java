package OOP;

// DONE

/*
Define two base classes Animal and Bird with attributes like species and wingSpan.
 Create a derived class Penguin that inherits from both Animal and Bird.
 Write a C++ program to initialize a Penguin object and display its attributes.
 */

import java.util.Scanner; // #include <iostream>

interface Animal
{
    void Input(); // can be overridden for entering species name
}

// structure (Animal) & class Bird are combined
class Bird implements Animal
{
    Scanner obj = new Scanner(System.in); // for entering data

    // private attributes only can be accessed in own or inherited class
    protected String species; // name
    protected int wingSpan; // speed of wings

    @Override
    public void Input() // for entering in data
    {
        System.out.print(" Enter Species : ");
        species = obj.nextLine();
        System.out.print(" Enter WingSpan : ");
        wingSpan = obj.nextInt();
    }
}

class Penguin extends Bird
{
    public void Output()
    {
        System.out.println(" Species : " + species);
        System.out.println(" Wing Span : " + wingSpan);
    }
}

public class AnimalBird
{
    public static void main(String[] args)
    {
         Penguin sui = new Penguin(); // made object of Penguin

        sui.Input(); // INPUT METHOD
        System.out.println(); // SPACING
        sui.Output(); // OUTPUT METHOD
    }
}
