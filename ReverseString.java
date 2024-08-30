import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("This program will reverse the letters in a name");
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        char[] letters = reader.nextLine().toCharArray();//reading each char of the name

        // Print all the array elements#
        System.out.println("The name printed in reverse is ");
        for (int i=letters.length-1; i >= 0; i--)
        {
            System.out.print(letters[i] + " ");
        }
    }
}

//this program will reverse the name