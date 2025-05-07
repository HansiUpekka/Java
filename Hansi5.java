import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Hansi5
{
    public static void main(String[] args)
    {
        String email = "BroCode123@gmail.com";

        String username = email.substring(0, 10);
        System.out.println("Username: " + username); // BroCode123

        String username1 = email.substring(0, 9);
        System.out.println("Username: " + username1); // BroCode12

        String domain_name = email.substring(11, 20);
        System.out.println("Domain name: " + domain_name); // gmail.com

        String domain_name1 = email.substring(11);
        System.out.println("Domain name: " + domain_name1);  // gmail.com

        String username2 = email.substring(0, 10);
        System.out.println("Username: " + username2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email1 = scanner.nextLine();

        if (email1.isEmpty())
        {
            System.out.println("Email is empty.");
        }
        else if (email1.contains("@"))
        {
            String username6 = email1.substring(0,email1.indexOf("@"));
            System.out.println("Username: " + username6);

            String domain_name6 = email1.substring(email1.indexOf("@"));
            System.out.println("Domain name: " + domain_name6);  // @gmail.com

            String domain_name7 = email1.substring(email1.indexOf("@") + 1);
            System.out.println("Domain name: " + domain_name7);  //gmail.com
        }
        else
        {
            System.out.println("Invalid email.");
        }
    }
}
