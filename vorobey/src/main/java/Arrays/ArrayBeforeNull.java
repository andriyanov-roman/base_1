package Arrays;

/**
 * Created by Stas on 07.03.2015.
 */
public class ArrayBeforeNull {
    public static void main(String[] args) {
        int i, k;
        int[] mas = {1, 2, 3, 4, 0, 5, 6, 7, 8};
        for (i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                for (k = 0; k < i; k++)// Вывод массива елементов,находяшихся перед 0
                    System.out.print(" " + mas[k]);
            }

        }

    }
}
