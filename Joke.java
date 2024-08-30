import java.util.Scanner;

public class Joke {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = 100;
        System.out.println("For the next joke you must enter a number:");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("You are very positive!");
        if (number > x) {
                System.out.println("Too Much, Try Again");
            }
        if (number < 0) {
                System.out.println("Stop being negative!");
        if (number < x) {
                    System.out.println("Wrong, Try Again");
                }
        if (number > 0) {
                    System.out.println("You are very positive!");
                    if (number > x) {
                        System.out.println("Woah, not that much");
                    }
// I still need to add what happens when the number inserted is x or 0 //
                }
            }
        }
    }
}