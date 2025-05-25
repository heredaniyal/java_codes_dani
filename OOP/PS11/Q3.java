package OOP.PS11;

// more like a structure
interface BasicAnimal
{
    // interfaces don't have method definition
    // methods = functions = function inside a class
  void eat();
  void sleep();
}

class Monkey
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

class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println(" EATING ");
    }
    public void sleep()
    {
        System.out.println(" SLEEPING ");
    }
}

public class Q3
{
    public static void main(String[] args)
    {
         Human saba = new Human(); // object made

         // calling all methods for testing
         saba.eat();
         saba.sleep();
         saba.bite();
         saba.jump();

    }
}
