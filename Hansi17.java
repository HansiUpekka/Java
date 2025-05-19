import java.util.Scanner;

public class Hansi17
{
    public static void main(String[] args)
    {
        //using methods.

        String name = "Hansi";
        int age = 22;

        happyBirthday(name,age);

        System.out.println();

        double result = square(2);
        System.out.println(result);  // System.out.println(square(2));

        String fullName = getFullName("Hansi","Upekka");
        String fullName1 = getFullName("Hansi","Upekka Sithumini");
        System.out.println(fullName1);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int myage = scanner.nextInt();

        if (checkAge(myage))
        {
            System.out.println("You may be signed in");
        }
        else
        {
            System.out.println("You must be 18+ years old");
        }

    }

    static void  happyBirthday(String birthday_girl, int age)
    {
        System.out.println("Happy Birthday to you...");
        System.out.println("Happy Birthday to you...");
        System.out.printf("Happy Birthday dear %s ...\n",birthday_girl);
        System.out.println("Happy Birthday to you...");
        System.out.printf("Hey now you are %d years old.",age);
    }

    static double square (double number)
    {
        return number * number;
    }

    static String getFullName(String firstName, String lastName)
    {
        return firstName + " " + lastName;
    }

    static boolean checkAge (int yourage)
    {
        if(yourage >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
