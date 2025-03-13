package Labs1;

import  java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        boolean isAdult = age >= 18;
        System.out.print(isAdult);
        scanner.close();
    }
}
