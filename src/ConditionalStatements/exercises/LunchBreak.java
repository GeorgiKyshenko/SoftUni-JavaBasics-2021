package ConditionalStatements.exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int serialTime = Integer.parseInt(scanner.nextLine());
        int restTime = Integer.parseInt(scanner.nextLine());
        double lunchTime = restTime / 8.0;
        double rest = restTime / 4.0;
        double overallTime = serialTime + lunchTime + rest;
        if (overallTime <= restTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(restTime - overallTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, Math.ceil(overallTime - restTime));
        }


    }
}
