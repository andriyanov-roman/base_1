package lessons.innerclasses;

/**
 * Created by user on 06.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        A temp = new A();
        A.Inner second = temp.new Inner();
        Class<?> i;
        int j = 5;
    }
}
