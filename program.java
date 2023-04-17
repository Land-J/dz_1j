package dz_1;
import java.util.Arrays;

public class program {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2104));

        int[] arr1 = createArray(5, 3);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        switchArray(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyArray(arr3);
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = getArrayWithDiagonals(10);
        System.out.println(Arrays.deepToString(arr4).replace("], ", "]\n"));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int z = a + b;
        return 10 <= z && z <= 20;
    }

    private static boolean isPositive(int x) {
        return x > 0;
    }

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но
        // делится на 400
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    private static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    static void switchArray(int[] array) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
        // заменить 0 на 1, 1 на 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
    }

    static void multiplyArray(int[] array) {
        // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
        // циклом, и числа меньшие 6 умножить на 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    static int[][] getArrayWithDiagonals(int size){
        // 3. Создать квадратный двумерный целочисленный массив (количество строк и
        // столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
        // только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы
        // таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        // Также заполнить элементы побочной диагонали

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }

        return array;
    }



}