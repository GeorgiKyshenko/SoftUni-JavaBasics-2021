package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budged = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double rent = 0.0;
        double discount = 0.0;
        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Autumn":
            case "Summer":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (fishers <= 6) {
            discount = 0.10;
        } else if (fishers <= 11) {
            discount = 0.15;
        } else {
            discount = 0.25;
        }
        double neededMoney = rent - (rent * discount);
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            neededMoney = neededMoney - neededMoney * 0.05;
        }
        if (budged >= neededMoney) {
            System.out.printf("Yes! You have %.2f leva left.", budged - neededMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney - budged);
        }
    }
}