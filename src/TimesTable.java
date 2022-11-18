import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        //collect the timestable from the user
        System.out.println("What times table would you like?");
        int timesTable = myObj.nextInt();
        //set the base for the times table calculation
        int x = 1;
        // use the for loop to count the times table up to 12
        for (int i = 1; i <= 12; i++) {
            //use the x value to count the times table
            x = i*timesTable;
            System.out.println(timesTable + " times " + i + " = " + x);
        }
    }
}