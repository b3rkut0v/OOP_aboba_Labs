package Labs1;

import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Square is: " + a * b);
        scanner.close();
    }
}
