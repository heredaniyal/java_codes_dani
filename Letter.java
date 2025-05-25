import java.util.Scanner; // #include <iostream>

// DONE

public class Letter {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        String letter = "Dear <|name|>, Thanks a lot"; // as per question

        System.out.print(" Enter a String : "); // PROMPT
        String val = obj.nextLine();

        String result = letter.replace("<|name|>",val);

        System.out.println(result);

    }
}
