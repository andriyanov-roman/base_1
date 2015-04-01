package entity;

import lessons.lesson_2.Employee;

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

    @Override
    public String toString() {
        return "Manager.txt{" +
                "projectName='" + projectName + '\'' +
                '}';
    }
}
