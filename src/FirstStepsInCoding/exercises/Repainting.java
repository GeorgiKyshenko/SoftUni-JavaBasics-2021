package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt (scanner.nextLine());
        int littersPaint = Integer.parseInt (scanner.nextLine());
        int thinner = Integer.parseInt (scanner.nextLine());
        int workPerHours = Integer.parseInt (scanner.nextLine());
        double bonusMats = (littersPaint *  1.10) * 14.50 + (nylon + 2) * 1.50 + (thinner * 5.00) + 0.40;
        double workersSum = bonusMats * 0.30 * workPerHours;
        double total = workersSum + bonusMats;
        System.out.println( total);



    }
}
