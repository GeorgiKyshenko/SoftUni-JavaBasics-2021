package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String feedback = scanner.nextLine();
        int nights = days - 1;
        double pricePerNight = 0.0;
        double discount = 0.0;
        switch (room) {
            case "room for one person":
                pricePerNight = 18.00;
                break;
            case "apartment":
                pricePerNight = 25.00;
                if (days < 10){
                    discount = 0.30;
                } else if (days <= 15) {
                    discount = 0.35;
                } else {
                    discount = 0.50;
                }
                break;
            case "president apartment":
                pricePerNight = 35.00;
                if (days < 10){
                    discount = 0.10;
                } else if (days <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.20;
                }
                break;
        }
        double totalSum = nights * pricePerNight;
        totalSum = totalSum - (totalSum * discount);
        switch (feedback) {
            case "positive":
                totalSum *= 1.25;
                break;
            case "negative":
                totalSum *= 0.90;
                break;
        }
        System.out.printf("%.2f", totalSum);
    }
}
