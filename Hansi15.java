public class Hansi15
{
    public static void main(String[] args)
    {
        //BREAK => break out of a loop (STOP)
        //continue => skip current iteration of a loop

        for (int i = 1; i <= 10; i++)
        {

            System.out.print( i + "  "); // 1  2  3  4  5  6  7  8
            if ( i == 3 )
            {
                continue;
            }

            if ( i == 8 )
            {
                break;
            }

            //System.out.print( i + "  "); // 1  2  4  5  6  7

        }
    }
}
