package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int pens = Integer.parseInt (scanner.nextLine());
        int markers = Integer.parseInt (scanner.nextLine());
        int litters = Integer.parseInt (scanner.nextLine());
        int discount = Integer.parseInt (scanner.nextLine());
        double totalSum = pens * 5.80 + markers * 7.20 + litters * 1.20;
        double overallSum = totalSum - (totalSum * (discount * 1.0 / 100));
        System.out.println(overallSum);

    }
}
