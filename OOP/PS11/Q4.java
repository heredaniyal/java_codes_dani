package OOP.PS11;

// iska object nahi ban sakta
abstract class TelePhone
{
     public abstract void ring();
     public abstract void lift();
     public abstract void disconnect();
}

// inherited from TelePhone
/*
 meri understanding kay mutabiq yeh interfaces ki tarah
 kaam kar raha hai, no defintion, only declaration
 as it's abstract methods
 */

class SmartTelephone extends TelePhone
{
    public void ring()
    {
        System.out.println(" SMART PHONE RINGING! ");
    }
    public void lift()
    {
        System.out.println(" SMART PHONE LIFTING! ");
    }
    public void disconnect()
    {
        System.out.println(" SMART PHONE DISCONNECTING! ");
    }
}

public class Q4 {
    public static void main(String[] args) {

    }
}
