import org.junit.Test;

/**
 * Created by User on 15.06.2015.
 */
public class RecursionTest {
    private int [] array = {1,2,3,4,5,6,7,8,9,10};
    @Test
    public void testRecursion (){
        int i =array.length/2 - 1;
        showArray(i);
    }
    public void showArray (int i){
        if(i<array.length){
            System.out.println(array[i]);
            i--;
            showArray(i);//

        }
    }
}
