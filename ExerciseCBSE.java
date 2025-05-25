import java.util.Scanner; // #include <iostream>

// Done

public class ExerciseCBSE {
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
         // with validation aswell
        int total = 500; // as per code with harry
        int marks1, marks2, marks3, marks4, marks5; // for simple declaration

        System.out.println(" REMEMBER MARKS ARE OUT OF 100!");

        System.out.print(" Enter subject no 1 marks : ");
        boolean b1 = obj.hasNextInt();
        if (b1)
        {
            marks1 = obj.nextInt();
        }
        else {
            System.out.println(" NOT INTEGER!");
            return; // termination
        }

        System.out.print(" Enter subject no 2 marks : ");
        boolean b2 = obj.hasNextInt();
        if (b2)
        {
           marks2 = obj.nextInt();
        }
        else {
            System.out.println(" NOT INTEGER!");
            return; // termination
        }

        System.out.print(" Enter subject no 3 marks : ");
        boolean b3 = obj.hasNextInt();
        if (b3)
        {
            marks3 = obj.nextInt();
        }
        else {
            System.out.println(" NOT INTEGER!");
            return; // termination
        }

        System.out.print(" Enter subject no 4 marks : ");
        boolean b4 = obj.hasNextInt();
        if (b4)
        {
            marks4 = obj.nextInt();
        }
        else {
            System.out.println(" NOT INTEGER!");
            return; // termination
        }

        System.out.print(" Enter subject no 5 marks : ");
        boolean b5 = obj.hasNextInt();
        if (b5)
        {
            marks5 = obj.nextInt();
        }
        else {
            System.out.println(" NOT INTEGER!");
            return; // termination
        }

        float obtained = marks1 + marks2 + marks3 + marks4 + marks5;

        // System.out.println(obtained); // for self check

        float percentage = (obtained/total) * 100;

        // 250/500 == 0.5 which is 0 in integer that's why took float for obtained

        System.out.println(" Percentage : " + percentage);

        obj.close(); // closing scanner object as this is end now

    }
}
