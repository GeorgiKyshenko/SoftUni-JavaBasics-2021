package Exam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int location = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= location; i++) {
            double averageGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double goldSum = 0.0;
            for (int k = 1; k <= days; k++) {
                double goldPerDay = Integer.parseInt(scanner.nextLine());
                goldSum += goldPerDay;
            }
            double overallGold = goldSum / days;
            if (overallGold >= averageGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", overallGold);
            } else  {
                System.out.printf("You need %.2f gold.", averageGold - overallGold);
            }
        }
    }
}
