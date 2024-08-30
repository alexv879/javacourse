import org.w3c.dom.ls.LSOutput;

import java.util.Random;
public class MaxandMin {
    public static void main(String[] args) {
        //declare and assign the 2d arrays of 2 rows and 3 columns
        int[] myArray = new int[10];
        Random randomGenerator = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator.nextInt(10) + 1;
            System.out.println(myArray[i] + " ");
        }
        int maxValue = myArray[0];
        int minValue = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
            if (myArray[i] < minValue)
                minValue = myArray[i];
        }
        System.out.println();
        System.out.println("The smalles value is " + minValue);
        System.out.println("The biggest value is " + maxValue);
        int[] evenArray = new int[10];
        int[] oddArray = new int[10];

        System.out.println("Even numbers in my Array are :");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0);{
                evenArray[i] = myArray[i];
            }
                System.out.println(evenArray[i] + " ");
            }
            System.out.println("Odd numbers in my Array are :");
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] % 2 == 1) ;{
                    oddArray[i] = myArray[i];
                }
                    System.out.println(oddArray[i] + " ");

                    //extension odd and even numbers from the array
                }
            }
        }