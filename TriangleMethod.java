// DONE

public class TriangleMethod
{
   static void display()
   {
       for (int i = 0; i < 4; i++)
       {
           for (int j = 0; j <= i; j++)
           {
               System.out.print("* ");
           }
           System.out.println(); // SPACING BETWEEN LINES
       }
   }

    public static void main(String[] args)
    {
     display(); // calling display method for triangle right angle
    }
}
