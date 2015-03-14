package lesson_2;

/**
 * Created by Администратор on 14.03.2015.
 */
public class CompanyUtil {

    public static Company[] getCompanies() {
        Company c1 = new Company();
        Employee[] employees = EmployeeUtil.getEmployees();
        c1.employees = new Employee[]{employees[0], employees[1]};
        return new Company[]{c1};
    }
}
