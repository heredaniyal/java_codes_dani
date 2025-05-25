import java.util.Scanner;

class Halima {
    private static String name;//for taking name input
    private static char acctype;//for taking user input about account type
    private static int balance=0;//balance declared to 0 so if user not create account it will be considered 0
    private static int deposit;//for deposit money
    private static int withdraw;//for withdraw

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//for taking input
        int option;//declare outside bcz of loop
        do
        {
            System.out.println("what do you want??\n1.create an account\n2.deposit money\n3.withdraw money\n4.Display information\n5.exit");

            option=sc.nextInt();
            sc.nextLine();//consume leftover line new character

            switch(option){
                case 1:
                    System.out.println("Open New Account");
                    opennewacc(sc);
                    break;
                case 2:
                    System.out.println("Deposit Money");
                    depositmoney(sc);
                    break;
                case 3:
                    System.out.println("Withdraw Money");
                    withdrawmoney(sc);
                    break;
                case 4:
                    System.out.println("Display Information");
                    displayinfo();
                    break;

                case 5:
                    System.out.println("Exiting......");
                    break;
                default:
                    System.out.println("ERROR!! You Entered a Wrong Number");
            }
        }
        while(option!=5);

        sc.close();//finish taking input
    }

    private static void opennewacc(Scanner sc){
        System.out.println("What's your name?");
        name=sc.nextLine();

        System.out.println("which type of account do u want to create??\n Press s for saving\n Press c for current");
        acctype=sc.nextLine().charAt(0);

        if (acctype == 's' || acctype == 'c')
        {
            System.out.println("how much money do you want to deposit??");
            balance=sc.nextInt();
            sc.nextLine();
            System.out.println("your Account is created succesfully!");
        }
        else
        {
            System.out.println(" ERROR Creating Account! ");
        }

    }

    private static void depositmoney(Scanner sc){

        System.out.println("how much money do you want to deposit??");
        deposit=sc.nextInt();
        balance+=deposit;
        System.out.println("your Balance is" + balance);
    }
    private static void withdrawmoney(Scanner sc){

        System.out.println("how much money do you want to withdraw?");
        withdraw=sc.nextInt();
        if(withdraw<=balance){
            balance-=withdraw;
        }
        if (withdraw==0){
            System.out.println("your withdraw is not possible");


        }
        else {
            System.out.println("your withdraw is not possible");


        }
        System.out.println("your Balance is" + balance);
    }

    private static void displayinfo(){
        System.out.println("your name is "   +  name);
        System.out.println("your account type is "  +  getAccountType());
        System.out.println("your Balance is "   + balance);

    }

    public static String getAccountType()
    {
        String ayesha = "";

        if (acctype == 's')
        {
            ayesha = "Savings";
        }
        else if (acctype == 'c')
        {
            ayesha = "Current";
        }
       return ayesha;
    }
}