package OOP;

class CellPhone
{
    // 2 METHODS
    public void ring()
    {
        System.out.println(" RINGING! ");
    }

    public void vibrate()
    {
        System.out.println(" VIBRATING! ");
    }
}

public class CellPhoneMain
{
    public static void main(String[] args)
    {
      CellPhone c = new CellPhone(); // object made of external class

        c.ring();
        c.vibrate();
    }

}
