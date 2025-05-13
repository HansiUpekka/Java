import java.util.Scanner;

public class Hansi14
{
    public static void main(String[] args) throws  InterruptedException
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How long would you want ot count down from: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println();
        System.out.println("I LOVE YOU HANSI !!!");

    }
}
