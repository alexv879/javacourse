    import java.util.Scanner;
    public class ExistInArray {
        public static void main(String[] args) {
            //create scanner object
            Scanner reader = new Scanner(System.in);
            int[] number = {2, 4, 6, 8, 10};
            System.out.println("Enter a number to search for, we will find out if the number exists within the array.");
            //read the user input
            int usernumber = reader.nextInt();

            int valueFind = 0;

            for (int i = 0; i < number.length; i++) {
                if (usernumber == number[i]) {
                    valueFind++;
                }
            }
            if (valueFind != 0) {
                System.out.println("Value" + usernumber + "is found in this array");
            }
            if (valueFind ==0){
                System.out.println("Value" + usernumber + "is notfound in this array");
            }
        }
    }

