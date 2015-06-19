import org.junit.Test;

/**
 * Created by User on 15.06.2015.
 */
public class RecursionTest {
    private int [] array = {1,2,3,4,5,6,7,8,9,10};
    int i =array.length/2 -1;
    int j =array.length/2;
    @Test
    public void testRecursion (){
       showFirstHalfArrayReverted();
        System.out.println();
       showSecondHalfReverted();
        System.out.println();
        System.out.println(factorial(3));
        System.out.println();

    }
   public void showFirstHalfArrayReverted (){

        if(i>=0){
            System.out.print(array[i]);
            i--;
            showFirstHalfArrayReverted();

        }
    }
   public void showSecondHalfReverted(){
        if(j<=array.length - 1){
            System.out.print(array[j]);
            j++;
            showSecondHalfReverted();
        }
    }

    public int factorial (int i){
        if( i == 0){
            return 1;
        }else{
            return i* factorial(i -1);

        }
    }


}
