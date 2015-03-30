package entities;

/**
 * Created by user on 23.03.2015.
 */
public class Manager extends Employee {
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": "+super.toString() + " | Curr.project: " + getProjectName();
    }

}
