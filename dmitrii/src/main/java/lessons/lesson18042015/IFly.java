package lessons.lesson18042015;

/**
 * Created by user on 18.04.2015.
 */
public interface IFly {
    public void iCanFly ();
    public default  int flyDefault() {
        System.out.println();
        return 0;
    }
}
