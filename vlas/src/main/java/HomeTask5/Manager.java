package HomeTask5;

/**
 * Created by user on 23.03.2015.
 */
public class Manager {
    private  String projectName;
    private Double salary;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getLanguage() {
        return projectName;
    }

    public void setLanguage(String platform) {
        this.projectName = platform;
    }
}
