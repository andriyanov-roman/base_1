/**
 * Created by Programmer on 29.06.2015.
 */
public class Quest5 {

    public Quest5() {
        System.out.println("Default");
    }

    public Quest5(int i, int j) {
        this();
        System.out.println("With i");
    }

    public Quest5(int i) {
        this(i,i);
        System.out.println("With two i");
    }
}
