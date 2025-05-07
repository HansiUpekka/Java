import java.util.Scanner;

public class Hansi7
{
    public static void main(String[] args)
    {
        // variable = (condition) ? ifTrue : ifFalse;

        Scanner scanner = new Scanner(System.in);

        //int score = 95;
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        if (score >= 60.00)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Work Hard");
        }

        String passOrFail = (score >= 60.00) ? "Pass" : "Work Hard";
        System.out.println(passOrFail);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int  evenOrOdd1 = (number % 2 == 0) ? (number +=2 ) : (number -= 2 );
        System.out.println(evenOrOdd1);

        System.out.print("Enter time: ");
        double time = scanner.nextDouble();

        String dayOrNight = (time < 12.00) ? "It is A.M." : "It is P.M.";
        System.out.println(dayOrNight);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        String payTaxOrNot = (salary >= 50000) ? "Pay Tax" : "No need to pay tax";
        System.out.println(payTaxOrNot);

        scanner.close();

    }
}
