package WhileLoop.exercises;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        String playerName = "";
        int maxGoals = Integer.MIN_VALUE;
        boolean hetTrick = false;
        while (!player.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                playerName = player;
            }
            if (goals >= 3) {
                hetTrick = true;
            }
            if (goals >= 10) {
                break;
            }
            player = scanner.nextLine();
            }
        System.out.printf("%s is the best player!%n", playerName);

        if (hetTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }
        }
    }
