import java.util.Scanner; // #include <iostream>

// DONE

public class RecursiveSum
{
    static int calculation(int i , int n, int sum) // don't wanna return anything
    {
        if (i < n)
        {
            i++;
            sum = i + calculation(i,n,sum);
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // for input

        int a; // for validation purposes

        do { // validation
            System.out.print(" Enter a Number : ");
            a = obj.nextInt();
        } while(a<1);

        System.out.println(" Sum : " + calculation(0,a,0)); // method for multiplication table bro
    }
}
