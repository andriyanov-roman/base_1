package home_works.сompany.entities.company;

import java.util.ArrayList;

/**
 * Created by user on 17.04.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;
    private ArrayList<Admin> admins;
    private ArrayList<Developer> developers;
    private ArrayList<Manager> managers;

    public Company(String companyName, ArrayList<Employee> employees, ArrayList<Admin> admins, ArrayList<Developer> developers, ArrayList<Manager> managers) {
        this.companyName = companyName;
        this.employees = employees;
        this.admins = admins;
        this.developers = developers;
        this.managers = managers;
    }

    public Company() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    @Override
    public String toString() {
        return "company{" +
                "companyName='" + companyName + '\'' +
                ", Employees=" + employees +
                ", admins=" + admins +
                ", programmers=" + developers +
                ", managers=" + managers +
                '}';
    }
}
