import java.util.Scanner;

public class Hansi3
{
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);

         int age;

         System.out.print("Enter your age: ");
         age = scanner.nextInt();

         if (age >= 12)
         {
             System.out.println("You can get the child discount.");
             if (age >= 25)
             {
                 System.out.println("You can get the senior discount.");
             }
         }
         else
         {
             System.out.println("You do not want to get a ticket.");
         }
    }
}
