package home_works.company.entities.company;

/**
 * Created by user on 30.03.2015.
 */
public class Manager extends Employee {


    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public String nameOfProject;

    public Manager(String name, String secondName, double salary, String nameOfProject) {
        super(name, secondName, salary, nameOfProject);
        this.nameOfProject = nameOfProject;
    }

    @Override
    public String toString() {
        return getName()+ getSecondName() + getSalary() + getNameOfProject();
    }
}
