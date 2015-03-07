package Arrays;


public class ArrayChange {
    public static void main(String[] args) {
        int i;
        int[] mas = {4, -5, 10, 3, -3, -7, 26, -12, 2, 0};
        for (i = 0; i < mas.length; i++)
            System.out.printf("%5d", +mas[i]);
        System.out.println();


        int a = -5, b = 5;
        int q = mas[0];
        int count = 0;
        for (i = 0; i < mas.length; i++) {
            if (mas[i] >= a && mas[i] <= b) {
                q = mas[i];
                mas[i] = mas[0 + count];
                mas[0 + count] = q;
                count += count;
            }
        }
        for (i = mas.length - 1; i >= 0; i--) {
            System.out.printf("%5d", mas[i]);
        }
    }
}
