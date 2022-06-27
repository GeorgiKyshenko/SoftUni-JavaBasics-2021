package FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogPacks = Integer.parseInt (scanner.nextLine());
        int catPacks = Integer.parseInt (scanner.nextLine());
        double dogPacksPrice = dogPacks * 2.50;
        int catPacksPrice = catPacks * 4;
        double overallPrice = dogPacksPrice + (catPacksPrice * 1.0);
        System.out.println(overallPrice);

    }
}
