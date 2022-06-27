package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double meters = Double.parseDouble (scanner.nextLine());
        double pricePerMeter = meters * 7.61;
        double discount = pricePerMeter * 0.18;
        double total = pricePerMeter - discount;
        System.out.println("The final price is: " + total + " lv.");
        System.out.println("The discount is: " + discount + " lv." );

    }
}
