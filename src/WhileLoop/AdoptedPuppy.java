package WhileLoop;

import java.util.Scanner;

public class AdoptedPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodInKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int foodInGr = foodInKg * 1000;
        int sumFood = 0;
        while (!command.equals("Adopted")) {
            int food = Integer.parseInt(command);
            sumFood += food;
            command = scanner.nextLine();
        }
        if (sumFood <= foodInGr){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGr - sumFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.",sumFood - foodInGr);
        }
    }
}
