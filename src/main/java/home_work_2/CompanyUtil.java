package home_work_2;


import java.util.ArrayList;
import java.util.Arrays;

public class CompanyUtil {

    public static ArrayList<Company> getCompanies() {
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        Company c1 = new Company();
        c1.setEmployees(new ArrayList<>());
        c1.getEmployees().add(employees.get(0));
        c1.getEmployees().add(employees.get(1));
        c1.getEmployees().add(employees.get(2));
        c1.setCompanyName("Company TEst1");
        companies.add(c1);

        Company c2 = new Company();
        c2.setEmployees(new ArrayList<>());
        c2.setCompanyName("Company TEst2");
        c2.getEmployees().add(employees.get(3));
        c2.getEmployees().add(employees.get(4));
        c2.getEmployees().add(employees.get(5));

        Company c3 = new Company();
        c3.setEmployees(new ArrayList<>());
        c3.setCompanyName("Company TEst3");
        c3.getEmployees().add(employees.get(6));
        c3.getEmployees().add(employees.get(7));
        c3.getEmployees().add(employees.get(8));
        return new ArrayList<>(Arrays.asList(c1, c2, c3));
    }

    public static void getMaxSalary() {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            Employee temp = companies.get(i).getEmployees().get(0);
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                double salary = companies.get(i).getEmployees().get(j).getSalary();
                if (temp.getSalary() > salary) {
                    temp = companies.get(i).getEmployees().get(j);
                }
            }
            System.out.println(companies.get(i).getCompanyName() + " " + temp.getSalary());
        }
    }
}
