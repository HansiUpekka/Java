import java.util.Scanner;

public class Hansi12
{
    public  static void main (String[] args)
    {
        /*
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty())
        {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name + "!");

        scanner.close();
        */

        /*
        while (1 == 1)    //INFINITE LOOP
        {
            System.out.println("Help! I'm stuck in a loop.");
        }
        */

        /*
        Scanner scanner = new Scanner(System.in);

        String response ="";

        while (!response.equals("Q"))
        {
            System.out.println("You are playing a game.");
            System.out.println("Press Q to quit if you want: ");
            response = scanner.nextLine().toUpperCase();
        }

        System.out.println("You have quit the game. ");

        scanner.close();
        */

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        /*
        while (age <= 0)
        {
            System.out.println("Your age can not be negative. ");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        */
        do
        {
            System.out.println("Your age can not be negative. ");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

        }while (age <= 0);

        System.out.println();//System.out.printf("\n");

        System.out.println("You are " + age + " years old.");

        System.out.println();
        System.out.println("---New One---");

        int number;

        do
        {
            System.out.print("Enter a number between 1 -10 : ");
            number = scanner.nextInt();
        } while ( number  < 1 || number >10  );

        System.out.println("You picked " + number + ". ");

        scanner.close();
    }
}
