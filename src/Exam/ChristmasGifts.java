package Exam;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countToys = 0;
        int countClothes = 0;
        int kids = 0;
        int adults = 0;
        while (!input.equals("Christmas")) {
            int age = Integer.parseInt(input);
            if (age <= 16) {
                kids += 1;
                countToys++;
            } else {
                adults += 1;
                countClothes++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %d%n", countToys * 5);
        System.out.printf("Money for sweaters: %d", countClothes * 15);
    }
}
