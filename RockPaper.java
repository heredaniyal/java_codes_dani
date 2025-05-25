import java.util.Scanner; // #include <iostream>
import java.util.Random;

public class RockPaper {
    public static void main (String[] args)
    {
        // MENU
        System.out.print(" MENU \n");
        System.out.println(" 1. Rock \n 2. Paper \n 3. Scissors");

        // Input
        Scanner obj = new Scanner(System.in);
        Random ran = new Random(); // code with harry for computer logic

        /*
        General Rules before applying logic
        Same means draw!
        Rock beats Scissors
        Paper beats Rock
        Scissors beats Paper
        there are total 6 possibilities excluding draw
        3 possibilities win for user
        3 possibilities for computer

        */

        // User Input
        int user, computer; // first define always bro

        do // see same as c++
        {
            System.out.print(" Enter a number : ");
            user = obj.nextInt();
        } while(user < 1 || user > 3);

        // computer input
        do // see same as c++
        {
            computer = ran.nextInt(4); // 0 to 3
        } while(computer < 1);

        System.out.println(" Computer picked option : " + computer);

        if (user == computer) // draw possibilities are of 3
        {
            System.out.println(" TIE! ");
        }
        else if(user == 1 && computer == 3)
        {
            System.out.println(" USER WINS! ");
        }
        else if(user == 2 && computer == 1)
        {
            System.out.println(" USER WINS! ");
        }
        else if(user == 3 && computer == 2)
        {
            System.out.println(" USER WINS! ");
        }
        else {
            System.out.println(" COMPUTER WINS! ");
        }

    }
}
