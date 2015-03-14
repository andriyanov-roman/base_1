package lesson_2;

/**
 * Created by Администратор on 14.03.2015.
 */
public class CompanyUtil {

    public static Company[] getCompanies() {
        Employee[] employees = EmployeeUtil.getEmployees();

        Company c1 = new Company();
        c1.employees = new Employee[]{employees[0], employees[1]};
        c1.companyName = "Company TEst1";

        Company c2 = new Company();
        c2.employees = new Employee[]{employees[2], employees[3]};
        c2.companyName = "Company TEst2";

        Company c3 = new Company();
        c3.employees = new Employee[]{employees[4], employees[5]};
        c3.companyName = "Company TEst3";
        return new Company[]{c1};
    }

    public static void getMaxSalary() {
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            Employee temp = companies[i].employees[0];
            for (int j = 0; j < companies[i].employees.length; j++) {
                double salary = companies[i].employees[j].salary;
                if(temp.salary > salary) {
                    temp = companies[i].employees[j];
                }
            }
            System.out.println(companies[i].companyName + " " + temp.salary);
        }
    }
}
