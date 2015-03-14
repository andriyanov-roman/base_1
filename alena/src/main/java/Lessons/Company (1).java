/**
 * Created by user on 15.01.2015.
 */
public class Company {
    public String companyName;
    public String address;
    public Employee[] employees;

    public void getEmployeeMaxSalary (Company[] companies) {
        for (int i = 0; i <companies.length ; i++) {
            for (int j = 0; j < companies[i].employees.length; j++) {
                System.out.println(companies[i].companyName + " " + companies[i].employees[j].name);
            }
        }
    }
}
