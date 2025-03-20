package lesson_3;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main.Month();
        Main.Wood();
        Main.block();
        Main.getTemp();
        Main.getNumber();
        Main.getFor();
        Main.getOne();
        Main.getScanner();
        Main.gum();
        Main.getSeven();
        Main.getTwo();
        Main.getThee();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }


    public static void Month() {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to month1");
        int month = input.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("there is no such month of the year , enter the number 1-12");
        }
    }


    public static void Wood() {
        System.out.println("###################################");
        Scanner getScanner = new Scanner(System.in);
        System.out.println("welcome to month2");
        int month = getScanner.nextInt();
        if (month == 1 || month == 2 || month == 3) {
            System.out.println("Winter");
        }
        if (month == 4 || month == 5 || month == 6) {
            System.out.println("spring");
        }
        if (month == 7 || month == 8 || month == 9) {
            System.out.println("summer");
        }
        if (month == 10 || month == 11 || month == 12) {
            System.out.println("autumn");

        }
    }

    public static void block() {
        System.out.println("###################################");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        if ((n % 2) == 0) {
            System.out.println(" четное");
        } else {
            System.out.println(" нечетное");
        }
    }

    public static void getTemp() {
        System.out.println("###################################");
        System.out.print("введите температуру: ");
        double temp = input().nextDouble();

        if (temp > -5) {
            System.out.println("тепло");
        } else if (temp <= -5 && temp > -20) {
            System.out.println("нормально");
        } else {
            System.out.println("холодно");
        }
    }

    public static void getNumber() {
        System.out.println("###################################");
        System.out.println("ведите число");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        if ((n % 2) == 0) {
            System.out.println(" четное");
        } else {
            System.out.println(" нечетное");
        }
    }

    public static void gum() {
        System.out.println("welcome to the coler");
        int numColor = input().nextInt();

        switch (numColor) {
            case 1:
                System.out.println("красный");
                break;
            case 2:
                System.out.println("голубой");
                break;
            case 3:
                System.out.println("фиолетовы");
                break;
            case 4:
                System.out.println("оранжевый");
                break;
            case 5:
                System.out.println("синий");
                break;
            case 6:
                System.out.println("желтый");
                break;
            case 7:
                System.out.println("оранжевый");
                break;
            case 8:
                System.out.println("зеленый");
                break;
            default:
                System.out.println("такого цвета нету");

        }

    }


    public static void getFor() {
        System.out.println("###################################");
        for (int numbers = 1; numbers <= 99; numbers++) {
            System.out.println(numbers);
        }
    }

    public static void getOne() {
        System.out.println("###################################");
        for (int numbers = 5; numbers >= 1; numbers--) {
            System.out.println(numbers);
        }
    }

    public static void getScanner() {
        Scanner g = new Scanner(System.in);
        System.out.println("введите число для суммирования");
        int x = g.nextInt();
        int y = 0;
        for (int num = 1; num <= x; num++) {
            y += num;
        }
        System.out.println("Ваша сумма " + y);
    }

    public static void getSeven() {
        System.out.println("###################################");
        int numbers = 0;
        while (numbers <= 13) {
            numbers++;
            System.out.println(7 * numbers);
        }
    }

    public static void getTwo() {
        System.out.println("###################################");
        for (int numbers = 0; numbers <= 10; numbers++) {
            System.out.println(0 - 5 * numbers);
        }
    }

    public static void getThee() {
        System.out.println("###################################");
        for (int numbers = 10; numbers <= 20; numbers++) {
            System.out.println(numbers * numbers);
        }
    }
}
