package base_examples;


public class MultiArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 5, 12, 5},
                {1, 3},
                {1, 5, 2, 6, 2, 6,},
                {1, 3, 6, 1, 6}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(array[0][2]);
    }
}
