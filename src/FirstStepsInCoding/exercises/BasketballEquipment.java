package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int costPerYear = Integer.parseInt (scanner.nextLine());
         double shoes = costPerYear - (costPerYear * 0.4);
         double trackSuit = shoes - ( shoes * 0.2);
         double ball = trackSuit * 0.25;
         double accessories = ball * 0.2;
         double overallSpend = costPerYear + shoes + trackSuit + ball + accessories;
        System.out.println(overallSpend);


    }
}
