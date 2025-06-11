package OOP;

/* Create two base classes Teacher and Researcher, both having a method work().
   Then, create a derived class Professor that inherits from both Teacher and Researcher.
   Override the work() method in the Professor class to combine the responsibilities of both roles.
   Write a program to demonstrate method overriding in this context. */

// interface is like structure
interface Teacher
{
    void work();
}

// interface is like structure
interface Researcher
{
    void work();
}

class Professor implements Teacher, Researcher
{
    @Override // Indication of overriding
    public void work()
    {
        System.out.println(" I'M A TEACHER AND A RESEARCHER AS WELL");
    }
}

public class TeacherResearcher {
    public static void main(String[] args)
    {
         Professor nadeem = new Professor();
         nadeem.work();
    }
}
