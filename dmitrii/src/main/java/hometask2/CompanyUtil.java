package hometask2;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    public static Company[] getCompanies() {
        hometask2.Employee[] employees = EmployeeUtil.getEmployees();

        hometask2.Company c1 = new hometask2.Company();
        c1.setCompanyName("Volvo");
        c1.setEmployees(new Employee[] {employees[0], employees[1], employees[2]});

        hometask2.Company c2 = new hometask2.Company();
        c2.setCompanyName( "ATB");
        c2.setEmployees(new Employee[]{employees[3], employees[4], employees[5]});

        hometask2.Company c3 = new hometask2.Company();
        c3.setCompanyName( "AZK");
        c3.setEmployees(new Employee[]{employees[6], employees[7], employees[8]});

        return new Company[]{c1, c2, c3};
    }

    public static void highSalary() {
        hometask2.Company comps[] = CompanyUtil.getCompanies();
        for (int i = 0; i < comps.length; i++) {
            Employee temp = comps[i].getEmployees()[0];
            for (int j = 0; j < comps[i].getEmployees().length; j++) {
                if (temp.salary < comps[i].getEmployees()[j].salary) {
                    temp = comps[i].getEmployees()[j];
                }
            }
             System.out.println("Company \""+comps[i].getCompanyName() + "\". Higher salary: " + temp.salary + "$. It gives " + temp.name+" "+temp.surname);
        }
    }
}
