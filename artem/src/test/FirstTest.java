import entity.Employee;
import entity.employeeHeirs.Admin;
import entity.employeeHeirs.Manager;
import entity.employeeHeirs.Programist;
import inputOutput.ReadWrite;
import org.junit.Test;

import java.io.IOException;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstTest {

    @Test
    // у тестовых методов нет аргументов на вход
    // тестовые методы обязательно быть void
    public void doSomething() throws Exception{
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<String[]> s;
        s = ReadWrite.readFromFile("src/main/java/additionalFiles/positions/Admin.txt", ":");
        for (int i = 0; i < s.size(); i++) {
            Admin a = new Admin();
            a.setName(s.get(i)[0]);
            a.setSecondName(s.get(i)[1]);
            a.setSalary(Double.valueOf(s.get(i)[2]));
            a.setPlatform(s.get(i)[3]);
            employees.add(a); // в коллекцию записывается ссылка на сущность???
            System.out.println(a);
        }
        s = ReadWrite.readFromFile("src/main/java/additionalFiles/positions/Manager.txt", ":");
        for (int i = 0; i < s.size(); i++) {
            Manager m = new Manager();
            m.setName(s.get(i)[0]);
            m.setSecondName(s.get(i)[1]);
            m.setSalary(Double.valueOf(s.get(i)[2]));
            m.setProjectName(s.get(i)[3]);
            employees.add(m);
            System.out.println(m);
        }
        s = ReadWrite.readFromFile("src/main/java/additionalFiles/positions/Programists.txt", ":");
        for (int i = 0; i < s.size(); i++) {
            Programist p = new Programist();
            p.setName(s.get(i)[0]);
            p.setSecondName(s.get(i)[1]);
            p.setSalary(Double.valueOf(s.get(i)[2]));
            p.setProgLang(s.get(i)[3]);
            employees.add(p);
            System.out.println(p);
        }
        ReadWrite.writeToFile("src/main/java/additionalFiles/test.txt", employees, false);
    }
}
