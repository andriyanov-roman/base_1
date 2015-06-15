import org.junit.Test;

/**
 * Created by Programmer on 15.06.2015.
 */
public class RecursionArray {

    private  int [] array = {1,2,3,34,5,6,7,8,56,10,11,12};

    @Test
    public  void arrayPrint (){
        first(0);
    }

    public void first (int i){
        if (i> array.length/2){
            System.out.println(array[i]+".");
            i++;
            first(i);
        }
    }
}
