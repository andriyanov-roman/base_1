package lessons.recursion;

/**
 * Created by Programmer on 15.06.2015.
 */
public class RecursionTest {
    private static int[] array = {1, 2, 3, 4};

    public static void main(String[] args) {
        int i = 0;
        showArray(i);
    }
    public static void showArray (int i){
        if (i<array.length){
            System.out.println(array[i]);
            i++;
            showArray(i);
        }
    }
}
