import java.util.Scanner; // for input

public class LocalGlobal
{
    // Data Members
    int a, b;

    // Member functions / methods
    void swap(LocalGlobal obj) // for every unique object
    {
        int temp;
        temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }

    void output() // unique output for every object
    {
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        LocalGlobal dani = new LocalGlobal(); // object made of main class

        System.out.print(" Enter 1st Number : ");
        dani.a = obj.nextInt();
        System.out.print(" Enter 2nd Number : ");
        dani.b = obj.nextInt();

        System.out.println(" BEFORE SWAPPING");
        dani.output();

        // SWAPPING
        dani.swap(dani);

        System.out.println(" AFTER SWAPPING");
        dani.output();

        // closing Scanner object
        obj.close();

    }
}
