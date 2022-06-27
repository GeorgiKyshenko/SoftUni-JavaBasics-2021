package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        double overall = 0.0;
        if (nights > 7) {
            pricePerNight = pricePerNight - (pricePerNight * 0.05);
        }
        double addedCost = budget  * (percent / 100.0);
        double allNights = nights * pricePerNight;
        overall = allNights + addedCost;
        if (budget >= overall) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - overall);
        } else {
            System.out.printf("%.2f leva needed.", overall - budget);
        }
    }
}
