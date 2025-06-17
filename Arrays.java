
package basics;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myArray = {1,3,5,7,9};

        int[] anotherArray = new int[10];
        String[] gender = {"Female", "Male"};

        //To update an array value
         myArray[1] =  13;
         anotherArray[5] = 17;

         for (int i = 0; i < myArray.length; i++) {
             System.out.println("Item at: " +i+ "is" +myArray[i]);
             System.out.println("Item at: " +i);
             anotherArray[i] =input.nextInt();


         for (int i = 0; i < anotherArray.length; i++) {
             System.out.println("Item at: " +i+ "is" +myArray[i]);
             System.out.println("Insert item at: " +i);
             anotherArray[i] =input.nextInt();
             System.out.println("Item at: " +i+ "is" +anotherArray[i]);


            //To look for an item, search
             for (int i = 0; i < anotherArray.length; i++){
                if (anotherArray[i] ==13);
                system.out.println("Found it");
                break;




                //use a for loop to get the sum of items within myArray
            int sum = 0;
            for (int h = 0; h < myArray.length; h++) {
                    sum += myArray[h];
                    system.out.println("sum = " + sum);
                }
            }

        }

    }
}
