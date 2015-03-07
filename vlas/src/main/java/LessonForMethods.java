/**
 * Created by user on 16.12.2014.
 */
public class LessonForMethods {
    public static void main(String[] Args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 76, 76};
        int[][] matrix = {
                {1, 4, 6, 8},
                {1, 6, 34, 6},
                {1, 7, 5, 2, 7}
        };
        ChangeMinMax(array);
        countDuplicates(array);
    }

    public static void ChangeMinMax(int[] array) {
    }

    public static void countDuplicates(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter == 1) {
            } else {
                System.out.println(array[i] + " " + counter);
            }
            counter = 0;
        }
    }
}

