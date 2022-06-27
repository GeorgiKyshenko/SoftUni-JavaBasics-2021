package Exam;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int spentHours = Integer.parseInt(scanner.nextLine());
        int persons = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        double dayPrice = 0.0;
        double nightPrice = 0.0;
        double pricePerPerson = 0.0;
        switch (month) {
            case "march":
            case "april":
            case "may":
                dayPrice = 10.50;
                nightPrice = 8.40;
                if (persons >= 4) {
                    dayPrice *= 0.90;
                    nightPrice *= 0.90;
                }
                if (spentHours >= 5) {
                    dayPrice *= 0.50;
                    nightPrice *= 0.50;
                }
                break;
            case "june":
            case "july":
            case "august":
                dayPrice = 12.60;
                nightPrice = 10.20;
                if (persons >= 4) {
                    dayPrice = dayPrice - (dayPrice * 0.10);
                    nightPrice = nightPrice - (nightPrice * 0.10);
                }
                if (spentHours >= 5) {
                    dayPrice = dayPrice - (dayPrice * 0.50);
                    nightPrice = nightPrice - (nightPrice * 0.50);
                }
                break;
        }
        if (dayTime.equals("day")) {
            pricePerPerson = (spentHours * dayPrice);
            System.out.printf("Price per person for one hour: %.2f%n", dayPrice);
        } else if (dayTime.equals("night")) {
            pricePerPerson = (spentHours * nightPrice);
            System.out.printf("Price per person for one hour: %.2f%n", nightPrice);
        }
        System.out.printf("Total cost of the visit: %.2f", pricePerPerson * persons);
    }
}
