import java.util.Scanner; // input package
import java.util.Random; // for generating random number

// RUNNING VERSION

class Game
{
    private int num, guess, noOfGuesses;
    Scanner obj = new Scanner(System.in); // for entering number

    public Game() // default constructor for random number
    { // value setting
        Random ran = new Random();
        num = ran.nextInt(101); // 0 to 100
    }

    public void takeUserInput() // for taking input
    {
        do // input with validation
        {
            System.out.print(" Enter a number between 0 to 100 : ");
            guess = obj.nextInt();
        } while (guess < 0 || guess > 100);
    }

    public boolean isCorrectNumber()
    {
        boolean check = false;

        if (guess == num)
        {
            noOfGuesses++;
            check = true;
        }
        else if (guess > num)
        {
            noOfGuesses++;
            System.out.println(" Try Lower : ");
        }
        else
        {
            noOfGuesses++;
            System.out.println(" Try Higher : ");
        }

        return check; // when number is found
    }

    public void setNoOfGuesses() {
        noOfGuesses = 0; // assign a value of 0 for default
    }

    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
}

public class GuessTheNumber // MAIN CLASS
{
    public static void main(String[] args)
    {
        boolean b; // checking value
        Game dani = new Game(); // random number generated as well
        dani.setNoOfGuesses(); // setting default value

        do // validation here as well
        {
            dani.takeUserInput();
            b = dani.isCorrectNumber(); // assigning boolean value using return statement
        } while(!b);

        // OUTPUT OF getting correct number
        System.out.println(" You got your Number Correct! in " + dani.getNoOfGuesses() + " Guesses ! ");

    }
}