package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percents = Double.parseDouble(scanner.nextLine());
        double volumeInLiters = length * width * height * 0.001;
        double overallLiters = volumeInLiters - (volumeInLiters * (percents / 100));
        System.out.println(overallLiters );

    }
}
