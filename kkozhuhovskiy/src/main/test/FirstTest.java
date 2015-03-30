import homeWork1.Company;
import homeWork1.CompanyUtil;
import homeWork1.Employee;
import homeWork1.EmployeeUtil;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstTest {

    @Test
    public void testCompanyC1() throws IOException {
        Company c1 = new Company();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        c1.setEmployees(new ArrayList<Employee>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        FileWriter writer = new FileWriter("src/SednaEmployees.txt", true);
        for (int i = 0; i < c1.getEmployees().size(); i++) {
            writer.write(c1.getEmployees().get(i).toString());
        }

        writer.flush();
        writer.close();

    }

}
