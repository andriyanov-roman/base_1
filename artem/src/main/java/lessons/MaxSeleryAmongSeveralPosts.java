package lessons;

import entity.employeeHeirs.Admin;
import entity.employeeHeirs.Manager;
import entity.employeeHeirs.Programist;
import homework.Methods;

import java.io.IOException;
import java.util.ArrayList;

public class MaxSeleryAmongSeveralPosts {
    public static void get() throws IOException {

        ArrayList<Admin> admins = new ArrayList<>();
        ArrayList<String[]> strings = Methods.readFromFile("artem/src/main/java/additionalFiles/positions/Admin", ":");
        for (int i = 0; i < strings.size(); i++) {
            Admin a = new Admin();
            a.setName(strings.get(i)[0]);
            a.setSecondName(strings.get(i)[1]);
            a.setSalary(Double.valueOf(strings.get(i)[2]));
            a.setPlatform(strings.get(i)[3]);
            admins.add(a);
        }
        ArrayList<Manager> managers = new ArrayList<>();
        strings = Methods.readFromFile("artem/src/main/java/additionalFiles/positions/Manager", ":");
        for (int i = 0; i < strings.size(); i++) {
            Manager m = new Manager();
            m.setName(strings.get(i)[0]);
            m.setSecondName(strings.get(i)[1]);
            m.setSalary(Double.valueOf(strings.get(i)[2]));
            m.setProjectName(strings.get(i)[3]);
            managers.add(m);
        }
        ArrayList<Programist> programists = new ArrayList<>();
        strings = Methods.readFromFile("artem/src/main/java/additionalFiles/positions/Programists", ":");
        for (int i = 0; i < strings.size(); i++) {
            Programist p = new Programist();
            p.setName(strings.get(i)[0]);
            p.setSecondName(strings.get(i)[1]);
            p.setSalary(Double.valueOf(strings.get(i)[2]));
            p.setProgLang(strings.get(i)[3]);
            programists.add(p);
        }
    }
}
