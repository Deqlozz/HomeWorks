package lesson_10;

import java.util.Scanner;

import static lesson_10.DocumentNumber.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = checkInputNumber(scanner);
        String y = checkInputSymbol(scanner);

        String strX = String.valueOf(x);
        String newString = strX + strX + strX + strX + "-" +
                y + y + y + "-" +
                strX + strX + strX + strX + "-" +
                y + y + y + "-" +
                strX + y + strX + y;

        System.out.println("Original Document Number is : " + newString);

        getFourNumbers(newString);
        replaceSymbols(newString);
        getOnlySymbols(newString);
        checkContainsSymbols(newString);
        checkStartNumber(newString);
        checkEndNumber(newString);
    }

    public static int checkInputNumber(Scanner scanner) {
        int x;
        do {
            System.out.println("Enter x value, where x - positive integer (1-9): ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next();
            }
            x = scanner.nextInt();
            scanner.nextLine(); // clear \n
        } while (!(x > 0 && x < 10));
        return x;
    }

    public static String checkInputSymbol(Scanner scanner) {
        String y;
        do {
            System.out.println("Enter y value, where y - letter: ");
            y = scanner.nextLine();
        } while (!(y.length() == 1 && Character.isLetter(y.charAt(0))));
        return y;
    }
}