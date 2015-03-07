package Arrays;

/**
 * Created by Stas on 07.03.2015.
 */
public class ArrayMin {
    public static void main(String[] args) {
        int i, k, min = 500;
        int[] mas = {6, 2, 3, 4, 5, 1, 5, 6, 7, 8};
        for (i = 0; i < mas.length; i++)
            System.out.printf("%4d", mas[i]);
        System.out.println();
        for (i = 0; i < mas.length; i++) {
            if (mas[i] < min)
                min = mas[i];
        }
        for (i = 0; i < mas.length; i++) {// Вывод массива до минимального элемента
            if (mas[i] == min) {
                for (k = 0; k < i; k++)
                    System.out.printf("%4d", mas[k]);
            }
        }


    }
}

