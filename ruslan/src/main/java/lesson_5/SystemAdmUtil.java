package lesson_5;

import entity.SystemAdm;

import java.util.ArrayList;


public class SystemAdmUtil {
    public static ArrayList<SystemAdm> getSystemAdm() {
        SystemAdm s1 = new SystemAdm("","",5, "");
        ArrayList<SystemAdm> systemadms = new ArrayList<>();
        systemadms.add(s1);
        return systemadms;
    }
}
