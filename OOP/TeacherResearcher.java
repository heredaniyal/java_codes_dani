package OOP;

/*
Create two base classes Teacher and Researcher, both having a method work().
Then, create a derived class Professor that inherits from both Teacher and Researcher.
Override the work() method in the Professor class to combine the responsibilities
of both roles. Write a program to demonstrate method overriding in this context.
 */

// interface is like a structure
interface Teacher
{
    // attributes declared here are final/constant
    void work(); // interfaces mai no definition, and no specifier required
    // although default method do exist
}

// combined Teacher with Researcher as two classes
class Researcher implements Teacher
{
  public void work()
  {
      System.out.println(" I'M A RESEARCHER! ");
  }
}

class Professor extends Researcher
{
    @Override // just indicating
    public void work()
    {
        System.out.println(" I'M A TEACHER & RESEARCHER! ");
    }
}

public class TeacherResearcher // MAIN CLASS
{
    public static void main(String[] args) // MAIN FUNCTION ENGINE
    {
        Professor nadeem = new Professor(); // made object

        nadeem.work();

    }
}
