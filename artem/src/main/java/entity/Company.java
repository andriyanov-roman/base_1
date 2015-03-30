package entity;

import entity.employeeHeirs.Admin;
import entity.employeeHeirs.Manager;
import entity.employeeHeirs.Programist;

import java.util.ArrayList;

public class Company { // Создаем класс-шаблон ("формочку для печенек")
    private String companyName; // Объявляем поле ("филд", "состояние", "параметр") класса
    private ArrayList<Admin> admins;
    private ArrayList<Programist> programists;
    private ArrayList<Manager> managers;
    private ArrayList<Employee> employees; // Объявляем еще одно поле класса. Их может быть сколько угодно
    // Поскольку поля класса "приватные", нам нужно обеспечить доступ к ним из других методов программы.
    // Доступ для чтения/изменения внутри класса-шаблона не зависит от модификатора (public/private)


    public ArrayList<Admin> getAdmins() { return admins; }
    public void setAdmins(ArrayList<Admin> admins) {this.admins = admins; }

    public ArrayList<Programist> getProgramists() {return programists; }
    public void setProgramists(ArrayList<Programist> programists) { this.programists = programists; }

    public ArrayList<Manager> getManagers() { return managers; }
    public void setManagers(ArrayList<Manager> managers) { this.managers = managers; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getCompanyName() { return companyName;}

    public void setEmployees(ArrayList<Employee> employees) { this.employees = employees; }
    public ArrayList<Employee> getEmployees() { return employees; }
}
