import java.awt.desktop.SystemEventListener;

public class Hansi1
{
    public static void main(String[] args)
    {
        //use of printf
        // %[flags][width][.precision][special-character]

        int age = 22;
        String name = "Hansi";
        char firstLetter = 'H';
        double height = 163.5;
        boolean isStudent = true;

        System.out.printf("Hello, %s !\n", name);
        System.out.printf("Your name is started with %c.\n", firstLetter);
        System.out.printf("Your height is %f.\n\n",height);

        System.out.printf("Your height is %.1f .\n\n",height);

        System.out.printf("Student:- %b\n",isStudent);

        System.out.printf("%s is %d years old.\n\n",name,age);

        double  num1 = 99.9;
        double num4 = 99.99;
        double num2 = 100.15;
        double num3 = -55.01;

        System.out.printf("%f\n",num1);    // 99.900000
        System.out.printf("%f\n",num2);
        System.out.printf("%f\n",num4);
        System.out.printf("%f\n\n",num3);  // -55.010000

        System.out.printf("%.1f\n",num1);   // 99.9
        System.out.printf("%.1f\n",num2);
        System.out.printf("%.1f\n",num3);   // -55.0
        System.out.printf("%.1f\n\n",num4); // 100.0

        System.out.printf("%+.2f\n",num4);   // +99.99
        System.out.printf("%+.1f\n\n",num3); // -55.0

        double num5 = 1000000000000.0001;
        System.out.printf("%,.4f\n\n",num5);  // 1,000,000,000,000.0001

        System.out.printf("%(f\n",num1);   // 99.900000
        System.out.printf("%(f\n",num2);
        System.out.printf("%(f\n",num4);
        System.out.printf("%(f\n\n",num3); // (55.010000)

        System.out.printf("% f\n",num1);   // 99.900000
        System.out.printf("% f\n",num2);
        System.out.printf("% f\n",num4);
        System.out.printf("% f\n\n",num3); //-55.010000

        int id1 =    1;
        int id2 =   23;
        int id3 =  456;
        int id4 = 7890;

        System.out.printf("%d\n",id1);     //1
        System.out.printf("%d\n",id2);     //23
        System.out.printf("%d\n",id3);     //456
        System.out.printf("%d\n\n",id4);   //7890

        System.out.printf("%04d\n",id1);   //0001
        System.out.printf("%04d\n",id2);   //0023
        System.out.printf("%04d\n",id3);   //0456
        System.out.printf("%04d\n\n",id4); //7890

        System.out.printf("%4d\n",id1);    //   1
        System.out.printf("%4d\n",id2);    //  23
        System.out.printf("%4d\n",id3);    // 456
        System.out.printf("%4d\n\n",id4);  //7890

        // same to first part
        System.out.printf("%-4d\n",id1);   
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n\n",id4);
    }

}
