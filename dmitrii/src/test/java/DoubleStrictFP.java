import org.junit.Test;

/**
 * Created by Programmer on 27.06.2015.
 */
public class DoubleStrictFP {
    @Test
    public void doSmthg (){
        System.out.println(3.14E+03);
        Double d = testDouble();
        System.out.println(d);
    }
    public static  strictfp double testDouble () {
        return 1/3;
    }
}
