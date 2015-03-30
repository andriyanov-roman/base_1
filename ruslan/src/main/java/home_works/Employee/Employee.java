package home_works.Employee;

/**
 * Created by user on 23.03.2015.
 */
public class Employee {
    private String name;
    private String secondName;
    private String gender;
    private int age;
    private double salary;

    public Employee(String name, String secondName, double salary, String platform) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String secondName, int salary, String nameOfProject) {

    }

    public Employee(String name, String secondName, String gender, int age, double salary) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;

    }
}
