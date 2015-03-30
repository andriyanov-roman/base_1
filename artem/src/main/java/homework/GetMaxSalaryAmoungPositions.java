package homework;

import entity.Employee;
import entity.employeeHeirs.Admin;
import entity.employeeHeirs.Manager;
import entity.employeeHeirs.Programist;

import java.io.IOException;
import java.util.ArrayList;

import inputOutput.ReadWrite;

/**
 * Created by R-Tem on 30.03.2015.
 */
public class GetMaxSalaryAmoungPositions {
    public static void GetMaxSalaryAmoungPositions() throws IOException{
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<String[]> s;
        Admin a = new Admin();
        s = ReadWrite.readFromFile("artem/src/main/java/additionalFiles/positions/Admin.txt", ":");
        for (int i = 0; i < s.size(); i++) {
            a.setName(s.get(i)[0]);
            a.setSecondName(s.get(i)[1]);
            a.setSalary(Double.valueOf(s.get(i)[2]));
            a.setPlatform(s.get(i)[3]);
            employees.add(a);
        }
        Manager m = new Manager();
        s = ReadWrite.readFromFile("artem/src/main/java/additionalFiles/positions/Manager", ":");
        for (int i = 0; i < s.size(); i++) {
            m.setName(s.get(i)[0]);
            m.setSecondName(s.get(i)[1]);
            m.setSalary(Double.valueOf(s.get(i)[2]));
            m.setProjectName(s.get(i)[3]);
            employees.add(m);
        }
        Programist p = new Programist();
        s = ReadWrite.readFromFile("artem/src/main/java/additionalFiles/positions/Programists", ":");
        for (int i = 0; i < s.size(); i++) {
            p.setName(s.get(i)[0]);
            p.setSecondName(s.get(i)[1]);
            p.setSalary(Double.valueOf(s.get(i)[2]));
            p.setProgLang(s.get(i)[3]);
            employees.add(p);
        }
        for (int i = 0; i < employees.size(); i++) {
            ReadWrite.writeToFile("artem/src/main/java/additionalFiles/test", employees, true);
//            System.out.println(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " " + employees.get(i).getSalary() + " " + employees.get(i).getClass());
        }
    }
}
