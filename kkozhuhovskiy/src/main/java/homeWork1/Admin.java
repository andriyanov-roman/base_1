package homeWork1;

/**
 * Created by Kirill on 25.03.2015.
 */
public class Admin {

    public Admin(String name, String secondName, double salary, String gender, int age, String workingPlatform) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
        this.workingPlatform = workingPlatform;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWorkingPlatform() {
        return workingPlatform;
    }

    public void setWorkingPlatform(String workingPlatform) {
        this.workingPlatform = workingPlatform;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", workingPlatform='" + workingPlatform + '\'' +
                '}';
    }

    private String name;
    private String secondName;
    private double salary;
    private String gender;
    private int age;
    private String workingPlatform;
}
