package OOP.PS11;

interface TVRemote
{
  void changeChannel(); // changing the Channel
}

interface SmartTVRemote extends TVRemote
{
  void Internet(); // accessing internet like Youtube
}

class Tv implements SmartTVRemote
{
    public void changeChannel()
    {
        System.out.println(" Changing The Channel! ");
    }
    public void Internet()
    {
        System.out.println(" Accessing The Internet! ");
    }
}

public class Q6
{
    public static void main(String[] args) {
       Tv S = new Tv(); // made object of Tv

        // calling methods for testing
        S.changeChannel();
        S.Internet();
    }
}
