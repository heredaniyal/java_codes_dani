package OOP;

class English implements Greeting
{
    public void hello()
    {
        System.out.println(" HELLO! ");
    }
}

public class Lenovo
{
    public static void main(String[] args)
    {
         English e = new English();

         e.hello();
    }
}
