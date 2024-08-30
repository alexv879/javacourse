import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        System.out.println("What is the width? ");
        double width = reader.nextDouble();
        System.out.println("What is the height? ");
        double height = reader.nextDouble();
        double perimeter = height * 2+ width * 2;
        double area = width * height;
        System.out.println("The height is " + height);
        System.out.println("The width is " + width);
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);


//        double height =25.3;//
//        double width = 13.5;//


    }
}
