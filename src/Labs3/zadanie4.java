package Labs3;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сума всіх чисел від 1 до " + n + " дорівнює: " + sum);

        scanner.close();
    }
}
