import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Hansi10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        boolean valid_operation = true;
        double result = 0;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator ( + , - , * , / , ^ ) : ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator)
        {
            case '+' ->
                result = num1 + num2;
            case '-' ->
                result = num1 - num2;
            case '*' ->
                result = num1 * num2;
            case '/' ->
            {
                /*
            case  '/' ->
                result = num1 / num2;

            Enter the first number: 5
            Enter the operator ( + , - , * , / , ^ ) : /
            Enter the second number: 0
            Infinity
             */
                if ( num2 == 0)
                {
                    System.out.println("Cannot divide by zero!");
                    valid_operation = false;
                }
                else
                {
                    result = num1 / num2;
                }

            }

            case '^' ->
                result = Math.pow(num1,num2);
            default ->
            {
                System.out.println("Invalid operator.");
                valid_operation = false;
            }
        }

        if (valid_operation)
        {
            System.out.println(result);
        }
    }
}
