import java.util.Scanner; // for input

public class FactorialRecursion
{
    static int process(int n)
    {
        if (n == 0) { // base case
            return 1;
        } else {
            return n * process(n - 1); // recursion step
        }
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // for input

        System.out.print(" Enter a Number : ");
        int x = obj.nextInt();

        int result = process(x);

        System.out.println(" Factorial : " + result);

        obj.close(); // closing scanner object as this is end now
    }
}
