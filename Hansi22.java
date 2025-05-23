import  java.util.Arrays;

public class Hansi22
{
    public static void main(String[] args)
    {
        /*
        String fruit = "apple";

        System.out.println(fruit);

         */

        String[] fruits = {"apple", "orange", "grapes", "banana", "pineapple"};

        System.out.println(fruits);  //Implicit call to 'toString()' on array 'fruits'
        // [Ljava.lang.String;@27716f4

        System.out.println(fruits[0]);
        System.out.println(Arrays.toString(fruits));

        int numOfFruits = fruits.length;

        System.out.println(numOfFruits);

        for(int i= 0; i<numOfFruits; i++)
        {
            System.out.println(fruits[i]);
        }

        //Arrays.sort(fruits);

        Arrays.fill(fruits, "pineapple");
        
        System.out.println();

        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }


    }
}
