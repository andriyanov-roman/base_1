package lections.lesson17;

/**
 * Created by Programmer on 11.05.2015.
 */
public class MySingl {
    private static MySingl ourInstance = new MySingl();

    public static MySingl getInstance() {
        return ourInstance;
    }

    private MySingl() {
    }
}
