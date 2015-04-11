package entity.staff;

import entity.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Manager extends Employee {

    private String projectName;

    public Manager(String name, String surname, double salary, int age, String sex, String projectName) {
        super(name, surname, salary, age, sex);
        this.projectName = projectName;
    }

    public Manager() {

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String toString() {
        return getName() + " " + getSurname() + " " + getSalary() + " " + projectName;
    }

}
