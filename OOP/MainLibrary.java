package OOP;

import java.util.Scanner; // FOR INPUT

/* You have to implement a library using Java Class OOP.Library
 Methods: addBook, issueBook, returnBook, showAvailableBooks
 Properties: Array to store the available books,
 Array to store the issued books */

// RUNNING

class Library
{
    // attributes
    String [] a = new String[5]; // available books for now 5
    String [] b = new String[5]; // issued

    public Library() // default constructor
    {
        // removing null with spaces which is memory
       for (int i = 0; i < 5; i++)
       {
           a[i] = " ";
           b[i] = " ";
       }
    }

    public void showOptions() // SHOWING OPTIONS METHOD
    {
        System.out.println(" WELCOME TO UMT OOP.Library! ");
        System.out.println(" 0. EXIT");
        System.out.println(" 1. Available Books Menu");
        System.out.println(" 2. Issued Books Menu");
        System.out.println(" 3. Add a Book");
        System.out.println(" 4. Issue a Book");
        System.out.println(" 5. Return a Book");
    }

    public void showAvailableBooks()
    {
        System.out.println(" Available Books ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i + " " + a[i]);
        }
    }

    public void showIssuedBooks()
    {
        System.out.println(" Issued Books ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i + " " + b[i]);
        }
    }

    public void addBook()
    {
        Scanner obj = new Scanner(System.in); // for input
        String name; // for entering
        int index; // for index

        // PROMPT
        System.out.print(" Enter name of Book to add : ");
        name = obj.nextLine();

        do // validation as well
        {
            System.out.print(" Tell the index to add on from 0 to 4 : ");
            index = obj.nextInt();
        } while (index < 0 || index > 4);

        // obj.nextLine(); // cin.ignore()

        // checking if vacant place exists
        if (a[index].equals(" "))
        {
            a[index] = name; // storing in array
        }
        else
        {
            System.out.println(" BOOK ALREADY IN AREA! ");
        }
    }

    public void issueBook() // used to issue a book
    {
        Scanner obj = new Scanner(System.in); // input
        int choice; // entering a choice

        showAvailableBooks(); // for showing available books

        // PROMPT
        do
        {
            System.out.print(" enter index of book you need to issue : ");
            choice = obj.nextInt();
        } while (choice < 0 || choice > 4); // 0 to 4

        // yeh bhi check karna hai kay empty handed tou nahi hai
        if (a[choice].equals(" "))
        {
            System.out.println(" THAT IS VACANT! ");
        }
        else
        {
            b[choice] = a[choice]; // issued <- available
            a[choice] = " ";
            System.out.println(" Successfully Issued " + b[choice]);
        }
    }

    public void returnBook()
    {
        Scanner obj = new Scanner(System.in);
        int choice;
        showIssuedBooks(); // return an issue book na

        do // validation as well
        {
            System.out.println(" Enter index of book you like to return? ");
            choice = obj.nextInt();
        } while (choice < 0 || choice > 4);

        // a array is available while b is issued
        if (b[choice].equals(" "))
        {
            System.out.println(" VACANT");
        }
        else
        {
            a[choice] = b[choice]; // available <- issued
            b[choice] = " "; // storing empty space now
            System.out.println(" Successfully returned " + a[choice]);
        }

    }

}

public class MainLibrary
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in); // for input methods
        int choice;     

        // prompt with constructor
        Library umt = new Library(); // umt my best choice

        do // tab tak chalta reh jab tak exit ki option click na kare
        {
            umt.showOptions(); // to show options everytime
            do // validation verified
            {
                System.out.print(" Enter your Choice : ");
                choice = obj.nextInt();
            } while (choice < 0 || choice > 5);

            switch (choice)
            {
                case 0:
                    break;
                case 1:
                    umt.showAvailableBooks();
                    break;
                case 2:
                    umt.showIssuedBooks();
                    break;
                case 3:
                    umt.addBook();
                    break;
                case 4:
                    umt.issueBook();
                    break;
                case 5:
                    umt.returnBook();
                   break;
            }
        } while (choice != 0);

        // ending polite message
        System.out.println(" ALLAH HAFIZ! ");
    }
}
