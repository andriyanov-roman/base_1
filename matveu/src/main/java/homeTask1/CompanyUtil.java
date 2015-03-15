package homeTask1;


public class CompanyUtil {
    public static Company[] getCompanies() {
        Company c1=new Company();
        Employee[] employees=EmployeesUtil.getEmployees();
        c1.setCompanyName("Luxsoft");
        c1.setEmployees(new Employee[] {employees[0],employees[1],employees[4],employees[5]});

        Company c2=new Company();
        c2.setCompanyName("Microsoft");
        c2.setEmployees(new Employee[] {employees[3],employees[2],employees[0],employees[1]});

        Company c3=new Company();
        c3.setCompanyName("Sony");
        c3.setEmployees(new Employee[] {employees[0],employees[1],employees[3],employees[5]});

        Company[] companies=new Company[3];
        companies[0]=c1;
        companies[1]=c2;
        companies[2]=c3;
        return companies;

    }

}
