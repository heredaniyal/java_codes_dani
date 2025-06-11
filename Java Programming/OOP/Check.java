package OOP;

// ONLY FOR TESTING PURPOSES

class SETH
{
    public SETH()
    {
        System.out.print("SETH ");
    }
}

class FREAKING extends SETH
{
    public FREAKING()
    {
        System.out.print("FREAKING ");
    }
}

class ROLLINS extends FREAKING
{
    public ROLLINS()
    {
        System.out.print("ROLLINS");
    }
}

public class Check {
    public static void main(String[] args)
    {
        ROLLINS sui = new ROLLINS();
    }

}
