package entities.company;

/**
 * Created by user on 23.03.2015.
 */
public class Manager extends Employee {
    private String projectName;

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
        return super.toString() + super.getSeparator() + getProjectName();
    }

}
