import java.util.Scanner;

public class Hansi11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
/*
        double temperature;
        boolean isSunny;

        System.out.print("Enter temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Now it is 'Sunny' or not (True of False)? ");
        isSunny = scanner.nextBoolean();

        if (temperature == -0  )
        {
            System.out.println("Enter valid temperature.");
        }
        else if (temperature > 30 || temperature < 0)
        {
            System.out.println("The weather is too BAD.");
        }
        else if (temperature <= 30 && temperature >= 0)
        {
            System.out.println("Thw weather is too GOOD.");
        }

        if (!isSunny)
        {
            System.out.println("You may need an umbrella.");
        }
        else
        {
            System.out.println("You must need a sunglasses.");
        }
*/
        System.out.printf("\n");

        System.out.println("--- Another Program ---");

        String username;

        System.out.print("Enter a username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12)
        {
            System.out.println("Username must be between 4 - 12 characters.");
        }
        else if (username.contains(" ") || username.contains("_"))
        {
            System.out.println("Username must not contain spaces or underscores.");
        }
        else
        {
            System.out.println("Welcome " + username + "!");
        }

        scanner.close();
    }
}
