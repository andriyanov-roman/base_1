package home_work.array;


import java.util.Scanner;

public class ArrayMethods {

    public static void arrayStart() {
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Чтобы увидеть данный массив,нажмите 1");
        System.out.println("2.Чтоб вывести в консоль половину массива, среднеарифметическое которых является наибольшим,нажмите 2");
        System.out.println("3.Чтобы найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве,нажмите 3");
        System.out.println("4.Чтобы вывести на печать все числа до нуля включительно,нажмите 4");
        System.out.println("5.Чтобы вывести массив,в котором заменены местами два наибольших элемента  с первым и последним,нажмите 5");
        System.out.println("6.Чтобы вывести  на экран элементы одномерного массива, которые расположены до минимального элемента всего массива,нажмите 6");
        System.out.println("7.Чтобы вывести сумму всех чисел находящихся между минимальным и максимальным числом в массиве,нажмите 7");
        System.out.println("8.Чтобы вывести  в консоль половину массива в которой находиться наименьшее число массива,нажмите 8");
        System.out.println("9.Чтобы вывести в консоль массив,элементы которого,попадающие в промежуток о -5 до 5,перемещены в конец,нажмите 9");
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    arrayShow(array);
                    break;
                case "2":
                    arraySummaLeftSummaRight(array);
                    break;
                case "3":
                    arraySummaOtrizal(array);
                    break;
                case "4":
                    arrayBeforeNull(array);
                    break;
                case "5":
                    arrayBigMaxIbigImax();
                    break;
                case "6":
                    arrayBeforeMin(array);
                    break;
                case "7":
                    arraySummaBeetwinMinMax(array);
                    break;
                case "8":
                    arrayMinBeforeHalf(array);
                    break;
                case "9":
                    arrayChange(array);
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case!");


            }
        }


    }

    public static void arrayBeforeNull(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int k = 0; k < i; k++)// Вывод массива елементов,находяшихся перед 0
                    System.out.printf("%5d", array[k]);
            }

        }


    }

    public static void arrayChange(int[] array) {
        int i;

        int a = -5, b = 5;
        int q = array[0];
        int count = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                q = array[i];
                array[i] = array[0 + count];
                array[0 + count] = q;
                count += count;
            }
        }
        for (i = array.length - 1; i >= 0; i--) {
            System.out.printf("%5d", array[i]);
        }


    }

    public static void arrayBeforeMin(int[] array) {

        int k, min = 500;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        for (int i = 0; i < array.length; i++) {// Вывод массива до минимального элемента
            if (array[i] == min) {
                for (k = 0; k < i; k++)
                    System.out.printf("%5d", array[k]);
            }
        }


    }

    public static void arrayMinBeforeHalf(int[] array) {
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


    public static void arrayBigMaxIbigImax() {
        int[] array = {-2, 5, 7, 0, -2, -7, 10, 1, 23, 3};
        max(array);
        maxAfterMax(array);

    }

    public static void arraySummaLeftSummaRight(int[] array) {
        int i, summaLeft = 0, summaRight = 0;
        double saLeft = 0, saRight = 0;

        for (i = 0; i < array.length / 2; i++) {
            summaLeft += array[i];
            saLeft = (double) (summaLeft += array[i]) / (array.length);// СА левой части
            System.out.printf("%5d", array[i]);
        }

        System.out.println();

        for (i = array.length / 2; i < array.length; i++) {
            summaRight += array[i];

            saRight = (double) (summaRight += array[i]) / (array.length);// СА правой части

            System.out.printf("%5d", array[i]);
        }

        System.out.println();
        System.out.println(saLeft);
        System.out.println(saRight);
        System.out.println();

        if (saLeft > saRight) { // Если СА левой части больше СА правой

            for (i = 0; i < array.length / 2; i++)
                System.out.printf("%5d", array[i]);
        } else {
            for (i = array.length / 2; i < array.length; i++)


                System.out.printf("%5d", array[i]);
        }

    }

    public static void arraySummaOtrizal(int[] array) {
        int i, iPoloj, summaOtrizatel = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] >= 0)
                System.out.printf("%6d", i);//Ввод положительных элементов
        }

        for (i = 0; i < array.length; i++) {
            if (array[i] < 0)
                summaOtrizatel += array[i];// Вывод суммы отрицательных элементов

        }
        System.out.println();
        System.out.print("Сумма отрицательных элементов: " + summaOtrizatel);

    }

    public static void arraySummaBeetwinMinMax(int[] array) {
        int i, k, n, max = 0, min = 100, maxi = 0, mini = 0, sum = 0;

        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                mini = i;
            }

            if (array[i] > max) {
                max = array[i];
                maxi = i;
            }
        }
        System.out.print("Максимальный элемент: " + max + " индекс: " + maxi
                + " Минимальный элемент: " + min + " индекс: " + mini);
        System.out.println();


        if (mini < maxi) {
            for (i = mini + 1; i < maxi; i++)

                sum += array[i];

        } else {
            for (i = maxi + 1; i < mini; i++)

                sum += array[i];

        }
        System.out.println(sum);

    }

    public static void arrayShow(int[] array) {

        for (int i = 0; i < array.length; i++)
            System.out.printf("%5d", array[i]);

    }

    public static void min(int[] array) {
        int min = 500, imin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }

        }

    }

    public static void max(int[] array) {
        int max = 0, imax = 0, tmp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                imax = i;

            }
        }
        tmp = array[array.length - 1];
        array[array.length - 1] = array[imax];
        array[imax] = tmp;

    }

    public static void maxAfterMax(int[] array) {
        int max = 0, imax = 0, tmp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
                imax = i;

            }
        }
        tmp = array[0];
        array[0] = array[imax];
        array[imax] = array[0];
        for (int i = 0; i < array.length; i++)
            System.out.printf("%5d", array[i]);


    }

    public static void summaLeft(int[] array) {
        int i, summaLeft = 0;
        double saLeft = 0;

        for (i = 0; i < array.length / 2; i++) {
            summaLeft += array[i];
            saLeft = (double) (summaLeft += array[i]) / (array.length);// СА левой части
            System.out.printf("%5d", array[i]);
        }
    }

    public static void summaRight(int[] array) {
        int i, summaRight = 0;
        double saRight = 0;
        for (i = array.length / 2; i < array.length; i++) {
            summaRight += array[i];
            saRight = (double) (summaRight += array[i]) / (array.length);// СА правой части
            System.out.printf("%5d", array[i]);
        }

    }
}
