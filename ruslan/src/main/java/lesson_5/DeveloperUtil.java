package lesson_5;

import entity.Developer;

import java.util.ArrayList;

/**
 * Created by user on 28.03.2015.
 */
public class DeveloperUtil {
    public static ArrayList<Developer> getDeveloper() {
        Developer s1 = new Developer("","",5, "");
        Developer s2 = new Developer("","",7, "");
        Developer s3 = new Developer("","",9, "");
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(s1);
        developers.add(s2);
        developers.add(s3);
        return developers;
    }
}
