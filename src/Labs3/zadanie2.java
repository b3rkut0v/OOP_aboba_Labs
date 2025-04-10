package Labs3;

import java.util.Random;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int max;
        int min;
        System.out.print("Введіть мінімальне: ");
        min = scanner.nextInt();
        System.out.print("Введіть максимальне: ");
        max = scanner.nextInt();
        int randomNumber = random.nextInt(min,max);


        do {
            System.out.print("Введіть число: ");
            guess = scanner.nextInt();
            //attempts++;
            if (guess < randomNumber) {
                System.out.println("Спробуйте більше число!");
            } else if (guess > randomNumber) {
                System.out.println("Спробуйте менше число!");
            } else {
                System.out.println("Вітаємо! Вивгадали загадане число!!!");
            }
        } while (guess != randomNumber);
    }
}
