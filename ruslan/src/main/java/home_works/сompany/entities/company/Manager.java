package home_works.сompany.entities.company;

/**
 * Created by user on 17.04.2015.
 */
public class Manager extends Employee {
    private String projectName;

    public Manager() {
    }
    public Manager(Double salary, String gender, String projectName) {
        super(salary, gender);
        this.projectName = projectName;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    @Override
    public String toString() {
        return getName() + " " + getSecondName() + " " + getSalary() + " " + projectName;
    }
}
