import java.util.Scanner;

public class Hansi6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double enter_weight;
        double new_weight;

        System.out.println("---Weight Conversion Program---");
        System.out.println("Option 1: Convert lbs to kgs (enter 1)");
        System.out.println("Option 2: Convert kgs to lbs (enter 2)" );

        System.out.print("Choose your option: ");
        int choose = scanner.nextInt();

        if (choose == 1)
        {
            System.out.print("Enter the weight in lbs: ");
            enter_weight = scanner.nextDouble();
            new_weight = enter_weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f kg",new_weight);
        }
        else if (choose == 2)
        {
            System.out.print("Enter the weight in kgs: ");
            enter_weight = scanner.nextDouble();
            new_weight = enter_weight * 2.20462;
            System.out.printf("The new weight in kgs is: %.2f lbs",new_weight);
        }
        else
        {
            System.out.println("Invalid input.");
        }
    }
}
