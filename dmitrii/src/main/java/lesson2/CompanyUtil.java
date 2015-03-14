package lesson2;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    public static Company[] getCompanies() {
        Employee[] employees = EmployeeUtil.getEmployees();

        Company c1 = new Company();
        c1.name = "Volvo";
        c1.employees = new Employee[]{employees[0], employees[1], employees[2]};

        Company c2 = new Company();
        c2.name = "ATB";
        c2.employees = new Employee[]{employees[3], employees[4], employees[5]};

        Company c3 = new Company();
        c3.name = "AZK";
        c3.employees = new Employee[]{employees[6], employees[7], employees[8]};

        return new Company[]{c1, c2, c3};
    }

    public static void highSalary() {
        Company comps[] = CompanyUtil.getCompanies();
        for (int i = 0; i < comps.length; i++) {
            Employee temp = comps[i].employees[0];
            for (int j = 0; j < comps[i].employees.length; j++) {
                if (temp.salary < comps[i].employees[j].salary) {
                    temp = comps[i].employees[j];
                }
            }
             System.out.println("Company \""+comps[i].name + "\". Higher salary: " + temp.salary + "$. It gives " + temp.name+" "+temp.surname);
        }
    }
}
