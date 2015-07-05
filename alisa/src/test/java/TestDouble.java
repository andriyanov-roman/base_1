/**
 * Created by User on 05.07.2015.
 */
public class TestDouble {
    public static void main(String[] args) {
        double a = 45.4867000000589;
        double b = 687.69700000123;
        double c = a;
        a = b;
        b = c;
        System.out.println("a" + " " + a);
        System.out.println("b" + " " + b);
        double x= 45.4867000000589;
        double y = 687.69700000123;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("-----------------------------");
        System.out.println("x" + " " + x);
        System.out.println("y" + " " + y);
        System.out.println("-----------------------------");
        char testChar = 0x004B;
        System.out.println(a / 0);
    }

}
