package ConditionalStatements.lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int toyTrucks = Integer.parseInt(scanner.nextLine());
        double totalPrice = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + toyTrucks * 2;
        int toyCount = puzzles + dolls + bears + minions + toyTrucks;
        if (toyCount >= 50) {
            totalPrice = totalPrice - totalPrice * 0.25;
        }
        totalPrice = totalPrice - totalPrice * 0.10;
        if (tripPrice <= totalPrice) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - totalPrice);
        }
    }
}
