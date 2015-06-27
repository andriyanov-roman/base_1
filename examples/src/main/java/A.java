/**
 * Created by Programmer on 20.06.2015.
 */
public class A {
    int i;
    int b;

    protected static void doSomething(String s) {

    }

    static void doSomething(String s, String str) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;

        A a = (A) o;

        if (i != a.i) return false;
        return b == a.b;

    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + b;
        return result;
    }
}
