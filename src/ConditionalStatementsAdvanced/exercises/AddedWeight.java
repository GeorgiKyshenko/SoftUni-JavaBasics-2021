package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class AddedWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceAbove20kg = Double.parseDouble(scanner.nextLine());
        double weightKilos = Double.parseDouble(scanner.nextLine());
        int daysTillTravel = Integer.parseInt(scanner.nextLine());
        int weightCount = Integer.parseInt(scanner.nextLine());
        double luggage = 0.0;
        if (weightKilos <= 10) {
            luggage = priceAbove20kg * 0.20;
            if (daysTillTravel < 7) {
                luggage = luggage * 0.40;
            } else if (daysTillTravel >= 30) {
                luggage = luggage * 0.15;
            } else {
                luggage = luggage * 0.40;
            }
        } else if (weightKilos <= 20) {

        }
    }
}


