package hometask2;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    public static Company[] getCompanies() {
        Employee[] employees = EmployeeUtil.getEmployees();

        Company c1 = new Company();
        c1.setCompanyName("Volvo");
        c1.setEmployees(new Employee[] {employees[0], employees[1], employees[2]});

        Company c2 = new Company();
        c2.setCompanyName( "ATB");
        c2.setEmployees(new Employee[]{employees[3], employees[4], employees[5]});

        Company c3 = new Company();
        c3.setCompanyName( "AZK");
        c3.setEmployees(new Employee[]{employees[6], employees[7], employees[8],employees[9],employees[10]});

        return new Company[]{c1, c2, c3};
    }

    public static void highSalary() {
        Company comps[] = CompanyUtil.getCompanies();
        System.out.println();
        for (int i = 0; i < comps.length; i++) {
            Employee temp = comps[i].getEmployees()[0];
            for (int j = 0; j < comps[i].getEmployees().length; j++) {
                if (temp.getSalary() < comps[i].getEmployees()[j].getSalary()) {
                    temp = comps[i].getEmployees()[j];
                }
            }
            System.out.println("Company \""+comps[i].getCompanyName() + "\". Higher salary: " + temp.getSalary() + "$. It gives " + temp.getName()+" "+temp.getSurname());
        }
    }
}
