package data;

        import homeWork1.Company;
        import homeWork1.CompanyUtil;
        import homeWork1.Employee;
        import homeWork1.EmployeeUtil;

        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Calendar;
        import java.util.Date;

/**
 * Created by Programmer on 11.05.2015.
 */
public class DataTest {
    public static void main(String[] args) throws IOException {
        Calendar calendar = Calendar.getInstance();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        ArrayList<Company> companies = CompanyUtil.getCompany();
        Employee employee22 = new Employee("Jerr", "Ser", 1212, "male", 22);
       /* employee22.setDateOfEmploeement(2009,Calendar.JULY, 1, 9, 00);
*/
        /*employee.setName("DataTest");
        employee.setAge(22);
        employee.setGender("male");
        employee.setSalary(12000.222);
        employee.setSecondName("Vaska");
        employee.setDateOfEmploeement(2009,Calendar.JULY, 1, 9, 00);*/






    }

}




