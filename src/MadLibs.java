import java.util.Scanner;
public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a person as a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb in present tense according to your noun: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adverb to describe your verb: ");
        String adverb = scanner.nextLine();

        System.out.print("Enter an adjective to describe your noun: ");
        String adjective = scanner.nextLine();

        System.out.println("---This is my MAD LIBS GAME---");
        System.out.print(noun + " is a student. " + noun + " " + verb + " " +  adverb + ". " +  noun + " is " + adjective + ". ");

        scanner.close();
    }
}
