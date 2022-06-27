package ConditionalStatements.exercises;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password1 = "s3cr3t!P@ssw0rd";
        String password = scanner.nextLine();

        if (password1.equals(password)) {
            System.out.println("Welcome");

        } else{
            System.out.println("Wrong password!");
        }

    }
}
