package OOP.PS11;

// more like a structure
interface BasicAnimal5
{
    // interfaces don't have method definition
    // methods = functions = function inside a class
    void eat();
    void sleep();
}

class Monkey5
{
    public void jump()
    {
        System.out.println(" Jumping! ");
    }
    public void bite()
    {
        System.out.println(" Biting! ");
    }
}

class Human5 extends Monkey5 implements BasicAnimal5
{
    public void eat()
    {
        System.out.println(" EATING  ");
    }
    public void sleep()
    {
        System.out.println(" SLEEPING ");
    }
    @Override
    public void jump()
    {
        System.out.println(" HUMAN JUMPING");
    }
    @Override
    public void bite()
    {
        System.out.println(" HUMAN Biting");
    }
}

public class Q5
{
    public static void main(String[] args)
    {
        Human5 saba = new Human5(); // object made

        /*
        // calling all methods for testing
        saba.eat();
        saba.sleep();
        saba.bite();
        saba.jump();
         */

        // applying polymorphism (dynamic memory dispatch)

        Monkey5 daniyal = new Human5(); // reference of Monkey but elements of Human

        // daniyal.eat(); // it doesn't have access to all human function
        // bass jo function in dono mai relate karte hain vou use kar sakta hai
        // daniyal naami object

        // as it's related in both Monkey & Human Classes
        daniyal.bite();
        daniyal.jump();

    }
}
