package Arrays;


public class ArrayMinBeforeHalf {
    public static void main(String[] args) {
        int i, imin = 0, min = 550;

        int[] mas = new int[10];
        for (i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 51);
            System.out.printf("%5d", mas[i]);
        }
        System.out.println();
        for (i = 0; i < mas.length; i++) {
            if (mas[i] < min) { // Нахождение минимального элемента
                min = mas[i];
                imin = i;
            }
        }

        if (i < mas.length / 2) {
            for (i = 0; i < mas.length / 2; i++) {
                System.out.printf("%5d", mas[i]);
            }
        } else {
            for (i = mas.length / 2; i < mas.length; i++)
                System.out.printf("%5d", mas[i]);

        }

    }

}
