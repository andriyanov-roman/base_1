package home_task2;


public class Manager {
    private String name;
    private String secondName;
    private String sex;
    private int age;
    private double salary;
    private String projectName;

    public Manager() {

    }

    public String toString() {
        return name + " " + " " + secondName + '\'' +
                ", sex=" + sex +
                ", age=" + age + '\'' + ", salary=" + salary + ", projectName=" + projectName +
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public Manager(String name, String secondName, String sex, int age, double salary, String projectName) {
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
        this.projectName = projectName;
    }
}
