import java.util.Random;
import java.util.Scanner;

public class Hansi13
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Lets print a number between your desired range ==>>");

        int min;
        int max;
        int random_number;
        int guess_number;
        int attempt = 0;

        System.out.print("Enter minimum number of range: ");
        min = scanner.nextInt();

        System.out.print("Enter maximum number of range: ");
        max = scanner.nextInt();

        random_number = random.nextInt(min , max + 1);

        System.out.println("---Number Guessing---");
        System.out.printf("Guess a number between %d - %d :\n\n",min,max);

        do{
            System.out.println("Enter a guess number: ");
            guess_number = scanner.nextInt();
            attempt++;

            if (random_number > guess_number)
            {
                System.out.println("Too Low! Try again.");
            }
            else if (random_number < guess_number)
            {
                System.out.println("Too High! Try again.");
            }
            else
            {
                System.out.println("Correct! The number is " + random_number);
                System.out.println("Number of attempts: " + attempt);
            }
        } while(random_number != guess_number);



        scanner.close();

    }
}
