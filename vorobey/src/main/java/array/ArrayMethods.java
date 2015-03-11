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

        int i, k, q, w, iBiggest = 0, iBig = 0, Biggest = 0, Big = 0;// q,w-используем как вспомогательные переменные
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};
        for (i = 0; i < array.length; i++) {
            if (array[i] > Biggest) {
                Biggest = array[i];
                iBiggest = i;
            }
        }
        System.out.println("Наибольшее число: " + Biggest
                + " и его индекс: " + iBiggest);

        for (i = 0; i < array.length; i++) {
            if (array[i] > Big && array[i] < Biggest) {
                Big = array[i];
                iBig = i;
            }
        }
        System.out.println("Второе по величине число: " + Big
                + " и его индекс:  " + iBig);

        q = array[iBiggest];
        array[iBiggest] = array[array.length - 1];
        array[array.length - 1] = q; // Использоание вспомогательных переменных
        w = array[iBig];
        array[iBig] = array[0];
        array[0] = w;
        for (i = 0; i < array.length; i++)
            System.out.print("  " + array[i]);

    }

    public static void arraySummaLeftSummaRight() {

        int i, summaLeft = 0, summaRight = 0;
        double saLeft = 0, saRight = 0;
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};

        for (i = 0; i < array.length / 2; i++) {
            summaLeft += array[i];
            saLeft = (double) (summaLeft += array[i]) / (array.length);// СА левой части
            System.out.print("  " + array[i]);
        }

        System.out.println();

        for (i = array.length / 2; i < array.length; i++) {
            summaRight += array[i];

            saRight = (double) (summaRight += array[i]) / (array.length);// СА правой части

            System.out.print("  " + array[i]);
        }

        System.out.println();
        System.out.println(saLeft);
        System.out.println(saRight);
        System.out.println();

        if (saLeft > saRight) { // Если СА левой части больше СА правой

            for (i = 0; i < array.length / 2; i++)
                System.out.print(" " + array[i]);
        } else {
            for (i = array.length / 2; i < array.length; i++)


                System.out.print(" " + array[i]);
        }

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
