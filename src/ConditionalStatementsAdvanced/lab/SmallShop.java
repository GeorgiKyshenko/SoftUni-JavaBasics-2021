package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
        if (product.equals("coffee")) {
            if (city.equals("Sofia")) {
                System.out.println(number * 0.50);
            } else if (city.equals("Plovdiv")) {
                System.out.println(number * 0.40);
            } else if (city.equals("Varna")) {
                System.out.println(number * 0.45);
            }
        } else if (product.equals("water")) {
            if (city.equals("Sofia")) {
                System.out.println(number * 0.80);
            } else if (city.equals("Plovdiv")) {
                System.out.println(number * 0.70);
            } else if (city.equals("Varna")) {
                System.out.println(number * 0.70);
            }
        } else if (product.equals("beer")) {
            if (city.equals("Sofia")) {
                System.out.println(number * 1.20);
            } else if (city.equals("Plovdiv")) {
                System.out.println(number * 1.15);
            } else if (city.equals("Varna")) {
                System.out.println(number * 1.10);
            }
        } else if (product.equals("sweets")) {
            if (city.equals("Sofia")) {
                System.out.println(number * 1.45);
            } else if (city.equals("Plovdiv")) {
                System.out.println(number * 1.30);
            } else if (city.equals("Varna")) {
                System.out.println(number * 1.35);
            }
        } else if (product.equals("peanuts")) {
            if (city.equals("Sofia")) {
                System.out.println(number * 1.60);
            } else if (city.equals("Plovdiv")) {
                System.out.println(number * 1.50);
            } else if (city.equals("Varna")) {
                System.out.println(number * 1.55);
            }
        }
    }
}
