package lections.lesson17;

/**
 * Created by Programmer on 11.05.2015.
 */
public class Singleton {
    private static  Singleton instance;
    private String name;
    private Singleton(){};
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
            instance.name="Test"; // mojno li izvne izmenit name?
        }
        return  instance;
    }
}
