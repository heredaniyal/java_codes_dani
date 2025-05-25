
// !!!!! USING CHATGPT !!!!!

public class DownTriangleRecursionUsingChatGpt {

    // Method to display the pattern
    static void display(int i, int j) {
        // Base case: stop recursion when all rows are printed

        if (i >= 4) // i want 4 lines only so this is about lines
        {
            return;
        }

        // Print stars for the current row
        // all depends upon i
        for (int k = 0; k < j - i; k++) {
            System.out.print("* ");
        }

        System.out.println(); // Move to the next line

        // Recursive call to print the next row
        display(i + 1, j);
    }

    // MAIN FUNCTION
    public static void main(String[] args)
    {
        display(0, 4); // calling display method for the triangle right angle
    }
}
