import java.util.Scanner; // for input object

// DONE

public class Tax {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        double income, tax; // for tax calculation

        do // Validation
        {
            // PROMPT
            System.out.println(" Enter only Integer value ");
            System.out.print(" Write your Income in Lakhs : ");
            income = obj.nextDouble();
            System.out.println();
        } while (income < 0);

        if (income > 10)
        {
            System.out.println(" TAX = 30%");
            income = income * 100000; // 100,000 = 1 LAKH
            tax = income * 0.3; // 30%
            System.out.println(" Tax need to be paid : " + tax);
        }
        else if(income >= 5)
        {
            System.out.println(" TAX = 20%");
            income = income * 100000; // 100,000 = 1 LAKH
            tax = income * 0.2; // 20%
            System.out.println(" Tax need to be paid : " + tax);
        }
        else if (income >= 2.5)
        {
            System.out.println(" TAX = 5%");
            income = income * 100000; // 100,000 = 1 LAKH
            tax = income * 0.05;
            System.out.println(" Tax need to be paid : " + tax);
        }
        else
        {
            System.out.println(" NO TAX");
        }

    }
}
