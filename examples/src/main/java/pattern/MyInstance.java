package pattern;

/**
 * Created by User on 11.05.2015.
 */
public class MyInstance {
    private static MyInstance instance;
    private String name;

    private MyInstance() {

    }

    public static MyInstance getInstance() {
        if (instance == null) {
            instance = new MyInstance();
            instance.name = "Test";
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
