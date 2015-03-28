package lesson_5;


public class Manager {
    public String name;
    public String secondName;
    public double salary;

    public Manager(String name, String secondName, double salary, String projectName) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return name + secondName + salary +projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String projectName;
}
