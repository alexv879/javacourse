import java.util.Scanner;
public class StaffProfile {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter staff name, age and salary in the system");

        System.out.println("Enter staff name");
        String name = object.nextLine();


        System.out.println("Enter Age");
        int age = object.nextInt();

        System.out.println("Enter Salary");
        double salary = object.nextDouble();


        System.out.println("Staff name is " + name);
        System.out.println("Age = " + age);
        System.out.println("Salary =" + salary);

}
    }

