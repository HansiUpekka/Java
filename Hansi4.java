import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;
public class Hansi4
{
    public static void main(String[] args)
    {

        String name = "Hansi Upekka Sithumini";

        int length = name.length();
        System.out.println("Length: " + length);

        char letter0 = name.charAt(0);
        System.out.println("0th index letter: " + letter0);

        char letter1 = name.charAt(1);
        System.out.println("1th index letter: " + letter1);

        char letter2 = name.charAt(2);
        System.out.println("2th index letter: " + letter2);

        int index = name.indexOf("H");
        System.out.println("Index of 'H': " +  index);

        int index1 = name.indexOf("a");
        System.out.println("Index of 'a': " +  index1);

        int index2 = name.indexOf("U");
        System.out.println("Index of 'U': " +  index2);

        int index3 = name.indexOf(" ");
        System.out.println("Index of ' ': " +  index3);

        int lastIndex = name.lastIndexOf("i");
        System.out.println("Index of 'i': " +  lastIndex);

        int lastIndex1 = name.lastIndexOf("a");
        System.out.println("Index of 'a': " +  lastIndex1);

        String name1 = name.toUpperCase();
        System.out.println(name1);

        String name2 = name.toLowerCase();
        System.out.println(name2);

        String name4 = "       Hansi Upekka Sithumini    ";
        String name3 = name4.trim();
        System.out.println(name3);

        String name5 = name.replace("a", "i");
        System.out.println(name5);

        String name6 = name.replace("i", "a");
        System.out.println(name6);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name0 = scanner.nextLine();

        if (name0.isEmpty())
        {
            System.out.println("Your name is empty.");
        }
        else
        {
            System.out.println("Hello, " + name0 + "!");
        }

        if (name0.contains(" "))
        {
            System.out.println("Your name contains spaces.");
        }
        else
        {
            System.out.println("Your name does not contain any spaces.");
        }
        if (name0.contains("a"))
        {
            System.out.println("Your name contains 'a's.");
        }
        else
        {
            System.out.println("No 'a's.");
        }

        if (name0.equals("dasun"))
        {
            System.out.println("Names are totally equal.");
            if (name0.equalsIgnoreCase ("Dasun"))
            {
                System.out.println("This case does not consider about the lower case / upper case.");
            }
        }
        else
        {
            System.out.println("Names are totally different.");
        }
    }
}
