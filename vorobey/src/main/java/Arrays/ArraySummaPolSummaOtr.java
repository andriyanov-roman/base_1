package Arrays;


public class ArraySummaPolSummaOtr {
    public static void main(String[] args) {
        int i, iPoloj, summaOtrizatel = 0;
        int[] mas = {-4, -5, 1, 6, -7, 0, -1, 12, 3, 7};

        for (i = 0; i < mas.length; i++)
            System.out.printf("%4d", mas[i]);
        System.out.println();

        for (i = 0; i < mas.length; i++) {
            if (mas[i] >= 0)
                System.out.printf("%6d", i);//Ввод положительных элементов
        }

        for (i = 0; i < mas.length; i++) {
            if (mas[i] < 0)
                summaOtrizatel += mas[i];// Вывод суммы отрицательных элементов

        }
        System.out.println();
        System.out.print("Сумма отрицательных элементов: " + summaOtrizatel);

    }

}


