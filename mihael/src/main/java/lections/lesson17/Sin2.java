package lections.lesson17;

/**
 * Created by Администратор on 11.05.2015.
 */
public class Sin2 {
    private Sin2(){}

    private static Sin2 sin;
    public  static Sin2 getInstance(){
        if ((sin==null)){
            sin = new Sin2();
        }
        return sin;
    }
}
