package Arrays;

/**
 * Created by Stas on 07.03.2015.
 */
public class ArrayMinMaxIminImax {
    public static void main(String[] args) {
        int i, k, q, w, iBiggest = 0, iBig = 0, Biggest = 0, Big = 0;// q,w-используем как вспомогательные переменные

        int[] mas = {1, 2, 3, 4, 5, 12, 1, 2, 3, 0, -5, 18, 3};
        for (i = 0; i < mas.length; i++)
            System.out.print("  " + mas[i]);
        System.out.println();

        for (i = 0; i < mas.length; i++) {
            if (mas[i] > Biggest) {
                Biggest = mas[i];
                iBiggest = i;
            }

        }
        System.out.println("Наибольшее число: " + Biggest
                + " и его индекс: " + iBiggest);


        for (i = 0; i < mas.length; i++) {
            if (mas[i] > Big && mas[i] < Biggest) {
                Big = mas[i];
                iBig = i;
            }

        }
        System.out.println("Второе по величине число: " + Big
                + " и его индекс:  " + iBig);

        q = mas[iBiggest];
        mas[iBiggest] = mas[mas.length - 1];
        mas[mas.length - 1] = q; // Использоание вспомогательных переменных

        w = mas[iBig];
        mas[iBig] = mas[0];
        mas[0] = w;

        for (i = 0; i < mas.length; i++)
            System.out.print("  " + mas[i]);

    }
}
