package OOP;

/*

Create a Java program where:

1. You have two interfaces, `Vehicle` and `Engine`.
2. The `Vehicle` interface should have a method `drive()`.
3. The `Engine` interface should have a method `startEngine()`.
4. Create a class `Car` that implements both the `Vehicle` and `Engine` interfaces.
5. In the `Car` class, implement both `drive()` and `startEngine()` methods.
6. Write a main class to create an object of `Car` and call both `drive()` and `startEngine()` methods.

 */

interface Vehicle
{
   void drive(); // as per question
}

interface Engine
{
    void startEngine(); // as per question
}

class Car implements Vehicle, Engine
{
    public void drive()
    {
        System.out.println(" Currently Driving! ");
    }

    public void startEngine()
    {
        System.out.println(" STARTING THE ENGINE! ");
    }
}

public class Brian // in memory of Paul Walker!
{
    /*public static void main(String[] args)
    {
         Car gtr = new Car(); // made object

        gtr.startEngine();
        gtr.drive();
    }*/

    void main() // like c++ but not exactly
    {
        Car gtr = new Car(); // made object

        gtr.startEngine();
        gtr.drive();
    }
}

