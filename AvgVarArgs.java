// DONE

public class AvgVarArgs
{
    static int process(int ...arr)
    {
        int average = 0, sum = 0, count = 0;

        for (int i : arr) // for each loop
        {
            count++; // counting how many variables are there
            sum += i;
        }

        System.out.println("\n" + count + " Numbers Received!"); // to tell the user

        average = sum / count; // simple
        return average;
    }

    public static void main(String[] args)
    {
        System.out.println(" Average : " + process(25,25,25,25));
    }

}
