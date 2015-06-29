import java.util.HashSet;
import java.util.Set;

/**
 * Created by PC XP on 27.06.15.
 */
public class HashCodeTest {

    static private int integer;
    static private String string = " ";
    static private int anInt;

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + anInt;
        result = prime * result + integer;
        result = prime * result + string.hashCode();
        return result;
    }

    public static void main(String[] args) {
        HashCodeTest hashCodeTest = new HashCodeTest();
        System.out.println(hashCodeTest.hashCode());
        hashCodeTest.integer = 100;
        hashCodeTest.string = "test";
        hashCodeTest.anInt = 3687;
        System.out.println(hashCodeTest.hashCode());


            /*double a = 5675.9970005;
            double b = 37.2000000012;
            a=a+b;
            b = a-b;
            a=a-b;
            System.out.println("a" + " " + a);
            System.out.println("b" + " " + b);

            double x = 5675.9970005;
            double y= 37.2000000012;
            x = x*y;
            y = x/y;
            x=x/y;
            System.out.println("x" + " " + x);
            System.out.println("y" + " " + y);*/

    }
}
