package pattern;

/**
 * Created by User on 11.05.2015.
 */
public class MySingelton {
    private static MySingelton ourInstance = new MySingelton();

    public static MySingelton getInstance() {
        return ourInstance;
    }

    private MySingelton() {
    }
}
