package lessons.regexp;

import java.math.BigDecimal;

/**
 * Created by Programmer on 09.05.2015.
 */
public class JavaUtilsTest {
    //как запустить прогу без Main
    /*static  {
        System.out.println(A.i);
        System.out.println("Hello!");
        System.exit(0);
    }*/

    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("20");
        BigDecimal result = bd.multiply(new BigDecimal("40.5"));
        System.out.println(result);
    }
}
