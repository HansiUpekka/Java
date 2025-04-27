import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void  main (String[] args)
    {
        //Scanner scanner = new Scanner(System.in);
        // This is my first Java program.

        /* this is
        a
        multi-line
        comment.
         */

        /*
        System.out.print("Hello World!\n");
        System.out.println("I'm Hansi");
        System.out.println ("I love me.");

        // Variables

        int age1;
        age1 = 22;
        age1 += 1;

        System.out.println("I'm " +age1+ " years old." );

        String name1 ="12345";
        System.out.println(name1);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are "+ age + " years old.");

        int width = 0;
        int height = 0;
        int area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextInt();

        System.out.print("Enetr the height: ");
        height = scanner.nextInt();

        area = width * height;

        System.out.println("Area is: " + area + "cm²");

        */

        /*
        System.out.print("Please type the name which you want to buy: ");
        String good = scanner.nextLine();

        System.out.print("Price of that good                        : ");
        double price = scanner.nextDouble();

        System.out.print("Quantity                                  : ");
        double quantity = scanner.nextDouble();

        char currency = '$';
        double total = 0;

        total = price * quantity;

        System.out.println("Total price                               : " + total + currency);
        */

        //Scanner scanner = new Scanner(System.in);

        /*
        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();


        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student(true/false)? : ");
        isStudent = scanner.nextBoolean();

        if (name.isEmpty()) // (name == " ")
        {
            System.out.println("You did not enter your name. 😡 ");
        }
        else
        {
            System.out.println("Hello, " + name + "! 😉");
        }


        if (age >= 65)
        {
            System.out.println("You are an adult. 👨‍🦳");
        }
        else if (age >= 18)
        {
            System.out.println("You are a senior. 👨‍🦱");
        }
        else if (age == 0)
        {
            System.out.println("You are a baby. 👶");
        }
        else if (age < 0)
        {
            System.out.println("You are not born. 👼");
        }
        else
        {
            System.out.println("You are a child. 🧒");
        }

        if (isStudent)
        {
            System.out.println("You are a student. 👩‍🎓");
        }
        else
        {
            System.out.println("You are not a student. 👨‍💻");
        }

        scanner.close();
        */

        Random random = new Random();

        int num1;
        num1 = random.nextInt();
        System.out.println(num1);

        int num2;
        num2 = random.nextInt(1,7);
        System.out.println(num2);

        boolean isHead;
        isHead = random.nextBoolean();
        System.out.println(isHead);

        if (isHead)
        {
            System.out.println("Head.");
        }
        else
        {
            System.out.println("Tail.");
        }
    }

}
