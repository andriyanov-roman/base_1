import entities.company.Admin;
import entities.company.Employee;
import entities.company.Manager;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Администратор on 11.04.2015.
 */
public class EmployeeTest {

    @Test
    public void getSalary() throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Manager());
        employees.add(new Admin());
        Employee e = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if(e.getSalary() > employees.get(i).getSalary()) {
                e = employees.get(i);
            }
        }
        if(e instanceof Manager) {
            System.out.println(((Manager) e).getTeamName());
        }
        int i = 0;
        Object o = new Object();

    }

}
