package lessons.l18042015;

/**
 * Created by user on 18.04.2015.
 */
public interface IFly {
    void iCanFly();
    default  int flyDefault() {
        System.out.println();
        return 0;
    }
}
