package Exam;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String footballFan = scanner.nextLine();
        double budged = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());
        double priceForBeer = beers * 1.20;
        double pricePerChips = priceForBeer * 0.45;
        double overallChips =  Math.ceil(pricePerChips * chips);
        double overallSum = overallChips + priceForBeer;
        if (budged >= overallSum) {
            System.out.printf("%s bought a snack and has %.2f leva left.", footballFan, budged - overallSum);
        } else {
            System.out.printf("%s needs %.2f more leva!", footballFan, overallSum - budged);
        }
    }
}
