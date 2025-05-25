package OOP;

import java.util.Scanner; // for input
import java.util.Random; // For random guess by computer

// RUNNING

class MainGame
{
     Scanner obj = new Scanner(System.in); // object made for input
     private int noOfGuesses = 0; // default value
     private int num; // guess by computer
     private int guess; // by user

    public MainGame() // default constructor
    {
        Random ran = new Random(); // object made of Random class
        num = ran.nextInt(101); // 0 to 100
    }

    public void takeUserInput() // for input bro
    {
        System.out.print(" Enter Your Guess from 0 to 100 : ");
        guess = obj.nextInt();
    }

    public int getNoOfGuesses() { return noOfGuesses; } // GETTER ONLY
    // NO SETTER FOR NOW ZAROORAT NAHI

    public boolean isCorrectNumber()
    {
        noOfGuesses++;
        if (guess == num)
        {
            return true; // to main function
        }
        else if (guess > num)
        {
            System.out.println(" Try a lower Number! ");
        }
        else
        {
            System.out.println(" Try a Higher Number! ");
        }

        return false; // obviously all other possibilities convert into false
    }

}

public class Game
{
    public static void main(String[] args)
    {
        boolean check; // for isCorrectNumber() or else i'll call it in the condition
        MainGame gingka = new MainGame(); // constructor called aswell

        do
        {
           gingka.takeUserInput(); // user input
            check = gingka.isCorrectNumber();
        } while (!check); // when condition is true, break then

        System.out.println(" FINALLY YOU GOT The Number! ");
        System.out.println(" Number of Guesses you Took : " + gingka.getNoOfGuesses());

    }

}
