package OOP;

/*
Define two base classes Animal and Bird with attributes like species and wingSpan.
 Create a derived class Penguin that inherits from both Animal and Bird.
 Write a C++ program to initialize a Penguin object and display its attributes.
 */

import java.util.Scanner;

// Animal is a concept which can be used as an interface as animal baray
// types kay hote hain

interface Animal // treat this as a structure
{
    // can declare attribute but it will become constant/final
    void inputSpecies(); // only a blueprint no definition
}

class Bird
{
    protected int wingSpan; // bird ki hi khali wingSpan hota hai
    // private and only accessible in inherited class
    Scanner obj = new Scanner(System.in); // for entering purposes
}

class Penguin extends Bird implements Animal // LAST FINAL CLASS AS PER QUESTION
{
    private String species; // as Animal mai declare karta tou final meaning constant hojata

    public void inputSpecies() // entering values
    {
        System.out.print(" Enter Species : ");
        species = obj.nextLine();
        System.out.print(" Enter Wing Span : ");
        wingSpan = obj.nextInt();
    }

    public void display() // ONLY DISPLAYING WHAT YOU HAVE ENTERED
    {
        System.out.println(" Species : " + species);
        System.out.println(" Wing Span : " + wingSpan);
    }

}

public class NewBird
{
    public static void main(String[] args)
    {
         Penguin ehtisham = new Penguin(); // object made

        ehtisham.inputSpecies(); // entering method
        System.out.println(); // for spacing
        ehtisham.display(); // displaying all data you have entered

    }
}
