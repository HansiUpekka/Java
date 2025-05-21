import java.util.Scanner;

public class Hansi20
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        boolean isRunning = true;
        double balance = 0;

        while (isRunning)
        {
            System.out.println("               *******************");
            System.out.println("                 Banking Program");
            System.out.println("               *******************");
            System.out.println();
            System.out.println("Our services =>");
            System.out.println();
            System.out.println("                 1. Show Balance.");
            System.out.println("                 2. Deposit Money.");
            System.out.println("                 3. Withdraw Money.");
            System.out.println("                 4. Exit.");
            System.out.println();

            int choice;
            System.out.print("Enter your choice (1-4) : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += depositMoney();
                case 3 -> balance -= withdrawMoney(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice.");
            }
        }

    }

    static void showBalance(double balance)
    {
        System.out.println("**********");
        System.out.printf("BALANCE is ===> $ %.2f \n",balance);
        System.out.println();

    }

    static double depositMoney()
    {
        System.out.println();
        System.out.print("Enter the amount of money to deposit: ");
        double amount = scanner.nextDouble();

        if (amount < 0)
        {
            System.out.println("*******************");
            System.out.println("Not valid.");
            System.out.println("*******************");
            return 0;
        }
        else
        {
            return amount;
        }
    }

    static double withdrawMoney(double balance)
    {
        System.out.println();
        System.out.print("Enter the amount of money to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance)
        {
            System.out.println("*******************");
            System.out.println("INSUFFICIENT BALANCE.");
            System.out.println("*******************");
            return 0;
        }
        else if(amount < 0)
        {
            System.out.println("*******************");
            System.out.println("Enter correct amount.");
            System.out.println("*******************");
            return 0;
        }
        else
        {
            return amount;
        }
    }
}
