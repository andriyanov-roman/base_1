package entity;


import entity.Employee;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees;
    private ArrayList<Manager> managers;
    private ArrayList<Admin> admins;
    private ArrayList<Programmer> programmers;

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

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
