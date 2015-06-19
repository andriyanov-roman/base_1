import org.junit.Test;

/**
 * Created by Programmer on 19.06.2015.
 */
public class RecursionTest {

        private int [] array = {1,2,3,4,5,6,7,8,9,10};
        int i= array.length/2-1;
        int k = array.length/2;
        @Test
        public void testRecursion (){

            //showArray();
            //showArray2();
            // showHalf(4);
            //System.out.println(factorial(6));
            factorial(6);

        }
        public void showArray (){
            if(i>=0){
                System.out.println(array[i]);
                i--;
                showArray();//

            }
        }
        public void showArray2 (){
            if(k<array.length){
                System.out.println("+array[k]: "+array[k]);
                k++;
                showArray2();//

            }
        }
        public void showHalf(int i) {
            if (i < array.length / 2) {
                System.out.print(array[i] + ",");
                i++;
                showHalf(i);
            }
            i++;
            System.out.print(array[i] + ",");
        }

        public int  factorial(int n) {
            if (n == 1 || n==0 ) {
                return 1;

            } else {

                return n * factorial(n-1);

            }

        }


}
