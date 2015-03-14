package lesson2;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {

    public static Company[] getCompanies() {
        Employee[] employees = EmployeeUtil.getEmployees();
        Company c1 = new Company("Microsoft", new Employee[] {employees[0],employees[1],employees[2]} );
        Company c2 = new Company("Apple", new Employee[] {employees[3],employees[4],employees[5]} );
        Company c3 = new Company("IBM", new Employee[] {employees[6],employees[7],employees[8]} );
/*
        Company c1 = new Company();
        c1.name ="Microsoft";
        c1.employees = new Employee[] {employees[0],employees[1],employees[2]};

        Company c2 = new Company();
        c2.name = "Apple";
        c2.employees = new Employee[] {employees[3],employees[4],employees[5]};

        Company c3 = new Company();
        c3.name = "IBM";
        c3.employees = new Employee[] {employees[6],employees[7],employees[8]};
*/
        return new Company[] {c1,c2,c3};

    }
/*
    public static void showBiggestSallaries() {
        Company[] companies = getCompanies();
        for (int i=0;i<companies.length;i++){
            System.out.println(companies[i].getCompanyName(););
            double salary = 0;
            for (int j=0;j<companies[i].employees.length;j++){
                if (salary < companies[i].employees[j].salary) {
                    salary = companies[i].employees[j].salary;
                }
            }

            System.out.println(salary);

        }
    }
*/
    /*
    public static void showSearchName(String searchString) {
        Company[] companies = getCompanies();
        for (int i=0;i<companies.length;i++){
            double salary = 0;
            for (int j=0;j<companies[i].employees.length;j++){
                if (companies[i].employees[j].name.indexOf(searchString)!= -1 || companies[i].employees[j].secondName.indexOf(searchString)!= -1 ) {
                    System.out.println(companies[i].companyName + " "+ companies[i].employees[j].secondName+  " "+ companies[i].employees[j].name );
                }
            }



        }
    }
*/
}
