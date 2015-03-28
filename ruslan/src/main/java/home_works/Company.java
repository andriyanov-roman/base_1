package home_works;

import lesson_5.Developer;
import lesson_5.Manager;
import lesson_5.System_Adm;

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

    public ArrayList<System_Adm> getSystemAdms() {
        return systemAdms;
    }

    public void setSystemAdms(ArrayList<System_Adm> systemAdms) {
        this.systemAdms = systemAdms;
    }

    public ArrayList<Manager> managers;
    public ArrayList<Developer> developers;
    public ArrayList<System_Adm> systemAdms;

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
