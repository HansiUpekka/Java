import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Hansi2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double amount;
        double rate;
        double principal;
        int compoundPerYear;
        int timeInYears;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times interest is compound per year: ");
        compoundPerYear = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        timeInYears = scanner.nextInt();

        amount = principal * Math.pow((1 + (rate / compoundPerYear)),(compoundPerYear * timeInYears));

        System.out.printf("The amount after %d years is: $%.2f\n",timeInYears,amount);

        System.out.println("The amount after " + timeInYears + " is $" + amount);

        scanner.close();
    }
}
