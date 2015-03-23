package HomeTask5;

import java.util.ArrayList;

/**
 * Created by user on 23.03.2015.
 */
public class Company {
    public String companyName;
    public ArrayList<Manager> managers;
    public ArrayList<Programmer> programmers;
    public ArrayList<SysAdmin> sysAdmins;
    public ArrayList<Employee> employees;

    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(ArrayList<Programmer> programmers) {
        this.programmers = programmers;
    }

    public ArrayList<SysAdmin> getSysAdmins() {
        return sysAdmins;
    }

    public void setSysAdmins(ArrayList<SysAdmin> sysAdmins) {
        this.sysAdmins = sysAdmins;
    }
}
