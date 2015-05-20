import entity.Employee;
import entity.staff.Admin;
import entity.staff.Manager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Programmer on 18.05.2015.
 */
public class GenericsTests {

    public void writeToFile() {
        Admin e = new Admin();
        Manager m = new Manager();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e);
        employees.add(m);
    }


}
