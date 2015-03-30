package entity.employeeHeirs;

import entity.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Programist extends Employee{
    private String progLang;


    public Programist(String name, String secondName, double salary, String sex, int age, String progLang) {
        super(name, secondName, salary, sex, age);
        this.progLang = progLang;
    }

    public Programist(){} // Это конструктор ПО УМОЛЧАНИЮ, его нужно объявлять если создан искуственный конструктор

    public String getProgLang() { return progLang; }
    public void setProgLang(String progLang) { this.progLang = progLang; }

    @Override
    public String toString() { return name + " " + secondName + " " + salary + " " + progLang ; }


}
