package lesson_6;

import java.util.Scanner;

public class DoCreditCard {
    public static void main(String[] args) {
        chargeMoney();
        withdrawMoney();
    }

    public static void chargeMoney() {

        CreditCard cardOne = new CreditCard();
        cardOne.accountBalance = 100;
        cardOne.accountNumber = 2222_2222_2222_2222L;

        System.out.println("Cколько вы хотели бы положить денег на карту: ");
        Scanner scanner = new Scanner(System.in);
        cardOne.transaction = scanner.nextInt();

        if (cardOne.transaction > 0) {
            cardOne.accountBalance += cardOne.transaction;
        } else if (cardOne.transaction < 0) {
            System.out.println("вы не можете пополнить карту отрицательным числом");
        }

        CreditCard cardTwo = new CreditCard();
        cardTwo.accountBalance = 10;
        cardTwo.accountNumber = 1111_1111_1111_1111L;

        System.out.println("Сколько вы хотели бы положить денег на карту:");
        Scanner scan = new Scanner(System.in);
        cardTwo.transaction = scan.nextInt();

        if (cardTwo.transaction > 0) {
            cardTwo.accountBalance += cardTwo.transaction;
        } else if (cardTwo.transaction < 0) {
            System.out.println("вы не можете пополнить карту отрицательным числом.");
        }
        System.out.println("баланс карты " + cardOne.accountNumber + " " + cardOne.accountBalance);
        System.out.println("баланс карты " + cardTwo.accountNumber + " " + cardTwo.accountBalance);
    }

    public static void withdrawMoney() {
        CreditCard cardThree = new CreditCard();
        cardThree.accountBalance = 198;
        cardThree.accountNumber = 0000_0000_0000_0000L;

        System.out.println("сколько вы хотите обналичить денег: ");
        Scanner sc = new Scanner(System.in);
        cardThree.transaction = sc.nextInt();

        if (cardThree.accountBalance >= cardThree.transaction) {
            cardThree.accountBalance -= cardThree.transaction;
        } else if (cardThree.accountBalance < cardThree.transaction) {
            System.out.println("вы не можете пополнить карту отрицательным числом.");
        }
        System.out.println("баланс карты" + " " + cardThree.accountBalance);
    }
}