package Labs2;
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        System.out.print("Max number:"+ max);

        scanner.close();
    }
}
