package lesson_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Homehork {
    public static void main(String[] args) {
//        checkNumberInArray();
        showIntArray();
    }

    public static void checkNumberInArray() {
        Scanner scanner = new Scanner(System.in);

        int[] originalArray = {1, 2, 3, 4, 5, 3, 6, 7, 3, 8};

        System.out.print("Исходный массив: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Введите число для удаления: ");
        int numberToRemove = scanner.nextInt();

        // Используем ArrayList для удобного удаления элементов
        ArrayList<Integer> list = new ArrayList<>();
        boolean found = false;

        // Копируем элементы в ArrayList, пропуская numberToRemove
        for (int num : originalArray) {
            if (num == numberToRemove) {
                found = true;
            } else {
                list.add(num);
            }
        }

        if (!found) {
            System.out.println("Число " + numberToRemove + " не найдено в массиве.");
            return;
        }

        // Преобразуем ArrayList обратно в массив
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }

        System.out.print("Новый массив: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static void showIntArray() {
                // Создаем массив целых чисел
                int[] numbers = {5, 12, 8, 3, 19, 7, 25, 10, 14};

                Scanner scanner = new Scanner(System.in);

                System.out.print("Введите число для поиска: ");
                int target = scanner.nextInt();


                boolean found = false;


                for (int number : numbers) {
                    if (number == target) {
                        found = true;
                        break;
                    }
                }

                // Выводим результат
                if (found) {
                    System.out.println("Число " + target + " входит в массив.");
                } else {
                    System.out.println("Число " + target + " не входит в массив.");
                }

                // Закрываем Scanner
                scanner.close();
            }



    //    Создайте и заполните массив случайным числами и выведете
//    максимальное, минимальное и среднее значение.
//    Для генерации случайного числа используйте метод Math.random().
//    Пусть будет возможность создавать массив произвольного размера.
//    Пусть размер массива вводится с консоли.
    public static void minMidMax() {
        int d = 10;
        double[] arr = new double[d];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        double max = arr[0];
        double min = arr[0]; 
        double mid = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
            mid += arr[i] / arr.length;
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("mid " + mid);


    }

    //    Создайте 2 массива из 5 чисел.
//    Выведите массивы на консоль в двух отдельных строках.
//    Посчитайте среднее арифметическое элементов каждого массива и
//    сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
    public static void arrFive() {
        int arr[] = {5, 8, 12, -18, -54};
        double mid = 0;
        for (int x : arr) {
            mid += x;
        }
        double sum = mid / arr.length;
        System.out.println("среднее арифметическое чисел равно первого массива равна: " + sum);
        int[] arrTwo = {5, 3, 14, 2, 1200};
        double avg = 0;
        for (int x : arrTwo) {
            avg += x;
        }
        double sumTwo = avg / arrTwo.length;
        System.out.println("среднее арифметическое чисел равно: " + sumTwo);
        int numbs;
        if (sum > sumTwo) {
            System.out.println("сумма первого массива больше чем второго " + sum);
        } else if (sumTwo > sum) {
            System.out.println("сумма второго массива больше чем первого " + sumTwo);
        } else {
            System.out.println("они равны");
        }


    }
}






