package Lessons.LessonTwo.lesson_3;

import entity.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Manager extends Employee {
    private String projectName;

    public Manager(String name, String secondName, double salary, String sex, int age, String projectName) {
        super(name, secondName,salary, sex, age);
        this.projectName = projectName;

    }
    public Manager (){

    }


    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

}