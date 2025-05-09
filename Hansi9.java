import java.util.Scanner;

public class Hansi9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch (day)
        {
            /*
            case "Monday" ->
                System.out.println("It is a weekday.");
            case "Tuesday" ->
                    System.out.println("It is a weekday.");
            case "Wednesday" ->
                    System.out.println("It is a weekday.");
            case "Thursday" ->
                    System.out.println("It is a weekday.");
            case "Friday" ->
                    System.out.println("It is a weekday.");
            case "Saturday" ->
                    System.out.println("It is a weekday.");
            case "Sunday" ->
                    System.out.println("It is a weekend day.");
             */
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("It is a weekday.");
            case "Saturday", "Sunday" ->
                    System.out.println("It is a weekend day.");
            default ->
                System.out.println(day + " is not a day.");
        }
    }
}
