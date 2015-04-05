import entity.company.Employee;
import entity.company.employeeHeirs.Admin;
import entity.company.employeeHeirs.Manager;
import entity.company.employeeHeirs.Programist;
import inputOutput.CR;
import org.junit.Test;

import java.lang.Exception;
import java.util.ArrayList;


public class FirstTest {

    @Test
    // у тестовых методов нет аргументов на вход
    // тестовые методы обязательно должны быть void
    public void doSomething() throws Exception{
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<String[]> s;
        CR CR = new CR("src/main/java/files/positions/Admins.txt", ":");
        s = CR.readFromFile();
        for (int i = 0; i < s.size(); i++) {
            Admin a = new Admin();
            a.setName(s.get(i)[0]);
            a.setSecondName(s.get(i)[1]);
            a.setSalary(Double.valueOf(s.get(i)[2]));
            a.setPlatform(s.get(i)[3]);
            employees.add(a); // в коллекцию записывается ссылка на сущность???
            System.out.println(a);
        }
        CR = new CR("src/main/java/files/positions/Manager.txt", ":");
        s = CR.readFromFile();
        for (int i = 0; i < s.size(); i++) {
            Manager m = new Manager();
            m.setName(s.get(i)[0]);
            m.setSecondName(s.get(i)[1]);
            m.setSalary(Double.valueOf(s.get(i)[2]));
            m.setProjectName(s.get(i)[3]);
            employees.add(m);
            System.out.println(m);
        }
        CR = new CR("src/main/java/files/positions/Programists.txt", ":");
        s = CR.readFromFile();
        for (int i = 0; i < s.size(); i++) {
            Programist p = new Programist();
            p.setName(s.get(i)[0]);
            p.setSecondName(s.get(i)[1]);
            p.setSalary(Double.valueOf(s.get(i)[2]));
            p.setProgLang(s.get(i)[3]);
            employees.add(p);
            System.out.println(p);
        }
//        crw.writeToFile("src/main/java/files/test.txt", employees, false);
    }
}
