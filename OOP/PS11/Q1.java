package OOP.PS11;

// only a blueprint no object will be made of it
abstract class Pen
{
    public void write()
    {
        System.out.println(" Writing with PEN! ");
    }
    public void refill()
    {
        System.out.println(" Refilling PEN! ");
    }
}

class FountainPen extends Pen
{
    public void changeNib()
    {
        System.out.println(" Changing Nib of Pen! ");
    }
}

public class Q1
{
    public static void main(String[] args)
    {
        FountainPen f = new FountainPen(); // made object

        // calling methods for testing
        f.write();
        f.refill();
        f.changeNib();

    }
}
