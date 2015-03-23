package Lessons.LessonTwo.lesson_3;

/**
 * Created by user on 23.03.2015.
 */
public class Manager {

    private String name;
    private double salary;
    private String projectName;

    public Manager() {

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
