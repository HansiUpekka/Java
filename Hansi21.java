import java.util.Random;
import java.util.Scanner;

public class Hansi21
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;

        System.out.print("How many rounds would you like to roll: ");
        int round = scanner.nextInt();
        System.out.println();

        if (round < 0) {
            System.out.println("It must be greater than 0.");
        } else {
            for (int i = 0; i < round; i++) {
                int roll = random.nextInt(1, 7);
                System.out.println("You roll " + roll + ".");
                printDice(roll);

                /*
                switch (roll)
                {
                    case 1 ->
                        {
                            System.out.println("""
                                     -------
                                    |       |
                                    |   ●   |
                                    |       |
                                     -------
                                    """);
                        }
                    case 2 ->
                        {
                            System.out.println("""
                                     -------
                                    |       |
                                    | ●   ● |
                                    |       |
                                     -------
                                    """);
                        }
                    case 3 ->
                        {
                            System.out.println("""
                                     -------
                                    | ●     |
                                    |   ●   |
                                    |     ● |
                                     -------
                                    """);
                        }
                    case 4 ->
                    {
                            System.out.println("""
                                     -------
                                    | ●   ● |
                                    |       |
                                    | ●   ● |
                                     -------
                                    """);
                    }
                    case 5 ->
                    {
                            System.out.println("""
                                     -------
                                    | ●   ● |
                                    |   ●   |
                                    | ●   ● |
                                     -------
                                    """);
                    }
                    case 6 ->
                    {
                            System.out.println("""
                                     -------
                                    | ●   ● |
                                    | ●   ● |
                                    | ●   ● |
                                     -------
                                    """);
                    }
                }
                 */

                total += roll;
            }

            System.out.println();
            System.out.println("Total: " + total);

            scanner.close();

        }
    }

    static void printDice (int roll)
    {
        String dice1 = """
                        -------
                       |       |
                       |   ●   |
                       |       |
                        -------
                       """;
        String dice2 = """
                        -------
                       |       |
                       | ●   ● |
                       |       |
                        -------
                       """;
        String dice3 ="""
                        -------
                       | ●     |
                       |   ●   |
                       |     ● |
                        -------
                       """;
        String dice4 ="""
                        -------
                       | ●   ● |
                       |       |
                       | ●   ● |
                        -------
                       """;
        String dice5 ="""
                        -------
                       | ●   ● |
                       |   ●   |
                       | ●   ● |
                        -------
                       """;
        String dice6 ="""
                        -------
                       | ●   ● |
                       | ●   ● |
                       | ●   ● |
                        -------
                       """;

        switch (roll)
        {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);

        }

    }
}
