package lessons.lesson_2;


import entity.Admin;
import entity.Manager;
import entity.Programmer;

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


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public ArrayList<Admin> getAdmins(){
        return admins;
    }
    public ArrayList<Programmer> getProgrammers(){
        return programmers;
    }
    public ArrayList<Manager> getManagers(){
        return managers;
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


