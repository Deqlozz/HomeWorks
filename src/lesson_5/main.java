package lesson_5;

import java.util.Scanner;

public class main {
    //    Создать трехмерный массив из целых чисел.
//    С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//    заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//    задается из консоли.


    public static void main(String[] args) {
        doArray();

    }
//    Создать трехмерный массив из целых чисел.
//    С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//    заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//    задается из консоли.
private static Scanner scanner = new Scanner(System.in);

    public static int[][][] createArray() {
        return new int[][][]{
                {
                        {1, 6, 8},
                        {4, 7, 9},
                        {10, 21, 34}
                },
                {
                        {0, 3, 5}
                }
        };
    }

    public static void doArray() {
        int[][][] array = createArray();

        System.out.print("Введите число, на которое нужно увеличить каждый элемент: ");
        int increment = scanner.nextInt();

        // Увеличиваем каждый элемент массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += increment;
                }
            }
        }

        // Выводим обновленный массив
        System.out.println("\nОбновленный массив:");
        printArray(array);
    }

    public static void printArray(int[][][] arr) {
        for (int[][] twoDArray : arr) {
            for (int[] oneDArray : twoDArray) {
                for (int num : oneDArray) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


            //    Шахматная доска
//    Создать программу для раскраски шахматной доски с помощью цикла.
//    Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
//    циклам значения B(Black) или W(White). Результат работы программы:
//    W B W B W B W B
//    B W B W B W B W
//    W B W B W B W B
//    B W B W B W B W
//    W B W B W B W B
//    B W B W B W B W
//    W B W B W B W B
//    B W B W B W B W
            public static void chessBoard () {
                String[][] shapes = new String[8][8];
                for (int t = 0; t < shapes.length; t++) {
                    for (int j = 0; j < shapes[t].length; j++) {
                        if ((t + j) % 2 == 0) shapes[t][j] = "W";
                        else shapes[t][j] = "B";
                        System.out.print(shapes[t][j] + '\t');
                    }
                    System.out.print('\n');
                }

            }
}






































