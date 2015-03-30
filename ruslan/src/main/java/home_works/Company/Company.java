package home_works.Company;

import entity.Developer;
import entity.Manager;
import entity.SystemAdm;
import home_works.Employee.Employee;

import java.util.ArrayList;

/**
 * Created by user on 23.03.2015.
 */
    public class Company {
    public String companyName;
    public ArrayList<Employee> employees;

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    public ArrayList<SystemAdm> getSystemAdms() {
        return systemAdms;
    }

    public void setSystemAdms(ArrayList<SystemAdm> systemAdms) {
        this.systemAdms = systemAdms;
    }

    public ArrayList<Manager> managers;
    public ArrayList<Developer> developers;
    public ArrayList<SystemAdm> systemAdms;

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
}
