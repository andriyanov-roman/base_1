package home_task2;


public class Admin {
    private String name;
    private String secondName;
    private String sex;
    private int age;
    private double salary;
    private String workingPlatform;

    public Admin() {

    }

    public String toString() {
        return name + " " + " " + secondName + '\'' +
                ", sex=" + sex +
                ", age=" + age + '\'' + ", salary=" + salary + ", workingPlatform=" + workingPlatform +
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getWorkingPlatform() {
        return workingPlatform;
    }

    public void setWorkingPlatform(String workingPlatform) {
        this.workingPlatform = workingPlatform;
    }

    public Admin(String name, String secondName, String sex, int age, double salary, String workingPlatform) {
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
        this.workingPlatform = workingPlatform;
    }
}
