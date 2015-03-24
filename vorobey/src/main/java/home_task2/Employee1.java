package home_task2;


public class Employee1 {
    private String name;
    private String secondName;
    private double salary;
    private int age;
    private String sex;


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


    Employee1() {

    }

    @Override
    public String toString() {
        return name + " " + " " + secondName + '\'' +
                ", sex=" + sex +
                ", age=" + age + '\'' + ", salary=" + salary +
                "";

    }

    public Employee1(String name, String secondName, int salary, int age, String sex) {

        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.age = age;

    }
}
