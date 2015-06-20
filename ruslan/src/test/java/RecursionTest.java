import org.junit.Test;

/**
 * Created by Programmer on 15.06.2015.
 */
public class RecursionTest {
    public int[] array = {1, 2, 3, 4, 5,6};
    @Test
    public void testRecursion() {
        int i = 0;
        showArray(i);

    }

    /*private void showArray(int i) {
        if (i < array.length/2) {
            i++;
            System.out.println(i);

            showArray(i);
        }*/
    private void showArray(int i) {
        if (i  < array.length) {
           i++;
            System.out.println(i);
            showArray(i);
        }

    }


}
