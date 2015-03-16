package home_task;


public class CompanyUtil {
    public static Company[] getCompanies() {
        Company c1 = new Company();
        c1.name = "FirsCompany";
        Company c2 = new Company();
        c2.name = "SecondName";
        Company c3 = new Company();
        c3.name = "ThirdCompany";
        Employee[] employees = EmployeeUtil.getEmployees();
        c1.employees = new Employee[]{employees[0], employees[1]};
        c2.employees = new Employee[]{employees[2]};
        c3.employees = new Employee[]{employees[3]};
        return new Company[]{c1, c2, c3};


    }

    public static void showEmployee() {
        Company[] empl = getCompanies();

        for (int i = 0; i < empl.length; i++) {
            for (int j = 0; j < empl[i].employees.length; j++) {
                System.out.println("Company: " + empl[i].name + " Employee :" + empl[i].employees[j].name);


            }

        }


    }

   /* public static void max() {
        Company[] companies = getCompanies();
        int i;
        int salaryMax = 0;
        String nameMax;
        Employee temp = companies[i].employees[0];
        for (i = 0; i < companies.length; i++) {
            for (int j = 0; j < companies[i].employees.length; j++) {
                int salary = companies[i].employees[j].salary;
                if (temp.salary > salary) {
                    temp = companies[i].employees[j];

                }


            }
        }


    }*/
}
