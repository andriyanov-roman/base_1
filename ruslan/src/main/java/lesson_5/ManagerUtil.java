package lesson_5;

import entity.Manager;

import java.util.ArrayList;

/**
 * Created by user on 28.03.2015.
 */
public class ManagerUtil {
    public static ArrayList<Manager> getManager() {
        Manager s1 = new Manager("","",5, "");
        ArrayList<Manager> managers = new ArrayList<>();
        managers.add(s1);
        return managers;
    }
}
