package Cycles;

/**
 * Created by Stas on 07.03.2015.
 */
public class CycleMaybeFactorial {
    public static void main(String args[]) {
        int a = 5;//example

        int result = 1;
        for (int i = 2; i <= a; i++)
            result *= i;
        System.out.println(result);
        if (a == 0 || a == 1)
            System.out.println(result);

        System.out.println("Bye!");
    }
}
