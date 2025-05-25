package OOP;
import java.util.Scanner; // for input

// RUNNING

class Employee
{
    Scanner obj = new Scanner(System.in); // for input
    private int salary; // for abstraction
    private String name;

    public void setName()
    {
        System.out.print(" Enter Your Name : ");
        name = obj.nextLine();
    }

    public void setSalary()
    {
        System.out.print(" Enter Your Salary : ");
        salary = obj.nextInt();
    }

    public int getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }
}

public class EmployeeM
{
    // MAIN FUNCTION
    public static void main(String[] args)
    {
        Employee mohsin = new Employee(); // object made of main class

        // Entering
        mohsin.setName();
        mohsin.setSalary();

        // OUTPUT
        System.out.println(); // SPACING

        System.out.println(" NAME : " + (mohsin.getName()));
        System.out.println(" SALARY : " + (mohsin.getSalary()));

    }


}
