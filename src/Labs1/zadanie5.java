package Labs1;

import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.println("Are you a student? (yes/no)");
        boolean isStudent = scanner.nextLine().equals("yes") ? true : false;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);
        scanner.close();
    }
}
