package lesson_4;

import java.util.Scanner;

public class Homehork {
    public static void main(String[] args) {
        arrFive();
    }

    public static void checkNumberInArray() {
        // Создать одномерный массив
        // Заполнить его определенными числами
        // Потом использовать класс Сканнер и попросить у пользователя ввести любое число
        // Проверить есть ли это число в массиве и уже вывести массив без этого числа
        // Создать новый массив (желательно)

        int[] initialValues = new int[6];

        for (int index = 0; index < initialValues.length; index++) {
            System.out.print("You must enter " + initialValues.length + " integer numbers. " +
                    "initialValues[" + (index + 1) + "]: ");
            initialValues[index] = input().nextInt();
        }

        // КАК МОЖНО ОТСОРТИРОВАТЬ МАССИВ
        // Вначале отсортировать массив по возрастанию, -9, 0, 5, 10
        // Использовать вложенный в класс Arrays бинарный пойск
        // Бинарный пойск работает лишь в отсортированных массивах

        System.out.print("Please, enter an integer number and we will check whether such value exists in the array: ");
        int value = input().nextInt();
        int counter = 0;

        for (int initialValue : initialValues) {
            if (initialValue == value) {
                // Подсчитывать количество совпадений в массиве
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("We couldn't find any matches in the array. There is no need for changes.");
            showIntArray(initialValues);
        } else {
            if (counter < initialValues.length) {
                int[] newArray = new int[initialValues.length - counter];

                for (int index = 0, newIndex = 0; index < initialValues.length; index++) {
                    if (initialValues[index] != value) {
                        newArray[newIndex] = initialValues[index];
                        newIndex++;
                    }
                }

                showIntArray(newArray);
            } else {
                System.out.println("You have entered a value that matches all elements of the array.");
                System.out.println("So far, there are no elements anymore.");
            }
        }
    }


    public static void showIntArray(int[] initialValues) {
        for (int index = 0; index < initialValues.length; index++) {
            System.out.println("initialValues[" + index + "]: " + initialValues[index]);
        }
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
            if (sum>sumTwo){
            System.out.println("сумма первого массива больше чем второго "  + sum);}
            else if (sumTwo > sum){
            System.out.println("сумма второго массива больше чем первого " + sumTwo);}
            else {
            System.out.println("они равны");}


    }


        public static Scanner input () {
            return new Scanner(System.in);
        }
    }






