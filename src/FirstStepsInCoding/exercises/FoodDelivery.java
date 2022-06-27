package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt (scanner.nextLine());
        int fishMenu = Integer.parseInt (scanner.nextLine());
        int veganMenu = Integer.parseInt (scanner.nextLine());
        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double veganMenuPrice = veganMenu * 8.15;
        double desert = (chickenMenuPrice + fishMenuPrice + veganMenuPrice) * 0.2 ;
        double total = desert + chickenMenuPrice + fishMenuPrice + veganMenuPrice + 2.5;
        System.out.println(total);

    }
}
