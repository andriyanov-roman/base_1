package entity;


import entity.staff.Admin;
import entity.staff.Manager;
import entity.staff.Programmer;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;
    private ArrayList <Admin> admins;
    private ArrayList <Programmer> programmers;
    private ArrayList <Manager> managers;


    public Company(String companyName, ArrayList<Employee> employees, ArrayList<Admin> admins,
                   ArrayList<Programmer> programmers, ArrayList<Manager> managers) {
        this.companyName = companyName;
        this.employees = employees;
        this.admins = admins;
        this.programmers = programmers;
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

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(ArrayList<Programmer> programmers) {
        this.programmers = programmers;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + employees +
                ", admins=" + admins +
                ", programmers=" + programmers +
                ", managers=" + managers +
                '}';
    }
}


