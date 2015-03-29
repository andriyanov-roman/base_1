package homeWork1;

/**
 * Created by Kirill on 28.03.2015.
 */
public class Manager {

    public Manager(String name, String secondName, double salary, String gender, int age, String nameOfProject) {
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
        this.nameOfProject = nameOfProject;
    }

    private String name;
    private String secondName;
    private double salary;
    private String gender;
    private int age;
    private String nameOfProject;

    @Override
    public String toString() {
        return "Maneger{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nameOfProject='" + nameOfProject + '\'' +
                '}';
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

    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }
}


