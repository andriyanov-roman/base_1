package entities.company;

/**
 * Created by user on 23.03.2015.
 */
public class Manager extends Employee {
    private String projectName;

    public Manager() {
    }

    public Manager(Employee e, String projectName) {
        super(e.getName(), e.getSurname(), e.getSalary(), Boolean.valueOf(e.getGender()), e.getAge());
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
        return super.toString() + getSeparator() + getProjectName();
    }

}
