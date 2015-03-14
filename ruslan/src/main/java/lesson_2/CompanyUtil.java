package lesson_2;


public class CompanyUtil {
    public static Company[] getCompanies() {
        Employee[] employees = EmployeeUtil.getEmployee();

        Company c1 = new Company();
        c1.companyName = "KLA";
        c1.employees = new Employee[]{employees[0], employees[1]};
        Company c2 = new Company();
        c2.companyName = "BLA";
        c2.employees = new Employee[]{employees[2], employees[3]};
        Company c3 = new Company();
        c3.companyName = "RZA";
        c3.employees = new Employee[]{employees[4]};
        getmaxSalary();
        return new Company[]{c1, c2, c3};
    }

    public static void getmaxSalary() { // находит сотрудника, с найбольшей зарплатой
        Company[] companies = getCompanies();
        for (int i = 0; i < companies.length; i++) {
            Employee temp = companies[i].getEmployees()[0];
            for (int j = 0; j < companies[i].employees.length; j++) {
                double salary = companies[i].employees[j].salary;
                if (temp.salary > salary) {
                    temp = companies[i].employees[j];
                }
            }
            System.out.println(companies[i].companyName + temp.salary);
        }
    }
}





