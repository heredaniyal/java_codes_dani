public class Pattern
{
    /*

    * * * * // this pattern needed
    * * *
    * *
    *

    // DONE

     */

    public static void main(String[] args)
    {
        /*
        for (int i = 0; i < 4; i++) // 0 to 3
        {
            for (int j = 4; j > i; j--) // 3 to 0
            {
                System.out.print("* ");
            }
            System.out.println(); // need spacing after every * print
        }
         */

        // now using while
        int i = 0;

        while (i < 4)
        {
            int j = 4; // j will always start with 4
            // then will update as we move on through i
            while (j > i)
            {
                System.out.print("* ");
                j--; // manual gear shifting
            }
            System.out.println(); // need spacing after every * print
            i++; // manual gear shift
        }
    }
}
