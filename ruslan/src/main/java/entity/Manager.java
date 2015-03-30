package entity;


import home_works.Employee.Employee;

public class Manager extends Employee {
    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public String nameOfProject;

    @Override
    public String toString() {
        return getName() + "  " + getSecondName() + "  " + getSalary() + "  " + getNameOfProject();
    }

    public Manager(String name, String secondName, int salary, String nameOfProject) {
        super(name, secondName, salary, nameOfProject);
        this.nameOfProject = nameOfProject;
    }


}




