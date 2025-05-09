import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Hansi8
{
    public static void main(String[] args)
    {
        // Temperature Converter

        Scanner scanner = new Scanner(System.in);

        double temp;
        double new_temp;
        String unit;

        System.out.println("---Temperature Converter---");
        System.out.print("Enter temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to 'Celsius' of 'Fahrenheit' ( C or F ):  ");
        unit = scanner.next().toUpperCase();

        // using ternary operator
        new_temp = (unit.equals("C") ? ((temp - 32.0) * (5.0/9.0)) : ((temp * (9.0/ 5.0)) + 32.0));

        System.out.printf("%.1f°%s",new_temp,unit);
        Scanner sc = new Scanner(System.in);

    }
}





