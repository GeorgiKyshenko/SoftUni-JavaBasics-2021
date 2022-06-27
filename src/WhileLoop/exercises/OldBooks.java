package WhileLoop.exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int countBooks = 0;
        boolean isFound = false;
        while (!currentBook.equals("No More Books")) {
            if (currentBook.equals(searchedBook)) {
                isFound = true;
                break;
            }
            countBooks++;
            currentBook = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.printf("The book you search is not here! %nYou checked %d books.", countBooks);
        }


    }
}