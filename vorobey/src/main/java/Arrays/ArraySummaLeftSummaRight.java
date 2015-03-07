package Arrays;


public class ArraySummaLeftSummaRight {
    public static void main(String[] args) {
        int i, summaLeft = 0, summaRight = 0;
        double saLeft = 0, saRight = 0;

        int[] mas = {1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 3, 7};
        for (i = 0; i < mas.length / 2; i++) {
            summaLeft += mas[i];

            saLeft = (double) (summaLeft += mas[i]) / (mas.length);// СА левой части

            System.out.print("  " + mas[i]);
        }

        System.out.println();

        for (i = mas.length / 2; i < mas.length; i++) {
            summaRight += mas[i];

            saRight = (double) (summaRight += mas[i]) / (mas.length);// СА правой части

            System.out.print("  " + mas[i]);
        }

        System.out.println();
        System.out.println(saLeft);
        System.out.println(saRight);
        System.out.println();

        if (saLeft > saRight) { // Если СА левой части больше СА правой

            for (i = 0; i < mas.length / 2; i++)
                System.out.print(" " + mas[i]);
        } else {
            for (i = mas.length / 2; i < mas.length; i++)


                System.out.print(" " + mas[i]);
        }

    }

}


