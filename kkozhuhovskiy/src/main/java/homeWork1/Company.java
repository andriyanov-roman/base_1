package homeWork1;

import java.util.ArrayList;

/**
 * Created by Kirill on 14.03.2015.
 */
public class Company {

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", Employees=" + employees +
                ", managers=" + managers +
                ", admins=" + admins +
                ", programmers=" + programmers +
                '}';
    }

    private String companyName;
    public ArrayList <Employee> employees;
    public ArrayList<Manager> managers;
    public ArrayList<Admin> admins;
    public ArrayList<Programmer> programmers;


    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(ArrayList<Programmer> programmers) {
        this.programmers = programmers;
    }


    public void setCompanyName (String companyName){

        this.companyName = companyName;
    }
    public String getCompanyName(){
        return companyName;
    }


}
