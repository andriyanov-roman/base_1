package Arrays;

/**
 * Created by Stas on 07.03.2015.
 */
public class ArrayChoiceMinMaxIndex {
    public static void main(String[] args) {
        int i, k, n, max = 0, min = 100, maxi = 0, mini = 0, sum = 0;
        int[] mas = {5, 6, 6, 4, 5, 12, 1, 3, 55, 88, 56, 77};

        for (i = 0; i < mas.length; i++)
            System.out.print("  " + mas[i]);
        System.out.println();

        for (i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                mini = i;
            }

            if (mas[i] > max) {
                max = mas[i];
                maxi = i;
            }
        }
        System.out.print("Максимальный элемент: " + max + " с индексом: " + maxi
                + " Минимальный элемент: " + min + " с индексом: " + mini);
        System.out.println();



        if (mini < maxi) {
            for (i = mini + 1; i < maxi; i++)

                sum += mas[i];

        } else {
            for (i = maxi + 1; i < mini; i++)

                sum += mas[i];

        }
        System.out.println(sum);
    }
}
