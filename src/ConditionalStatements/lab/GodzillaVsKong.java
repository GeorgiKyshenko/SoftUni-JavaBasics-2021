package ConditionalStatements.lab;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceForClothes  = Double.parseDouble(scanner.nextLine());
        double decor  = budget * 0.10;
        double allClothes = statists * priceForClothes;
        if (statists >= 150){
            allClothes = allClothes - (allClothes * 0.10);
        }
        double overallSum = decor + allClothes;
        if (overallSum > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", overallSum -budget);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - overallSum);
        }
    }
}
