package HomeTask5;

/**
 * Created by user on 23.03.2015.
 */
public class Employee {
    private double salary;
    private  String name;
    private  String secondName;
    private  int age;
    private  String sex;

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
    Employee (){}

    public String toString() {
        return name + " " + " " + secondName +
                ", salary=" + salary
                ;

    }
    public Employee (String name, String secondName, double salary, int age, String sex) {

        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
        this.age = age;
        this.sex = sex;

    }
}
