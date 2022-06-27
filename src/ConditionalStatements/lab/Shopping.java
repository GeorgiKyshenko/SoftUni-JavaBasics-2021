package ConditionalStatements.lab;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble (scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        int videoPrice = 250;
        double processorPrice = ((video * videoPrice) * 0.35);
        double ramPrice = ((video * videoPrice) * 0.10);
        double overallSum = video * videoPrice + processor * processorPrice + ram * ramPrice;
        // Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка. Важат следните цени:
        if (video > processor) {
             overallSum = overallSum - overallSum * 0.15;
        }
        if (budget >= overallSum) {
            System.out.printf("You have %.2f leva left!",budget - overallSum);
        }
         else {
            System.out.printf("Not enough money! You need %.2f leva more!", overallSum - budget);
       }

    }
}
