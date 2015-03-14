package homework.homework1;

/**
 * Created by user on 14.03.2015.
 */
public class OrgUtil {
    public static Organization[] getOrganizations() {
        Organization o1 = new Organization();
        o1.orgName = "C#";
        Employee[] employees = EmployeeUtil.getEmployees();
        o1.employees = new Employee[]{employees[0], employees[1], employees[9]};

        Organization o2 = new Organization();
        o1.orgName = "C++";
        Employee[] employees1 = EmployeeUtil.getEmployees();
        o2.employees = new Employee[]{employees1[2], employees1[4], employees1[6], employees1[8]};

        Organization o3 = new Organization();
        o1.orgName = "Java";
        Employee[] employees2 = EmployeeUtil.getEmployees();
        o3.employees = new Employee[]{employees2[3], employees2[5]};

        return new Organization[]{o1};
    }

    public static void checkOrgEmp(){
        Organization[] org = OrgUtil.getOrganizations();
        for (int i = 0; i < org.length; i++) {
            Employee temp = org[i].employees[0];
            for (int j = 0; j < org[i].employees.length; j++) {
                double salary = org[i].employees[j].salary;
                if (temp.salary > salary){
                    temp = org[i].employees[j];
                }
            }
            System.out.println(org[i].orgName + " " + temp.salary);
        }
    }
}
