package FirstStepsInCoding.moreExercises;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int b1 = Integer.parseInt (scanner.nextLine());
        int b2 = Integer.parseInt (scanner.nextLine());
        int h = Integer.parseInt (scanner.nextLine());
        double trapArea = (b1 + b2) * h / 2.0;
        System.out.printf("%.2f", trapArea);
        // командата за избиране на цифра след десетичният е "%.2f",
        // ако искаме 5 цифри след десетичният знак е "%.5f",



    }
}
