package Labs1;

import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Your age: " + age);
        scanner.close();
    }

}
