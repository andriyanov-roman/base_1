package array;


import java.util.Scanner;

public class ArrayMethods {
    public static void arrayStart() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;


            }
        }


    }

    public static void arrayBeforeNull() {
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int k = 0; k < i; k++)// Вывод массива елементов,находяшихся перед 0
                    System.out.print(" " + array[k]);
            }

        }


    }

    public static void arrayChange() {


    }

    public static void arrayMin() {
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};
        int k, min = 500;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        for (int i = 0; i < array.length; i++) {// Вывод массива до минимального элемента
            if (array[i] == min) {
                for (k = 0; k < i; k++)
                    System.out.printf("%4d", array[k]);
            }
        }


    }

    public static void arrayMinBeforeHalf() {
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};
        int i, imin = 0, min = 500;

        for (i = 0; i < array.length; i++) {
            if (array[i] < min) { // Нахождение минимального элемента
                min = array[i];
                imin = i;
            }
        }

        if (i < array.length / 2) {
            for (i = 0; i < array.length / 2; i++) {
                System.out.printf("%5d", array[i]);
            }
        } else {
            for (i = array.length / 2; i < array.length; i++)
                System.out.printf("%5d", array[i]);

        }

    }


    public static void arrayMinMaxIminImax() {

    }

    public static void arraySummaLeftSummaRight() {

    }

    public static void arraySummaOtrizal() {

    }

    public static void arraySummaBeetwinMinMax() {

    }

    public static void arrayShow() {
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }

    public static void min() {
        int min = 500, imin = 0;
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }

        }

    }
}
