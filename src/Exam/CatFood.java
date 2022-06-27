package Exam;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cats = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int bigCats = 0;
        int largeCats = 0;
        int foodSum = 0;
        for (int i = 1; i <= cats; i++) {
            int grams = Integer.parseInt(scanner.nextLine());
            if (grams >= 100 && grams < 200) {
                smallCats++;
            } else if (grams >= 200 && grams < 300) {
                bigCats++;
            } else  {
                largeCats++;
            }
            foodSum += grams;

        }
        System.out.printf("Group 1: %d cats.%n", smallCats);
        System.out.printf("Group 2: %d cats.%n", bigCats);
        System.out.printf("Group 3: %d cats.%n", largeCats);
        System.out.printf("Price for food per day: %.2f lv.", (foodSum / 1000.0) * 12.45);

    }
}
