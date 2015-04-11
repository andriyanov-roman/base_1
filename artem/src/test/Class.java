/**
 * Created by user on 11.04.2015.
 */
public class Class {
    private Class c = new Class("Vasya", "Vasya");
    private String a;
    private String b;

    public Class() {
    }

    private Class(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Class{" +
                "c=" + c +
                '}';
    }
}
