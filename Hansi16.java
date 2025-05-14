import java.util.Scanner;

public class Hansi16
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
         /*
        for (int i = 1; i <= 5; i++)
        {
            for (int j =1; j <= 10; j++)
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        */

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol which you like to print: ");
        symbol = scanner.next().charAt(0);

        for (int i = 1; i <= rows; i++)
        {
            for (int j =1; j <= columns; j++)
            {
                System.out.print(symbol+ " ");
            }
            System.out.println();
        }
    }
}
