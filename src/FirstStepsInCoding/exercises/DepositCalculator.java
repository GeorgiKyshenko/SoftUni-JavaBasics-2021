package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double depositSum = Double.parseDouble (scanner.nextLine());
        int depositPeriod = Integer.parseInt (scanner.nextLine());
        double yearPercent = Double.parseDouble(scanner.nextLine());
        double depSumPlusYearPer = depositSum * (yearPercent / 100) / 12;
        double overallSum = depositSum + depositPeriod * depSumPlusYearPer;
        System.out.println(overallSum);
    }
}
