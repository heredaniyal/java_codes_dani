import java.util.Scanner; // #include <iostream>

// DONE

public class PercentageIfElse {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        float sub1 = 0, sub2 = 0, sub3 = 0; // 3 subjects with default asg
        float total = 150; // all three subjects
        float p1, p2, p3; // individual percentages
        float percentage; // total percentage

        // PROMPT with validation
        do
        {
            System.out.print(" Enter subject no 1 marks out of 50 : ");
            sub1 = obj.nextInt();
        } while (sub1 < 0 || sub1 > 50);

        do
        {
            System.out.print(" Enter subject no 2 marks out of 50 : ");
            sub2 = obj.nextInt();
        } while (sub2 < 0 || sub2 > 50);

        do
        {
            System.out.print(" Enter subject no 3 marks out of 50 : ");
            sub3 = obj.nextInt();
        } while (sub3 < 0 || sub3 > 50);

        // i will use nested if else for this matter

        // first calculate indivdidual percentages
        p1 = (sub1/50) * 100;
        p2 = (sub2/50) * 100;
        p3 = (sub3/50) * 100;

        if (p1 >= 33)
        {
            if (p2 >= 33)
            {
                if (p3 >= 33)
                {
                    float sum = sub1 + sub2 + sub3;
                    percentage = (sum/total) * 100;

                    if (percentage >= 40)
                    {
                        System.out.println(" CONGRATS! PASSED!");
                    }
                    else
                    {
                        System.out.println(" FAILED! OVERALL");
                    }
                }
                else
                {
                    System.out.println(" FAILED! in sub 3");
                }
            }
            else
            {
                System.out.println(" FAILED! in sub 2");
            }
        }
        else
        {
            System.out.println(" FAILED! in sub 1");
        }



    }
}
