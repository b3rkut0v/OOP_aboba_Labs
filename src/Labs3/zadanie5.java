package Labs3;

import java.util.Random;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(1, 100);
        }
        for (int j : a){
            System.out.println("Число з масиву = " +  j);
        }

        scanner.close();
    }
}
