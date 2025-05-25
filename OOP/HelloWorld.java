package OOP;
import java.util.Scanner;

// ONLINE SHOPPING SYSTEM
// NEEDS FURTHER TESTING

abstract class User
{
    abstract void showMenu();
}

class Customer extends User
{
    public void showMenu()
    {
        System.out.println ("Available Items");
        System.out.println ("0.Doodh /n Rs 230" );
        System.out.println ("1.Dahi /n Rs 100");
        System.out.println ("2.Pherni /n Rs 150");
        System.out.println ("3.Kheer /n Rs 150");
        System.out.println ("4.Lassi /n Rs 100");
    }

}

interface Payment
{
    void pay(double amount);
}

class Card implements Payment
{
    public void pay(double amount)
    {
        System.out.println(amount + " Paid by using card");
    }
}

class Cash implements Payment
{
    public void pay(double amount)
    {
        System.out.println(amount + " Paid via Cash On Delivery");
    }
}

class Order
{
    private int TP = 0;

    public void addproduct(int choice, int quantity)
    {
        switch (choice) {
            case 0: // doodh
                TP += 230 * quantity;
                break;
            case 1: // dahi
                TP += 100 * quantity;
                break;
            case 2: // pherni
                TP += 150 * quantity;
                break;
            case 3: // kheer
                TP += 150 * quantity;
                break;
            case 4: // lassi
                TP += 100 * quantity;
                break;
            default: // if user tries incorrect
                System.out.println(" ERROR! ");
        }
    }

    public double getTotal()
    {
        return TP;
    }
}

class HelloWorld
{
    public static void main(String[] args)
    {
        User customer = new Customer(); // polymorphism
        Scanner sc = new Scanner(System.in);

        System.out.println(" WELCOME TO AL-NOOR MILK SHOP! "); // welcome note
        customer.showMenu(); // show menu

        // PROMPT
        int choice, quantity, c;
        Order o = new Order();
        do
        {
            System.out.println(" What do you want ");
            choice = sc.nextInt();
            System.out.println(" Enter Quantity ");
            quantity = sc.nextInt();

            // making order object
            o.addproduct(choice, quantity);

            System.out.println(" Press -1 to Exit or press any other number to continue");
            c = sc.nextInt();
        } while (c != -1);

        // Displaying total amount
        System.out.println(" TOTAL BILL : " + o.getTotal());

        // payment methods
        System.out.println(" Select Payment Method : "); // PROMPT
        System.out.println(" 1. Credit Card");
        System.out.println(" 2. Cash");

        int p;
        do
        {
            p = sc.nextInt();
        } while (p < 1 || p > 2);

        if (p == 1)
        {
            Card ca = new Card();
            ca.pay(o.getTotal());
        }
        else if (p == 2)
        {
            Cash ca = new Cash();
            ca.pay(o.getTotal());
        }

        sc.close();

    }

}